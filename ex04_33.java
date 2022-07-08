import java.util.Scanner;

public class ex04_33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float quilos,libras,quilosCon,librasCon;

        System.out.println("Digite o valor em quilos: ");
        quilos = input.nextFloat();
            quilosCon = quilos * 2.205f;
        System.out.println("O valor de quilos para libras é: "+ quilosCon);

        System.out.println("Digite o valor em libras: ");
        libras = input.nextFloat();
            librasCon = libras / 2.205f;
        System.out.println("O valor de libras para quilos é: "+ librasCon);

        



    }
}
  