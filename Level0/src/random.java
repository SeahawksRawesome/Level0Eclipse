import java.util.Random;

import javax.swing.JOptionPane;

public class random {
	public static void main(String[] args) {
		int Rand=new Random().nextInt(100);
		if (Rand<34) {
			JOptionPane.showMessageDialog(null, "low");
		}
		else if (Rand< 66) {
			JOptionPane.showMessageDialog(null, "mid");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Hi");
		}

		System.out.println(Rand);
		//int X = 43;
		// JOptionPane.showMessageDialog(null, X);
		//System.out.println(X);
		//if (X == 18) {
			//System.out.println(X);
		//}
	}
}
