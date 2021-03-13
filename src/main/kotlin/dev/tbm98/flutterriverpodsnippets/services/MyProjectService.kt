package dev.tbm98.flutterriverpodsnippets.services

import com.intellij.openapi.project.Project
import dev.tbm98.flutterriverpodsnippets.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
