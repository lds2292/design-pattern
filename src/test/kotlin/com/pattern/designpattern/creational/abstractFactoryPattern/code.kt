package com.pattern.designpattern.creational.abstractFactoryPattern

interface Chair{
    fun hasLegs()
    fun sitOn()
}
interface CoffeeTable
interface Sofa

class VictorianChair(val name : String) : Chair{
    override fun hasLegs() {

    }

    override fun sitOn() {
        TODO("Not yet implemented")
    }
}
// class ModernChair(val name : String) : Chair

class VictorianCoffeeTable : CoffeeTable
class ModernCoffeeTable : CoffeeTable

class VictorianSofa : Sofa
class ModernSofa : Sofa


interface FurnitureFactory{
    fun createChair()
    fun createCoffeeTable()
    fun createSofa()
}
class VictorianFurnitureFactory : FurnitureFactory{
    override fun createChair() {
        TODO("Not yet implemented")
    }

    override fun createCoffeeTable() {
        TODO("Not yet implemented")
    }

    override fun createSofa() {
        TODO("Not yet implemented")
    }
}
class ModernFurnitureFactory : FurnitureFactory{
    override fun createChair() {
        TODO("Not yet implemented")
    }

    override fun createCoffeeTable() {
        TODO("Not yet implemented")
    }

    override fun createSofa() {
        TODO("Not yet implemented")
    }
}

class Client(
    private val factory: FurnitureFactory
){
    fun someOperation(){
    }
}

fun main() {
//    val client = Client(VictorianFurnitureFactory())
    val client = Client(ModernFurnitureFactory())
    client.someOperation()
}