package questao02;
import java.util.Scanner;
public class Principal {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("Digite seu peso: ");
        System.out.println("Digite sua altura: ");
        float peso = input.nextLine();
        float altura = input.nextLine();

        float imc = peso/(altura*altura);

        if (imc < 18.5){
            System.out.print("Magreza");
        }
        else if (imc < 24.9){
            System.out.print("Saudavel");
        }
        else if (imc < 25.0 && imc < 29.9){
            System.out.print("Sobrepeso");
        }
        else if (imc < 30.0 && imc < 34.9){
            System.out.print("Obsidade Grau 1");
        }
        else if (imc < 35.0 && imc < 39.9){
            System.out.print("Obsidade Grau 2 (severa)");
        }
        else if (imc >= 40){
            System.out.print("Obsidade Grau 3 (mórbida)");
        }
        System.out.print("O seu IMC é %f" + imc);
        input.close();
    }
}