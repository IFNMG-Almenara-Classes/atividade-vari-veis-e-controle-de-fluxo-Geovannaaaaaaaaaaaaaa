package questao04;
import java.util.Scanner;

public class Principal {
    public static void main (String []args){

        Scanner input = new Scanner (System.in);

        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        do{
            if (senha ==1234){
                System.out.print("Senha correta, bem-vindo!");
            }
            else{
                System.out.print("Senha incorreta, tente novamente");
                break;
            }
        }
        while(senha!=1234);
    }
}
