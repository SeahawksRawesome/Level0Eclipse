import javax.swing.JOptionPane;


public class Money {

	public static void main(String[] args) {
 String x = JOptionPane.showInputDialog("what ye price?");
 String y = JOptionPane.showInputDialog("how much are you paying");
 int b=Integer.parseInt(y);
 int n= Integer.parseInt(x);
 System.out.println(n-b);
	}

}
