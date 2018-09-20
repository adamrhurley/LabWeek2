import javax.swing.JOptionPane;
//import javax.swing.JTextArea;

public class Exercise3 {
    public static void main(String[] args)
    {
        float length, breadth, area, costPer, cost;
        String message, name, lengthAsString, breadthAsString, costPerAsString;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        lengthAsString = JOptionPane.showInputDialog("Please enter the length of the room: ");
        length = Float.parseFloat(lengthAsString);

        breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of the room: ");
        breadth = Float.parseFloat(breadthAsString);

        costPerAsString = JOptionPane.showInputDialog("Please enter the cost per square meter of carpet: ");
        costPer = Float.parseFloat(costPerAsString);

        area = length*breadth;
        cost = area*costPer;

        message = "Quotation for "+ name + "\n" + "Length of room: " + length + " m" + "\nBrea" +
                "dth of room: " + breadth + " m" + "\nTotal area of the room: " + area + " sq." +
                " m" + "\nCost per square meter of carpet: " + costPer + " euro" + "\nTotal cost of " +
                "carpet: " + cost + " euro";

        JOptionPane.showMessageDialog(null,message,"Quotation ",JOptionPane.PLAIN_MESSAGE);

    }
}
