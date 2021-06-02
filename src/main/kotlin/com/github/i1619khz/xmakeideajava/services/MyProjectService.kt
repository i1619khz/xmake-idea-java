package com.github.i1619khz.xmakeideajava.services

import com.github.i1619khz.xmakeideajava.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
