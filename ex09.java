import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex09 {
    public static void main(String[] args) {
        float n1, n2, media;
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Digite nota1:");
            n1 = var.nextFloat();
            System.out.println("Digite nota2:");
            n2 = var.nextFloat();
        }
        media = (n1+n2)/2;
        JOptionPane.showMessageDialog( null, "Média: "  + media);

    }
}