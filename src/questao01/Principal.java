package questao01;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        System.out.println("Digite um número: ");
        int numero = input.nextLine();
        int numero2 = input.nextLine();

        if (numero < numero2){
            System.out.println("O maior número é: " + numero2);
        }
        else{
            System.out.println("O maior número é: " + numero);
        }
        input.close();
//consertar

    }
}
