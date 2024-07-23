package alugames.principal

import org.example.br.com.alura.alugames.servico.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogoJson = consumo.buscaJogosJson()
//    println(listaGamers)
//    println(listaJogoJson)
    val gamer1 = listaGamers.get(3)
    val jogo1 = listaJogoJson.get(10)
    println(gamer1)
    println(jogo1)
}