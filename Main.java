import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		List<Bear> bears = new ArrayList<>();

		Bear bear = new Bear();
		bear.setName("bear");
		Elephant elephant = new Elephant();
		elephant.setName("animal");
		Tiger tiger = new Tiger();
		tiger.setName("tiger");

		
		ZooKeeper zookeeper = new ZooKeeper();

	    System.out.print("------- ZOO MANAGEMENT -------  ");
	    System.out.print("\n   Bear                 [1] ");
		System.out.print("\n   Tiger                [2] ");
		System.out.print("\n   Elephant             [3] ");
		System.out.print("\n   Manager List         [4] ");
		System.out.print("\n QUIT                   [5] ");
		System.out.print("\n Your Selection is: ");
	    
		Scanner scanner = new Scanner(System.in);
	    String operation = scanner.next();
	    
	    if(operation.equals("1")) {
//			bear.information();
			checkKeeper(scanner, bear);
			Bear bear1 = new Bear();
			System.out.println("please give the bear name");
			String name = scanner.next();
			bear1.setName(name);
			bears.add(bear1);
		}
	    if(operation.equals("2")) {
//	    	tiger.information();
			checkKeeper(scanner, tiger);
	    }
	    if(operation.equals("3")) {
//	    	elephant.information();
			checkKeeper(scanner, elephant);
	    }
	    if(operation.equals("4")) {
			zookeeper.information();
			System.out.println("current we have " + bears.size() + " bears");
	    }
	    
	    else
	    	System.out.println("System quit successfully");

	}

	public static void checkKeeper(Scanner scanner, Animals animals) {
		animals.information();

		System.out.println("Are you zoo keeper Peter Y/N ?");
		String keeper = scanner.next();

		if(keeper.equals("Y")) {
			System.out.println("Feed Y/N ?");
			String feed = scanner.next();
			if(feed.equals("Y")) {
				System.out.println(animals.getName() + " is feeded has been record");

			}
			if(feed.equals("N")) {
				System.out.println("Please feed on time");

			}
		}
		else
			System.out.println("You do not have access");
	}
}
