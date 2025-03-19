import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Informe seu sexo: F ou M");
        char gender = scanner.next().charAt(0);

        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Infome sua altura em metros: ");
        double height = scanner.nextDouble();

        System.out.println("Informe seu peso: ");
        double weight = scanner.nextDouble();

        System.out.println("Informe seu fator de atividade física: leve (L), moderada (M) ou intensa (I)");
        char activities = scanner.next().charAt(0);

        scanner.close();

        double IMC = weight / (height * height);
        double TMB = 0;

        switch (gender) {
            case 'F':
                TMB = 655 + (9.5 * weight) + (1.8 * (height * 100)) - (4.8 * age);
                break;
            case 'M':
                TMB = 66 + (13.8 * weight) + (5 * (height * 100)) - (6.8 * age);
                break;
            default:
                System.out.println("Sexo não reconhecido pelo IBGE!!!");
                break;
        }

        switch (activities) {
            case 'L':
                TMB = TMB * 1.55;
                break;
            case 'M':
                TMB = TMB * 1.84;
                break;
            case 'I':
                TMB = TMB * 2.2;
                break;
            default:
                System.out.println("Fator de atividade inválido!");
                break;
        }

        if (IMC < 18.5) {
            System.out.println("Seu IMC é de: " + df.format(IMC) + " e você esta abaixo do peso");
            }
        else if (IMC > 18.5 || IMC < 24.9) {
                System.out.println("Seu IMC é de: " + df.format(IMC) + " e você esta no peso ideal");
        } 
        else {
        System.out.println("Seu IMC é de: " + df.format(IMC) + " e você esta acima do peso");
        }
        
        System.out.println("Seu gasto calórico é de: " +df.format(TMB));


    }
}
