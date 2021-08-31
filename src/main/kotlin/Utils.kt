
import java.util.*
import kotlin.collections.ArrayList

//cabecalho
val imprimeCabecalhoNotaFiscal: () -> Unit  = { println("########## DH SuperMarket ##########") }

//data da compra
val retornaDataAtualDaCompra: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}"
}

//lista de produtos
val imprimeListaDeProdutos: (lista: ArrayList<Produto>) -> Unit = {
    for (produto in it) {
        println("${produto.nome} R$${produto.preco}")
    }
}

//rodapé
val calculaTotalDeProdutos: (lista: ArrayList<Produto>) -> Double = {
    var total = 0.0
    for (produto in it) {
        total += produto.preco
    }
    total
}
