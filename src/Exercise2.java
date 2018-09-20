import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Exercise2 {
    public static void main(String[] args)
    {
        int i;

        JTextArea textArea = new JTextArea(14,30);

        textArea.setText("Yards     Inches\n");
        textArea.append("-----         ------");

        for(i=1; i<=10; i++)
        {
          int conversion = i*36;

          textArea.append("\n    " + i + "          " + conversion);
        }
        JOptionPane.showMessageDialog(null,textArea,"Conversion",JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
