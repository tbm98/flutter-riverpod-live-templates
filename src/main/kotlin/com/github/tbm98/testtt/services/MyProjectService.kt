package com.github.tbm98.testtt.services

import com.intellij.openapi.project.Project
import com.github.tbm98.testtt.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
