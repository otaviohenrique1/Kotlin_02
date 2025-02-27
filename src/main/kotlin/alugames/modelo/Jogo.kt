package org.example.alugames.modelo

import alugames.modelo.Recomendavel
import com.google.gson.annotations.Expose

data class Jogo(
    @Expose val titulo: String,
    @Expose val capa: String
): Recomendavel {
    var descricao: String? = ""
    var preco = 0.0
    private val listaNotas = mutableListOf<Int>()

    override val media: Double
        get() = listaNotas.average()

    constructor(titulo: String, capa: String, preco: Double, descricao: String):
            this(titulo, capa) {
        this.preco = preco
        this.descricao = descricao
    }

    override fun recomendar(nota: Int) {
        listaNotas.add(nota)
    }

    override fun toString(): String {
        return "Meu Jogo\n" +
                "Título: $titulo\n" +
                "Capa: $capa\n" +
                "Descrição: $descricao" +
                "Preço: $preco"
    }
}