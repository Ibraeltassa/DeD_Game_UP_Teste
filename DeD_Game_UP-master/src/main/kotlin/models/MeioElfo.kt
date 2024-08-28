package models

import services.RacaStrategy

class MeioElfo : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        val bonus = mapOf(
            "carisma" to 2
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
