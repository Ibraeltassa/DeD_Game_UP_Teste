package services

import models.Atributos
import services.RacaStrategy // Certifique-se de que a importação está correta

class Humano : RacaStrategy {
    override fun aplicarBonus(atributos: Atributos) {
        // Humanos recebem +1 em todos os atributos
        val bonus = mapOf(
            "forca" to 1,
            "destreza" to 1,
            "constituicao" to 1,
            "inteligencia" to 1,
            "sabedoria" to 1,
            "carisma" to 1
        )
        atributos.aplicarBonusRacial(bonus)
    }
}
