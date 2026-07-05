package eu.cisodiagonal.leveltone

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import java.util.Locale

/**
 * Self-contained per-app language override. No AppCompat dependency: the chosen
 * BCP-47 tag is stored in SharedPreferences and applied in [wrap] from the
 * activity's attachBaseContext, so it works on every API level from 24 up.
 *
 * An empty tag means "follow the system locale" (no override).
 */
object LocaleHelper {
    private const val PREFS = "settings"
    private const val KEY_LANG = "lang_tag"

    /**
     * BCP-47 tags for every locale we ship string resources for. The tags map
     * onto the res qualifiers (e.g. "id" -> values-in, "he" -> values-iw,
     * "pt-BR" -> values-pt-rBR, "zh-CN" -> values-zh-rCN) because Locale folds
     * modern tags onto Android's legacy qualifiers automatically.
     */
    val LANGUAGE_TAGS = listOf(
        "",            // system default
        "ar", "cs", "da", "de", "el", "es", "fa", "fi", "fr", "hi",
        "hu", "id", "it", "he", "ja", "ko", "nb", "nl", "pl", "pt-BR",
        "ro", "ru", "sv", "th", "tr", "uk", "vi", "zh-CN", "zh-TW",
    )

    private fun prefs(ctx: Context) =
        ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    /** Currently persisted tag, or "" for system default. */
    fun savedTag(ctx: Context): String = prefs(ctx).getString(KEY_LANG, "") ?: ""

    /** Persist the choice. Caller should recreate the activity to apply it. */
    fun save(ctx: Context, tag: String) {
        prefs(ctx).edit().putString(KEY_LANG, tag).apply()
    }

    /**
     * Unwrap a (possibly themed) Compose context to its host Activity.
     * LocalContext.current is often a ContextThemeWrapper, so a plain
     * `as? Activity` cast returns null and recreate() would silently no-op.
     */
    fun findActivity(ctx: Context): Activity? {
        var c: Context? = ctx
        while (c is ContextWrapper) {
            if (c is Activity) return c
            c = c.baseContext
        }
        return null
    }

    /** Wrap a base context so its resources resolve to the saved locale. */
    fun wrap(ctx: Context): Context {
        val tag = savedTag(ctx)
        if (tag.isEmpty()) return ctx
        val locale = Locale.forLanguageTag(tag)
        Locale.setDefault(locale)
        val config = Configuration(ctx.resources.configuration)
        config.setLocale(locale)
        return ctx.createConfigurationContext(config)
    }

    /** Autonym for a tag, e.g. "Deutsch", "português (Brasil)" — capitalized. */
    fun displayName(tag: String): String {
        val locale = Locale.forLanguageTag(tag)
        val name = locale.getDisplayName(locale)
        return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }
    }
}
