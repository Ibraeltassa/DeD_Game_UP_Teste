package services

import models.Atributos

class Elfo : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        val bonus = mapOf(
            "destreza" to 2
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
