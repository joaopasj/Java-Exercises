import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}

public class Agenda {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean addNew = true;

        while (addNew) {
            System.out.print("Digite o nome do contato: ");
            String name = scanner.next(); 

            System.out.print("Digite o numero do contato: ");
            int number = scanner.nextInt(); 

            contacts.add(new Contact(name, number));

            System.out.print("Deseja adicionar mais contatos? (true/false): ");
            addNew = scanner.nextBoolean();
        }

        System.out.println("\nContatos adicionados:");
        for (Contact contact : contacts) {
            System.out.println("Nome: " + contact.getName() + ", Numero: " + contact.getNumber());
        }

        scanner.close();
    }
}
