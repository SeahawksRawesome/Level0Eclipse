
	 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String stuff = "http://static.nfl.com/static/content/public/video/2014/11/24/0ap3000000433606_video_cp.jpg";
			// 2. create a variable of type "Component" that will hold your image
Component i;
			// 3. use the "createImage()" method below to initialize your Component
i = createImage(stuff);
			// 4. add the image to the quiz window
quizWindow.add(i);
			// 5. call the pack() method on the quiz window
quizWindow.pack();
			// 6. ask a question that relates to the image
String y = JOptionPane.showInputDialog("DO you think that the Cowboys are BETTER than the Giants?");
			// 7. print "CORRECT" if the user gave the right answer
if(y.equals("no")){
	System.out.println("CORRECT");
}
	
			// 8. print "INCORRECT" if the answer is wrong
else{
	System.out.println("INCORRECT");
}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(i);
			// 10. find another image and create it
String z = "https://dn3pm25xmtlyu.cloudfront.net/photos/thumb/836878582.gif?1391392917&Expires=1445297952&Signature=yRqwatsyYB~cNKpwdPlCn5qXCJ8ahlEhoO-hYOmrpmgB0sVq~tcpVZxDHjnG~EDYcs~SRpb34YEBUoB~khrBZY6fSOljdH8K0ilCwqyKnh9j3gTptapDdOOxgs-laC0n6qveBgFyI1F89TGpaL2SDNDBe~c9scgTBDkxzM57zJA_&Key-Pair-Id=APKAIYVGSUJFNRFZBBTA";
Component w = createImage(z);
			// 11. add the second image to the quiz window
quizWindow.add(w);
			// 12. pack the quiz window
quizWindow.pack();
			// 13. ask another question
String q =JOptionPane.showInputDialog("Do you think the Broncos are better than the Seahawks?");
			// 14+ check answer, say if correct or incorrect, etc.
if(q.equals("yes")){
	System.out.println("Incorrect");
}
else{ 
System.out.println("Correct");	
}
}

		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	}
