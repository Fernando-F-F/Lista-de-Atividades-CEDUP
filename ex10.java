import javax.swing.JOptionPane;
public class ex10 {

    public static void main(String[] args) {
    String dia=JOptionPane.showInputDialog(null,"Digite um numero entre 1 à 7");
    if (dia!= null){
        try{
            int diadasemana= Integer.parseInt(dia);
            if (diadasemana == 1)
                dia = "Domingo";
            else if (diadasemana==2)
                dia = "Segunda-Feira";
            else if (diadasemana==3)
                dia = "Terça-Feira";
            else if (diadasemana==4)
                dia = "Quarta-Feira";
            else if (diadasemana==5)
                dia = "Quinta-Feira";
            else if (diadasemana==6)
                dia = "Sexta-Feira";
            else if (diadasemana==7)
                dia = "Sábado";
            else 
                dia = "Desconheço.";
            JOptionPane.showMessageDialog(null,dia);
            }
            catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Formato Inválido.");
            }
        }
    }
}
    
