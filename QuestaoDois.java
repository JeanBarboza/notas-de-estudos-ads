/*
Crie um programa que solicite a idade do usuário 
e determine se é maior de idade (≥ 18 anos), 
menor de idade ou idoso (≥ 60 anos). 
Utilize estruturas if/else para implementar a 
lógica e trate erros de entrada com try/catch.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do usuário: ");
        
        try {
            int idade = entrada.nextInt();

            if (idade < 0) {
                System.out.println("Idade não pode ser negativa");
            } else if (idade >= 60) {
                System.out.println("Idoso");
            } else if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        } catch (InputMismatchException e) {
            System.out.println("Idade digitada é inválida");
        }
        entrada.close();
    }
}
