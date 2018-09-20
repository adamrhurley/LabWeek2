import javax.swing.JOptionPane;
//import javax.swing.JTextArea;

public class Exercise3 {
    public static void main(String[] args)
    {
        float length, breadth, area, costPer, cost;
        String message, name, lengthAsString, breadthAsString, areaAsString, costPerAsString, costAsString;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        lengthAsString = JOptionPane.showInputDialog("Please enter the length of the room: ");
        length = Float.parseFloat(lengthAsString);

        breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of the room: ");
        breadth = Float.parseFloat(breadthAsString);





        message = "Quotation  for "+ name + "\n" + "Length of room: " + length + "\nBreadth of room: " + breadth;

        JOptionPane.showMessageDialog(null,message,"Quotation ",JOptionPane.PLAIN_MESSAGE);

    }
}
