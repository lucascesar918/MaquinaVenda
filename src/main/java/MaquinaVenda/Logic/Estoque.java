package MaquinaVenda.Logic;

import java.util.HashMap;

public class Estoque {
    private HashMap<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<Produto, Integer>();
        for (Produto prod : Produto.values())
            this.produtos.put(prod, 0);
    }

    private void darBaixa(int quantidade) {

    }

    private void darEntrada(int quantidade) {

    }
}
