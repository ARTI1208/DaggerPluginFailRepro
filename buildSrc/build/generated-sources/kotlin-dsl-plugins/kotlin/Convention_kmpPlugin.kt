/**
 * Precompiled [convention.kmp.gradle.kts][Convention_kmp_gradle] script plugin.
 *
 * @see Convention_kmp_gradle
 */
public
class Convention_kmpPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_kmp_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
