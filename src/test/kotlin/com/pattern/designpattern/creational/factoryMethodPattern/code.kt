package com.pattern.designpattern.creational.factoryMethodPattern

interface Transport {
    fun deliver() : String
}

class Truck : Transport{
    override fun deliver(): String = "Truck Transport"
}

class Ship : Transport{
    override fun deliver(): String = "Ship Transport"
}

class TransportFactory{
    companion object {
        fun createTransportation(type: String) = when (type) {
            "truck" -> Truck()
            "ship" -> Ship()
            else -> throw IllegalArgumentException("Unknown Transport")
        }
    }
}

class DeliveryService{
    fun delivery(type : String){
        val transport = TransportFactory.createTransportation(type)
        println(transport.deliver())
    }
}

fun main() {
    DeliveryService().delivery("truck")
}