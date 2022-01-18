
public class ques2 {

	public static void main(String[] args) {
		int n = 31;
		boolean finishedForLoop = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.print("Not prime");
				finishedForLoop = false;
				break;
			}
		}
		if (finishedForLoop == true){
		    System.out.print("is prime");
		}

	}

}
