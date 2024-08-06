import java.sql.SQLOutput;
import java.util.Scanner;

public class Quatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("/ ############################### /");
        System.out.println("/ ### BEM VINDO AO CALCULATOR ### /");
        System.out.println("/ ############################### /");
        System.out.println();


    int tentativas = 0;
    while (tentativas == 0) {


        System.out.println("### Selecione Qual área deseja Calcular ###");
        System.out.println("[1] - Retângulo");
        System.out.println("[2] - Triângulo");
        System.out.println("[3] - Círculo");
        System.out.println("[4] - Trapezio");
        System.out.println("[0] - Sair");

        int opcao = sc.nextInt();
        double PI = 3.14159265358979323846;

        if (opcao == 0) {
            System.out.println("/ ############################### /");
            System.out.println("/ ### Obrigado por usar o CALCULATOR! ### /");
            System.out.println("/ ############################### /");
            break;
        }


        switch (opcao) {
            case 1:
                System.out.println("Informe a Base (b) do Retângulo");
                int baseR = sc.nextInt();
                System.out.println("Informe a Altura (h) do Retângulo");
                int alturaR = sc.nextInt();
                int areaR = baseR*alturaR;
                System.out.println("### A área do Retângulo é " +areaR + " ###");
                System.out.println();
                break;

            case 2:
                System.out.println("Informe a Base (b) do Triangulo");
                int baseT = sc.nextInt();
                System.out.println("Informe a Altura (h) do Triangulo");
                int alturaT = sc.nextInt();
                int areaT = (baseT*alturaT)/2;
                System.out.println("### A área do Triangulo é " + areaT +" 0###");
                System.out.println();
                break;

            case 3:
                System.out.println("Informe o raio do Circulo");
                double raioC = sc.nextDouble();
                double areaC = PI * (raioC * raioC);
                System.out.printf("### A área do Circulo é: %.2f %n ###", areaC);
                System.out.println();
                break;

            case 4:
                System.out.println("Informe o valor da Base (B) Maior :");
                double baseMaior = sc.nextDouble();
                System.out.println("Informe o valor da Base (b) Menor:");
                double baseMenor = sc.nextDouble();
                System.out.println("Informe o valor da Altura (h):");
                double altura = sc.nextDouble();
                double areaTrapezio = ((baseMaior + baseMenor)/2)*altura;
                System.out.printf("### A área do Trapezio é: %.2f ###", areaTrapezio);
                System.out.println();
                break;

            default:
                System.out.println("@@@ Opção Inválida, Slecione outra Opção @@@");
                System.out.println();
        }




    }

    }
}
