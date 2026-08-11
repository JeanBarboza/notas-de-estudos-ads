/* Questão 4: Soma de Números com while

Desenvolva um programa que leia números inteiros do usuário em um laço while até que ele digite 0 (zero). 
Ao final, exiba a soma de todos os números digitados. Utilize try/catch para tratar entradas inválidas. */

import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        try{ 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero(que não seja 0): ");
        int a = entrada.nextInt();
        int soma = 0;
        
        while (a != 0 ){     //Enquanto o número "a" pedir algo que nao seja o 0, ele vai fazer algo
		soma = soma + a;
        System.out.println( "Digite um numero(que não seja 0): ");
        a = entrada.nextInt();
	}
    entrada.close();
        System.out.println("A soma dos números são: " + soma);

        }
        catch(Exception e){
            System.out.println("Isso não é um numero!");
        }
    }
}

