package MaquinaVenda.Logic;

public class Logic {
    private Cliente cliente;
    private Estoque estoque;
    
    private static final String[] NOMES_PRODUTOS = {"Chiclete", "Chocolate", "Pipoca", "Suco"};

    public Logic() {
        this.cliente = new Cliente();
        this.estoque = new Estoque();
    }

    public void realizarCompra(int produtoIndex) {
        if (produtoIndex < 0 || produtoIndex >= 4) {
            System.out.println("Produto inválido!");
            return;
        }
        
        estoque.comprar(produtoIndex);
        cliente.registrar(produtoIndex);
        System.out.println("Aqui está seu(sua) " + NOMES_PRODUTOS[produtoIndex] + "!");
        System.out.println();
    }

    public void exibirTotalVendido() {
        System.out.println("\n=== Total Vendido ===");
        
        for (int i = 0; i < 4; i++) {
            int quantidade = estoque.getQuantidadeVendida(i);
            String plural = quantidade != 1 ? "unidades" : "unidade";
            System.out.println(quantidade + " " + plural + " de " + NOMES_PRODUTOS[i] + " vendidas");
        }
        System.out.println();
    }

    public void exibirHistorico() {
        cliente.exibirHistorico();
    }

    public void exibirRelatorioFinal() {
        System.out.println("\n========== RELATÓRIO FINAL ==========");
        System.out.println("\n--- Quantidade Vendida ---");
        
        for (int i = 0; i < 4; i++) {
            int quantidade = estoque.getQuantidadeVendida(i);
            String plural = quantidade != 1 ? "unidades" : "unidade";
            System.out.println(NOMES_PRODUTOS[i] + ": " + quantidade + " " + plural);
        }
        
        System.out.println("\n--- Total Arrecadado por Produto ---");
        for (int i = 0; i < 4; i++) {
            double total = estoque.getTotalPorProduto(i);
            int quantidade = estoque.getQuantidadeVendida(i);
            if (quantidade > 0) {
                System.out.printf("%s: %.2f (%.2f x %d)%n", 
                    NOMES_PRODUTOS[i], total, estoque.getPreco(i), quantidade);
            } else {
                System.out.printf("%s: R$ 0.00%n", NOMES_PRODUTOS[i]);
            }
        }
        
        System.out.println("\n--- Total Geral Arrecadado ---");
        System.out.printf("R$ %.2f%n", estoque.getTotalGeral());
        System.out.println("\n=====================================\n");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Estoque getEstoque() {
        return estoque;
    }
}
