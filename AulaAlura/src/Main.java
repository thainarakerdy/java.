import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Esse aqui é o Screen Watch");
        System.out.println("Filme: Top Gun: Maverick");

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        int celcius = sc.nextInt();
        int fahrenheit = (int) ((celcius * 1.8) + 32);

        System.out.println("A temperatura é: " + fahrenheit);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média é: %.2f%n", media);

                int contador = 1;

                while(contador <= 10){
                    System.out.println(contador);
                    contador++;
                }*/
           // }
       // }


        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5){
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = sc.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
        sc.close();
    }
}
