package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int div = 0;
        int numero;
        int acc = 0;

        System.out.print("Digite numeros (0 para sair): ");
        numero = input.nextInt(); 

        while (numero != 0) {
            if (numero % 2 == 0) {
                acc += numero;
                div++;
            }

            System.out.print("Digite numeros (0 para sair): ");
            numero = input.nextInt();
        }

        if (div > 0) {
            int media = acc / div;
            System.out.println("A média dos números pares é " + media);
        } else {
            System.out.println("Nenhum número par foi informado.");
        }

        input.close();
    }
}
