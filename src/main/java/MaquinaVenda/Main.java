package MaquinaVenda;

import MaquinaVenda.Interface.MenuDisplay;
import MaquinaVenda.Logic.Logic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDisplay md = new MenuDisplay(sc);
        Logic logic = new Logic();
        
        boolean isRunning = true;

        while (isRunning) {
            char opcao = md.showMenuPrincipal();
            isRunning = handleMenuChoice(opcao, logic);
        }

        // Exibir relatório final ao sair
        logic.exibirRelatorioFinal();
        sc.close();
    }

    public static boolean handleMenuChoice(char opt, Logic logic) {
        switch (opt) {
            case '1':
                logic.realizarCompra(0); // Chiclete
                return true;
            case '2':
                logic.realizarCompra(1); // Chocolate
                return true;
            case '3':
                logic.realizarCompra(2); // Pipoca
                return true;
            case '4':
                logic.realizarCompra(3); // Suco
                return true;
            case '5':
                logic.exibirTotalVendido();
                return true;
            case '6':
                logic.exibirHistorico();
                return true;
            case '7':
                return false; // Sair
            default:
                System.out.println("Erro, apenas opções de 1 a 7!");
                return true;
        }
    }
}