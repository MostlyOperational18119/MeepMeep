package com.noahbres.meepmeep.core.ui

import java.awt.Canvas
import java.awt.Dimension
import java.awt.image.BufferStrategy

class MainCanvas(private var internalWidth: Int, private var internalHeight: Int): Canvas() {
    lateinit var bufferStrat: BufferStrategy

    init {
        setBounds(0, 0, internalWidth, internalHeight)
        preferredSize = Dimension(internalWidth, internalHeight)
        ignoreRepaint = true
    }

    fun start() {
        createBufferStrategy(2)
        bufferStrat = bufferStrategy

        requestFocus()
    }

    override fun getPreferredSize(): Dimension {
        return Dimension(internalWidth, internalHeight)
    }
}
