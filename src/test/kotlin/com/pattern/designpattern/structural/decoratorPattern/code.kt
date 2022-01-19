package com.pattern.designpattern.structural.decoratorPattern

import java.security.Principal

interface ChristmasTree {
    fun decorate() : String
}

class PineChristmasTree: ChristmasTree{
    override fun decorate() = "Pine ChristmasTree"
}

abstract class TreeDecorator(private val tree: ChristmasTree):ChristmasTree{
    override fun decorate(): String = tree.decorate()
}

class BubbleLights(tree: ChristmasTree) : TreeDecorator(tree){
    override fun decorate(): String = "${super.decorate()}${decorateWithBubbleLights()}"
    private fun decorateWithBubbleLights() : String = " with Bubble Lights"
}

class Tinsel(tree:ChristmasTree) : TreeDecorator(tree){
    override fun decorate(): String = "${super.decorate()}${decorateWithTinsel()}"
    private fun decorateWithTinsel() : String = " with Tinsel"
}

class Star(tree:ChristmasTree) : TreeDecorator(tree){
    override fun decorate(): String = "${super.decorate()}${decorateWithStar()}"
    private fun decorateWithStar() : String = " with Star"
}

fun main() {
    val tree = BubbleLights(Tinsel(PineChristmasTree()))
    println(tree.decorate())

    val tree2 = Star(BubbleLights(PineChristmasTree()))
    println(tree2.decorate())
}