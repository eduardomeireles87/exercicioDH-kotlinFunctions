fun main() {

val feijao = Produto("feijão", 2.40)
val arroz = Produto("arroz", 10.00)
val pastaDeDente = Produto("pasta de dente", 5.00)
val hamburguerVegano = Produto("Hamburger Vegano", 25.00)

val carrinhoDeCompras = carrinhoDeCompras()
carrinhoDeCompras.adicionarProduto(feijao)
carrinhoDeCompras.adicionarProduto(arroz)
carrinhoDeCompras.adicionarProduto(pastaDeDente)
carrinhoDeCompras.adicionarProduto(hamburguerVegano)

    val caixa = Caixa()
    caixa.fechamentoDaConta(
        cabecalhoNotaFiscal = { imprimeCabecalhoNotaFiscal },
        dataDaCompra = { retornaDataAtualDaCompra() },
        listaDeProdutos = carrinhoDeCompras.listaDeProdutos,
        imprimeListaDeCompras = { imprimeListaDeProdutos(carrinhoDeCompras.listaDeProdutos) },
        adicionaRodape = { calculaTotalDeProdutos(carrinhoDeCompras.listaDeProdutos) }
    )

}