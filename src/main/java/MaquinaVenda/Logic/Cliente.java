package MaquinaVenda.Logic;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<String> historico;
    private static final String[] NOMES_PRODUTOS = {"Chiclete", "Chocolate", "Pipoca", "Suco"};

    public Cliente() {
        this.historico = new ArrayList<>();
    }

    public void registrar(int produtoIndex) {
        if (produtoIndex >= 0 && produtoIndex < NOMES_PRODUTOS.length) {
            this.historico.add(NOMES_PRODUTOS[produtoIndex]);
        }
    }

    public ArrayList<String> getHistorico() {
        return this.historico;
    }

    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma compra realizada ainda.");
            return;
        }
        
        System.out.println("\n=== Histórico de Compras ===");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println((i + 1) + ". " + historico.get(i));
        }
        System.out.println();
    }

    public void limparHistorico() {
        this.historico.clear();
    }
}

