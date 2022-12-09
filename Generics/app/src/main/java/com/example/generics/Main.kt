package com.example.generics

fun main() { // Generics are a compile-time feature, they don't make it to the runtime

    val footballPlayer = FootballPlayer("Football Player")
    val baseballPlayer = BaseballPlayer("Baseball Player")

    val footballPlayer2 = FootballPlayer("Football Player 2")
    val baseballPlayer2 = BaseballPlayer("Baseball Player 2")

    val footballTeam = Team("Football team", mutableListOf(footballPlayer))
    val baseballTeam = Team("Baseball team", mutableListOf(baseballPlayer))

    footballTeam.addPlayers(footballPlayer2)
    baseballTeam.addPlayers(baseballPlayer2)
}

// Upper bound defining that any type T needs to inhertit from tipe Player
class Team<T: Player>(val name: String, val players: MutableList<T>) {
    fun addPlayers(player: T) {
        if (!players.contains(player)) {
            players.add(player)
            println("Player ${player.name} was added to the team ${this.name}")
        } else {
            println("Player ${player.name} is already in the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)