import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("/ *********************** /");
        System.out.println("/ *** Calculadora IMC *** /");
        System.out.println("/ *********************** /");
        System.out.println();

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe sua Peso:");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura:");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        if(imc<18.5) {
            System.out.printf("Olá %s, seu IMC: %.2f, está ABAIXO DO NORMAL ", nome, imc);
        }else if(imc>=18.5 && imc<25) {
            System.out.printf("Olá %s, seu IMC: %.2f, está NORMAL", nome, imc);
        }else if(imc>=25 && imc<30) {
            System.out.printf("Olá %s, seu IMC: %.2f, está com SOBREPESO ", nome, imc);
        }else if(imc>=30 && imc<35) {
            System.out.printf("Olá %s, seu IMC: %.2f, está com OBESIDADE I", nome, imc);
        } else if(imc>=35 && imc<40) {
            System.out.printf("Olá %s, seu IMC: %.2f, está com OBESIDADE II", nome, imc);
        }else{
            System.out.printf("Olá %s, seu IMC: %.2f, está com OBESIDADE III", nome, imc);
        }


    }

}
