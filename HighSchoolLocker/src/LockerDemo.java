/**
Requirements:
	- You may only use statements that are discussed in the book through Chapter8.
	- Console input and output must be used to solve this problem.
	- Save your complete console output to a text file to turn in with this assignment.
	- Post your Java source code file in Blackboard
	- Post your output text file in Blackboard.
	- Post your Java source code file and your output text file in Blackboard using the Assignment Upload link below.
 */
public class LockerDemo {

	public static void main(String[] args) {
		
		Locker Mickey = new Locker(28,17,39,3,100,"Mickey Mouse"); // sets locker components
		Locker Donald = new Locker(35,16,27,0,275,"Donald Duck");
		
		Mickey.openLocker(); // adds books in locker
		for (int i=0; i<3; i++) {
			Mickey.putBookInLocker();
		}
		
		Donald.removeBookFromLocker(); // removes book from locker
		
		System.out.println(Mickey.toString()); // prints results
		System.out.println(Donald.toString());
			
	}

}