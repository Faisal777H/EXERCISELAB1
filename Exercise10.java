import javax.swing.*;

public class Exercise10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"My name is Hal!.What Would you like to do");
        String name= JOptionPane.showInputDialog("Whats your name?");
        JOptionPane.showMessageDialog(null,"I am sorry "+name +"I am afraid I can’t do that");
    }
}
