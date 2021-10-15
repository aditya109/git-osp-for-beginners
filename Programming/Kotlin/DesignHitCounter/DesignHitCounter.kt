package com.example.testapp

fun main(){
    //Making an input as the question suggests doesn't really make any sense.
    val hitCounter = HitCounter()
    hitCounter.hit(1)
    hitCounter.hit(2)
    hitCounter.hit(3)
    println(hitCounter.getHits(4))
    hitCounter.hit(300)
    println(hitCounter.getHits(300))
    println(hitCounter.getHits(301))
}

class HitCounter {
    private val hits = arrayListOf<Int>()

    fun hit(timestamp: Int) = hits.add(timestamp)

    fun getHits(timestamp: Int) : Int = hits.count {
        it in (timestamp - 300 + 1)..timestamp
    }
}