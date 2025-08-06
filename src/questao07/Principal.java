package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double lado1 = input.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = input.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = input.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } 
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } 
            else {
                System.out.println("Triângulo Escaleno");
            }

        } 
        else {
            System.out.println("Os valores informados NÃO formam um triângulo.");
        }

        input.close();
    }
}
