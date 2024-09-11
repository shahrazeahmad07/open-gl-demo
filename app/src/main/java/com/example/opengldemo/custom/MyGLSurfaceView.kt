package com.example.opengldemo.custom

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet

class MyGLSurfaceView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null) : GLSurfaceView(context, attributeSet) {
    private val renderer: MyGLSurfaceRenderer

    init {
        setEGLContextClientVersion(2)
        renderer = MyGLSurfaceRenderer(context)
        setRenderer(renderer)
//        renderMode = RENDERMODE_WHEN_DIRTY
    }
}