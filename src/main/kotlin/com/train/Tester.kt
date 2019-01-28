package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var ticket :Int
    var roundticket :Int
    while(true){
        print("Please enter number of tickets: ")
        ticket = scanner.nextInt()
        if(ticket > 0){
            break
        }
    }
    while(true){
        print("How many round-trip tickets: ")
        roundticket = scanner.nextInt()
        if (roundticket <= ticket){
            break
        }
    }
    val money =Ticket2(ticket,roundticket)
    money.print()
}

class Ticket2(var ticket : Int,var roundticket : Int){
    fun print(){
        val Total :Int = ((ticket-roundticket)*1000 + roundticket*2000*0.9).toInt()
        println("Total tickets:" + ticket)
        println("Round-trip:" + roundticket)
        println("Total:" + Total)
    }
}