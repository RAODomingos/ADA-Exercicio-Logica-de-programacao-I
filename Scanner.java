import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe sua profissão");
        String profissao = sc.nextLine();

        System.out.print("nome: " + nome);
        System.out.printf(" Idade: " + idade);
        System.out.println(" Profissao: " + profissao);


    }





}
