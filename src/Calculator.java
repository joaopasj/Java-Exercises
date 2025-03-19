import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        char confirm;

        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Escolha a operação: +, -, * ou /");
        operator = scanner.next().charAt(0);
        System.out.println("Confirmar operação: S ou N");
        confirm = scanner.next().charAt(0);
        }
        while (confirm == 'N');
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        double resultado = 0;

        switch (operator) {
            case '+':
                resultado = num1 + num2;
                break;
    
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
    
            case '/':
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Não foi possível fazer a operação!!");
                break; 
        }
        System.out.println("O resultado da operação é: " +resultado);   
        
        
    }
}
