import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe seu Salario:");
        double salario = sc.nextDouble();
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe dua altura");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe seu sexo: ");
        String sexo = sc.nextLine();

       System.out.printf("Nome: %s ## Salario: %.2f ##  Idade: %d ## Altura: %.2f ## Sexo: %s ", nome, salario, idade, altura, sexo);


    }
}
