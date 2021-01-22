
public class LoopArray {

	public static void main(String[] args) {
		
		/*
		 * <li>goyoung</li>
		 * <li>miamia</li>
		 * <li>baduck</li>
		 */
		
		
		String[] users = new String[4]; 
		users[0] = "goyoung"; 
		users[1] = "miamia";
		users[2] = "baduck";
		users[3] = "ggamang";
		
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"/<li>");
		}
		
		
		
		
	}

}
