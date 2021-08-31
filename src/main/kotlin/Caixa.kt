import java.util.ArrayList

class Caixa {

    inline fun fechamentoDaConta(
        cabecalhoNotaFiscal: () -> Unit,
        dataDaCompra: () -> String,
        listaDeProdutos: ArrayList<Produto>,
        imprimeListaDeCompras: (ArrayList<Produto>) -> Unit,
        adicionaRodape: (ArrayList<Produto>) -> Double
    ) {
        cabecalhoNotaFiscal.invoke()
        println(dataDaCompra.invoke())
        imprimeListaDeCompras.invoke(listaDeProdutos)
        println("R$${adicionaRodape.invoke(listaDeProdutos)}")
    }
}