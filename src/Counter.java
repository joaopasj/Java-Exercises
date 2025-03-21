import java.util.Scanner;

class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro:");
        int parameter1 = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro:");
        int parameter2 = terminal.nextInt();
        
        try {
            contar(parameter1, parameter2);
        } catch (InvalidParametersException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }
        
        terminal.close();
    }

    static void contar(int parameter1, int parameter2) throws InvalidParametersException {
        if (parameter1 > parameter2) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int count = parameter2 - parameter1;
        
        for (int i = 1; i <= count; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
