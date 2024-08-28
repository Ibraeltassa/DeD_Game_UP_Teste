package models

import services.RacaStrategy

class Orc : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        val bonus = mapOf(
            "forca" to 2,
            "constituicao" to 1,
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
