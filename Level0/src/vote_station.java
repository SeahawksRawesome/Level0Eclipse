import java.util.Random;

import javax.swing.JOptionPane;

public class vote_station {
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("what's yo age soniy?");
		int x = Integer.parseInt(a);
		int t = 0;
		int u = 0;
		if (x == 18) {
			System.out.println("Talk about Texas A and M college");

		} else if (x > 18) {
			System.out
					.println("you are to old to vote for this younger aged stuff about stuff! bwahahahhahahhahahahahah :(");
			System.exit(0);
		} else {
			String y = JOptionPane
					.showInputDialog("do you want to vote for 1 (favorite food), 2 (favorite movie), 3 (favorite song), or 4 (exit)?");
			 t = Integer.parseInt(y);

			if (t == 1) {
				String N = JOptionPane
						.showInputDialog(" Which do you like, beef(1), crab(2),"
								+ "  lambchop with  a tartar sauce and roasted potatoes(3), Yummy Dice cream(4), or 32 oz Filet Mignon with cranberry sauce topped with a little bit of parsley, on the side we have sweet potatoes with brown sugar and a glass of port wine?(5) ");
				 u = Integer.parseInt(N);
			} else if (t == 2) {
				String N = JOptionPane
						.showInputDialog("Which do you like: (1)Star wars Attack Of The Clones, (2)THE FORCE AWAKENS, or (3)Transformers Age of Extinction, (4) Home, or (5)The Theory of Everything?");
				 u = Integer.parseInt(N);
			} else if(t == 4){
			System.exit(0);
			
			}
			
		
		else {
				String N = JOptionPane
						.showInputDialog("Not gonna die by Skillet (5) Bohemian Rapsody by Queen (2), or Fur Elise (3), (4)Rebirthing by Skillet, or (1)Who wants to live forever by Queen?");
				 u = Integer.parseInt(N);}
			
			if (u == new Random().nextInt(5)) {
				System.out
						.println("You picked the best one eva. You are specialllll!");
					}
			else {
				System.out.println("You picked the wrong one");
				
			}

		}

	}
}
