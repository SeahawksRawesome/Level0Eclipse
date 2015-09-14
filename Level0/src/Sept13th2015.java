import javax.swing.JOptionPane;

public class Sept13th2015 {
	public static void main(String[] args) {
		String numba = JOptionPane.showInputDialog("Give meh a numba?");
		int x = Integer.parseInt(numba);
	
		String two = JOptionPane.showInputDialog("Give meh a second nomba?");
		int y = Integer.parseInt(two);
		for (int i = 0; i <= x; i+=y) {
			System.out.println(i);
		}
	}
}