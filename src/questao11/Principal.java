package questao11;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro e positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, digite um número positivo.");
        } 
        else {
            System.out.println("Números pares entre 0 e " + numero + ":");
            for (int i = 0; i <= numero; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}