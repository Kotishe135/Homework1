package olimp;

import javax.swing.JOptionPane;


public class Olimp {

    public static void main(String[] args) {
        String Hello = JOptionPane.showInputDialog("Введите \"Hello World\"");
        if (Hello.equals("Hello World")){
            JOptionPane.showMessageDialog(null, Hello + "\nПоздравляю, Вы следовали инструкции");
        }else{
            String tochno = "";
            int i = 0;
            while (JOptionPane.showConfirmDialog(null, "Вы"+tochno+" уверены, что Вы хотели написать \""+Hello+"\", вместо \"Hello World\"?") != 1){
                tochno += " точно";
                i++;
            }
            Hello = "Hello World";
            if (i < 5){
                JOptionPane.showMessageDialog(null, Hello + "\nПоздравляю, Вы согласились следовать инструкции");
            }else{
                JOptionPane.showMessageDialog(null, Hello + "\nА Вы бунтарь");
            }
            //s = JOptionPane.showInputDialog("Введите \"Hello World\"");
        }
    }

}
