public class method {
	public static void main(String[] args) {
		//numbers(11, 1);
 System.out.println( exponets(10, 0));
	}

	static void numbers(int start, int end) {
	if (start < end) {
		for (int i = start; i <= end; i++) {

			System.out.println(i);
			}
		} else {
			for (int i = end; i <= start; i++) {

				System.out.println(i);
			}

		}
	}
	static int exponets(int base, int exp){
		int ans=1;
		for(int i=1; i<=exp;i++){
			ans*=base;
		}
		return ans;
	}
}