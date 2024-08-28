package services

import models.Atributos

interface RacaStrategy {
    fun aplicarBonus(atributos: Atributos)
}
