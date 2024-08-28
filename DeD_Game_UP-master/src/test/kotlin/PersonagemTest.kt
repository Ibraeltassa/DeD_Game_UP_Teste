import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import models.Anao
import models.Atributos
import models.Personagem

class PersonagemTest {

    @Test
    fun `calculo dos pontos de vida`() {
        val atributos = Atributos(constituicao = 14)
        val personagem = Personagem(
            nome = "Gimli",
            raca = Anao(),
            forca = 10,
            destreza = 10,
            constituicao = atributos.constituicao,
            inteligencia = 10,
            sabedoria = 10,
            carisma = 10
        )
        personagem.aplicarBonusRacial()

        val expectedPontosDeVida = 12 // 10 + modificador de constituicao (+2)
        assertEquals(expectedPontosDeVida, personagem.pontosDeVida)
    }
}
