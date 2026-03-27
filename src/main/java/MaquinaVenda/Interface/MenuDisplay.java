package MaquinaVenda.Interface;

import java.util.Scanner;

public class MenuDisplay {
    private Scanner sc;

    public MenuDisplay(Scanner sc) {
        this.sc = sc;
    }

    public char showMenuPrincipal() {
        System.out.println("[1] Comprar");
        System.out.println("[2] Exibir total vendido");
        System.out.println("[3] Exibir histórico de compras");
        System.out.println("[4] Sair");

        char charIn = getMenuIn('1', '4');

        return charIn;
    }

    public void showMenuCompra() {
        System.out.println("[1] Comprar chiclete");
        System.out.println("[2] Comprar chocolate");
        System.out.println("[3] Comprar pipoca");
        System.out.println("[4] Comprar suco");

        char charIn = getMenuIn('1', '4');
    }

    static boolean isValidOption(char opt, char firstOpt, char lastOpt) {
        if (opt >= firstOpt && opt <= lastOpt)
            return true;

        return false;
    }

    public char getMenuIn(char firstOpt, char lastOpt) {
        char charIn = '\0';

        do {
            if (charIn != '\0')
                System.out.println("Opção inválida!");
            System.out.print(">> ");
            charIn = sc.nextLine().charAt(0);
        } while (!isValidOption(charIn, firstOpt, lastOpt));

        return charIn;
    }
}
