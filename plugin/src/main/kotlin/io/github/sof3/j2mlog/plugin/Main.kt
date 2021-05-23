package io.github.sof3.j2mlog.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginConvention

class Main : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("j2mlog") { task ->
            task.dependsOn("classes")
            task.doLast {
                val convention = project.convention.getPlugin(JavaPluginConvention::class.java)
                val allClassesPath = convention.sourceSets.getByName("main").runtimeClasspath.files
                    .filter { it.exists() }
                    .map { it.absolutePath }

                val projectClassesPath = convention.sourceSets.getByName("main").output.classesDirs.files
                val projectClasses = mutableListOf<String>()
                for (path in projectClassesPath) {
                    for(file in path.walkTopDown().asIterable()) {
                        if(file.extension == "class") {
                            val pkg = file.parentFile.relativeTo(path)
                            val pkgName = pkg.path.replace('/', '.')
                            val name = "${pkgName}.${file.nameWithoutExtension}"
                            projectClasses.add(name)
                        }
                    }
                }

                TODO()
            }
        }
    }
}
