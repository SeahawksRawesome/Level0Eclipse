import javax.swing.JOptionPane;

public class mustaches {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String user= JOptionPane.showInputDialog("do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
  if(user.equals( "yes" )){
JOptionPane.showMessageDialog(null, "you will rule the world" );
}
		// 3. Otherwise, wish them good luck washing dishes.
  else{
	  JOptionPane.showMessageDialog(null, "then good luck in washing waffles. For me. bwahahahahaha");
	  
  }
	}
}

