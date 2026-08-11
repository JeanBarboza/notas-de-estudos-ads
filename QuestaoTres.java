/* Questão 3: Tabuada com Laço for

Implemente um programa que leia um número inteiro do usuário e exiba a
tabuada desse número (de 1 a 10) utilizando um laço for. Valide a entrada
com try/catch e utilize operadores de multiplicação. */

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        try{ 
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int numero = entrada.nextInt();

            //começo do laço
            for(int i = 1; i <= 10; i++){
                int resultado = numero * i;
                System.out.print(numero + " x " + i +" = " + resultado +"\n");
            }
            entrada.close();
        }
        catch(Exception e){
            System.out.println("Isso não é um numero!");
        }
    }
        
}

