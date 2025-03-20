import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double[] grade;

    public Student(String name, int age, double[] grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrade() {
        return grade;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grade) {
            sum += grade;
        }
        return sum / grade.length;
    }
}

public class SchoolHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; 

        for (int i = 0; i < students.length; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Digite a idade do aluno " + (i + 1) + ":");
            var age = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite as notas do aluno " + (i + 1) + " (separadas por espaço):");
            String[] gradesString = scanner.nextLine().split(" ");
            double[] grades = new double[gradesString.length];

            for (int j = 0; j < gradesString.length; j++) {
                grades[j] = Double.parseDouble(gradesString[j]);
            }

            students[i] = new Student(name, age, grades);
        }

        System.out.println("\nInformações dos Alunos:");
        for (Student student : students) { 
            System.out.println("Nome: " + student.getName());
            System.out.println("Idade: " + student.getAge());
            System.out.printf("Média: %.2f%n", student.calculateAverage());
            System.out.println();
        }

        scanner.close();
    }
}
