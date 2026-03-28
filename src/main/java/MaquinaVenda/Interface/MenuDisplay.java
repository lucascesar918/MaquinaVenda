package MaquinaVenda.Interface;

import java.util.Scanner;

public class MenuDisplay {
    private Scanner sc;

    public MenuDisplay(Scanner sc) {
        this.sc = sc;
    }

    public char showMenuPrincipal() {
        System.out.println("\n========== MÁQUINA DE VENDA ==========");
        System.out.println("[1] Comprar chiclete");
        System.out.println("[2] Comprar chocolate");
        System.out.println("[3] Comprar pipoca");
        System.out.println("[4] Comprar suco");
        System.out.println("[5] Exibir total vendido até agora");
        System.out.println("[6] Exibir histórico de compras");
        System.out.println("[7] Sair");
        System.out.println("=====================================");

        char charIn = getMenuIn('1', '7');
        return charIn;
    }

    public char getMenuIn(char firstOpt, char lastOpt) {
        char charIn = '\0';
        boolean validInput;

        do {
            validInput = true;
            System.out.print(">> ");
            
            try {
                String input = sc.nextLine();
                if (input.length() == 0) {
                    System.out.println("Erro, apenas opções de " + firstOpt + " a " + lastOpt + "!");
                    validInput = false;
                    continue;
                }
                charIn = input.charAt(0);
            } catch (Exception e) {
                System.out.println("Erro, apenas opções de " + firstOpt + " a " + lastOpt + "!");
                validInput = false;
                continue;
            }

            if (!isValidOption(charIn, firstOpt, lastOpt)) {
                System.out.println("Erro, apenas opções de " + firstOpt + " a " + lastOpt + "!");
                validInput = false;
            }
        } while (!validInput);

        return charIn;
    }

    public static boolean isValidOption(char opt, char firstOpt, char lastOpt) {
        return opt >= firstOpt && opt <= lastOpt;
    }
}
