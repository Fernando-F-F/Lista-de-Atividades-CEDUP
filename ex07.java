import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner pagamento = new Scanner(System.in);
        double horas, salario;

        System.out.println("Informe a quantidade de horas que você trabalhou: ");
        horas = pagamento.nextDouble();

        salario = (horas * 10.25);

        System.out.println("O seu salário será de : " + salario + " reais");

        if (salario < 50.00)
            System.out.println("Atenção, dirija-se à direção do Hotel!");

    }
}
