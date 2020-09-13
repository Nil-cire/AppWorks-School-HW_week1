package com.homework.week1


fun main() {
    val npc1 = Human("Tyson")
    npc1.attack()
    npc1.manaCheckFlag()

    val npc3 = Mage("Raistlin", "yes")
    npc3.attack()
    npc3.manaCheckFlag()
}


open class Human(val name: String, var mana: String = "no") {

    open fun attack() {
        println("$name use Fist Attack!")
    }

    fun manaCheckFlag() {
        if (mana != "yes") {
            println("$name does not have Mana!")
        } else {
            println("$name has Mana!")
        }

    }


}


