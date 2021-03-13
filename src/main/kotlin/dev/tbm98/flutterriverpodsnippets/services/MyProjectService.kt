package dev.tbm98.flutterriverpodsnippets.services

import dev.tbm98.flutterriverpodsnippets.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
