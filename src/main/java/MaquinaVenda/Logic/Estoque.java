package MaquinaVenda.Logic;

public class Estoque {
    private double[][] produtos;

    public Estoque() {
        produtos = new double[4][3];
        
        produtos[0][0] = 1;
        produtos[0][1] = 0;
        produtos[0][2] = 1.50;
        
        produtos[1][0] = 2;
        produtos[1][1] = 0;
        produtos[1][2] = 2.00;
        
        produtos[2][0] = 3;
        produtos[2][1] = 0;
        produtos[2][2] = 3.00;
        
        produtos[3][0] = 4;
        produtos[3][1] = 0;
        produtos[3][2] = 2.50;
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

