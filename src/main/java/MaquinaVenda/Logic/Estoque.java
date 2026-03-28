package MaquinaVenda.Logic;

public class Estoque {
    // Matriz para armazenar informações dos produtos
    // Linha: cada produto (0=chiclete, 1=chocolate, 2=pipoca, 3=suco)
    // Colunas: [0]=código, [1]=quantidade vendida, [2]=preço unitário
    private double[][] produtos;

    public Estoque() {
        produtos = new double[4][3];
        
        // Inicializar produtos
        produtos[0][0] = 1;      // Chiclete - código
        produtos[0][1] = 0;      // quantidade vendida
        produtos[0][2] = 1.50;   // preço unitário
        
        produtos[1][0] = 2;      // Chocolate - código
        produtos[1][1] = 0;      // quantidade vendida
        produtos[1][2] = 2.00;   // preço unitário
        
        produtos[2][0] = 3;      // Pipoca - código
        produtos[2][1] = 0;      // quantidade vendida
        produtos[2][2] = 3.00;   // preço unitário
        
        produtos[3][0] = 4;      // Suco - código
        produtos[3][1] = 0;      // quantidade vendida
        produtos[3][2] = 2.50;   // preço unitário
    }

    public boolean comprar(int produtoIndex) {
        if (produtoIndex < 0 || produtoIndex >= 4) {
            return false;
        }
        produtos[produtoIndex][1]++;
        return true;
    }

    public double[][] getProdutos() {
        return produtos;
    }

    public int getQuantidadeVendida(int produtoIndex) {
        return (int) produtos[produtoIndex][1];
    }

    public double getPreco(int produtoIndex) {
        return produtos[produtoIndex][2];
    }

    public double getTotalPorProduto(int produtoIndex) {
        return produtos[produtoIndex][1] * produtos[produtoIndex][2];
    }

    public double getTotalGeral() {
        double total = 0;
        for (int i = 0; i < 4; i++) {
            total += getTotalPorProduto(i);
        }
        return total;
    }
}

