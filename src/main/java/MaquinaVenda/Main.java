package MaquinaVenda;

import MaquinaVenda.Interface.MenuDisplay;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDisplay md = new MenuDisplay(sc);
        boolean isRunning = true;

        while (isRunning) {
            isRunning = handleMenuChoice(md.showMenuPrincipal(), md);
        }

        sc.close();
    }

    public static boolean handleMenuChoice(char opt, MenuDisplay md) {
        switch (opt) {
            case '1':
                md.showMenuCompra();
                return true;
            case '4':
            default:
                return false;
        }
    }
}