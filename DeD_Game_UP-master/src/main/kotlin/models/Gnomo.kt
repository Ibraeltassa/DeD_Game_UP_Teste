package models

import services.RacaStrategy

class Gnomo : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        val bonus = mapOf(
            "inteligencia" to 2
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
