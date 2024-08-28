package models

import services.RacaStrategy
import services.Elfo
import services.Humano
import models.Anao

class Personagem(
    val nome: String,
    val raca: RacaStrategy,
    var forca: Int,
    var destreza: Int,
    var constituicao: Int,
    var inteligencia: Int,
    var sabedoria: Int,
    var carisma: Int
) {
    // Modificador de Constituição
    private val modificadorConstituicao: Int
        get() = (constituicao - 10) / 2

    // Cálculo dos pontos de vida (10 + modificador de Constituição)
    val pontosDeVida: Int
        get() = 10 + modificadorConstituicao

    // Aplica o bônus racial
    fun aplicarBonusRacial() {
        val atributos = Atributos(forca, destreza, constituicao, inteligencia, sabedoria, carisma)
        raca.aplicarBonus(atributos)

        // Atualiza os atributos do personagem
        forca = atributos.forca
        destreza = atributos.destreza
        constituicao = atributos.constituicao
        inteligencia = atributos.inteligencia
        sabedoria = atributos.sabedoria
        carisma = atributos.carisma
    }

    // Função para exibir os bônus raciais aplicados
    fun mostrarBonusRacial() {
        println("\nBônus Racial Aplicado:")

        when (raca) {
            is Elfo -> println("Destreza: +2")
            is Humano -> {
                println("Força: +1")
                println("Destreza: +1")
                println("Constituição: +1")
                println("Inteligência: +1")
                println("Sabedoria: +1")
                println("Carisma: +1")
            }
            is Anao -> println("Constituição: +2")
            is Orc -> {
                println("Força: +2")
                println("Constituição: +1")
            }
            is Gnomo -> {
                println("Inteligência: +2")
            }
            is MeioElfo -> {
                println("Carisma: +2")
            }
        }
    }

}
