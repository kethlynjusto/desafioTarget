package org.desafioTarget;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = input.nextLine().toUpperCase();
        StringBuilder invertida = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }

        System.out.println("String invertida: " + invertida);
    }
}
