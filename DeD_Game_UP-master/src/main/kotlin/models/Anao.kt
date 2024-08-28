package models

import services.RacaStrategy // Adicione esta importação

class Anao : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        // Anões recebem +2 em Constituição
        val bonus = mapOf(
            "constituicao" to 2
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
