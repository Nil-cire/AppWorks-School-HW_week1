package com.homework.week1


fun main() {
    val npc2 = Mage("Raistlin", "yes")
    npc2.attack()
    npc2.manaCheckFlag()
}


class Mage(name: String, mana: String = "no") : Human(name, mana) {
    override fun attack() {
        println("$name use Fireball!")
    }
}


