import java.util.Random;


public class august_2nd {
public static void main(String[] agrs){
	for(int i= 0; i<=100; i++){
	int randy= new Random().nextInt(100);
	System.out.println(randy);		
if(randy %2 ==0){
	System.out.println("even");
}
	else{
	System.out.println("odd");
}
	}
 }
}