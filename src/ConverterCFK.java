import java.util.Scanner;

public class ConverterCFK {
    public static void main(String[] args) {
        
        char temperature1;
        char temperature2;
        double degree;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a escala de medição: Celsius(C), Fahrenheit(F) ou Kelvin(K)");
        temperature1 = scanner.next().charAt(0);
        System.out.println("Informe a quantidade de graus: ");
        degree = scanner.nextDouble();
        System.out.println("Informe a escala que deseja alterar: Celsius(C), Fahrenheit(F) ou Kelvin(K)");
        temperature2 = scanner.next().charAt(0);
        scanner.close();

        if (temperature1 == temperature2){
            result = degree;
            System.out.println("O resultado é " +result+ " você converteu ele pra ele mesmo!!");
            System.exit(0);
        }
        else{
        switch (temperature1) {
            case 'C':
                switch (temperature2) {
                    case 'F':
                        result = (degree * 1.8) + 32; 
                
                        break;
                
                    case 'K':
                        result = degree + 273;
                
                        break;
                
                    default:
                        System.out.println("Sintaxe invalida!!!");

                        break;
                }
                break;
        
            case 'F':
                switch (temperature2) {
                    case 'C':
                        result = (degree -32) / 1.8;
                        
                        break;
                
                    case 'K':
                        result = (degree + 459.67) / 1.8;
                
                        break;
                
                    default:
                        System.out.println("Sintaxe invalida!!!");

                        break;
                }
                
                break;
        
            case 'K':
                switch (temperature2) {
                    case 'C':
                        result = degree - 273;
                        
                        break;
                
                    case 'F':
                        result = (degree - 459.67) * 1.8;
                
                        break;
                
                    default:
                        System.out.println("Sintaxe invalida!!!");

                        break;
                }
                
                break;
        
            default:
                System.out.println("Sintaxe invalida!!!");

                break;
        }
    }

        System.out.println("O resultado sera de : " +result+ " graus " +temperature2);

        
    }
    
}
