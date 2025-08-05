package questao03;

import java.util.Scanner;

public class Principal {
        public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int número = input.nextInt():

        if (número % 2 ==0){
            System.out.print("O número é par");
        }
        else{
            System.out.print("O número é impar");
        }
        input.close();
    }
}