import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);
        int guess, attempts = 1;
        boolean open = true;

        System.out.println("Insira seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Ola " +name+ "!! Tente acertar um numero de 0 a 10!!");

        do {
            System.out.println("Adivinhe o numero: ");
            guess = scanner.nextInt();

            if (guess != randomNumber) {
                System.out.println("Voce errou!!");
                System.out.println("Deseja continuar? [true/false]");
                open = scanner.nextBoolean();
                attempts++;  
            } else {
                System.out.println("Parabens!! Voce acertou em "+attempts+" tentativa(s)");
                open = false;
            }
        } while (open == true);
        System.out.println("O numero era "+randomNumber+"!!");
        scanner.close();
    }
}
