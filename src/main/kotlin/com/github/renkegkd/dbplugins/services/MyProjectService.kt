package com.github.renkegkd.dbplugins.services

import com.intellij.openapi.project.Project
import com.github.renkegkd.dbplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
