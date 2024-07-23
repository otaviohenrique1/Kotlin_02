package alugames.modelo

import org.example.alugames.modelo.Jogo
import org.example.br.com.alura.alugames.modelo.Gamer

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo
) {
    override fun toString(): String {
        return "Aluguel do ${jogo.titulo} por ${gamer.nome}"
    }
}
