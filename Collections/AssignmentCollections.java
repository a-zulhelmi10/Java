import java.util.*;

public class AssignmentCollections {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		int menu = 0;
		while (menu != 10) {
			System.out.println("Please choose below operations:");
			System.out.println("1. Add element at first");
			System.out.println("2. Add element at last");
			System.out.println("3. Add element at given index");
			System.out.println("4. Update element at given index");
			System.out.println("5. Delete first element");
			System.out.println("6. Delete last element");
			System.out.println("7. Delete the given element");
			System.out.println("8. Delete the element at given index");
			System.out.println("9. Display the element");
			System.out.println("10. Exit");

			if (s.hasNextInt()) {
                menu = s.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                s.next(); // Clear invalid input
                continue;
            }
			switch (menu) {
			case 1:
				System.out.println("Enter element to add at first:");
				String element = s.next();
				ll.addFirst(element);
				break;
			case 2:
				System.out.println("Enter element to add at last");
				element = s.next();
				ll.addLast(element);
				break;
			case 3:
				System.out.println("Enter element to add at index.");
				System.out.println("Enter element: ");
				element = s.next();
				System.out.println("Enter index.");
				int index = s.nextInt();
				ll.add(index, element);
				break;
			case 4:
				System.out.println("Update element");
				System.out.println("Enter index: ");
				index = s.nextInt();
				System.out.println("Enter element: ");
				element = s.next();
				ll.set(index, element);break;
			case 5:
				System.out.println("First element deleted");
				ll.removeFirst();break;
			case 6:
				System.out.println("Last element deleted");
				ll.removeLast();break;
			case 7:
				System.out.print("Delete given element");
				System.out.println("Enter element: ");
				element = s.next();
				ll.remove(element);break;
			case 8:
				System.out.println("Delete element at index ");
				index = s.nextInt();
				ll.remove(index);
			case 9:
				System.out.println(ll);
				break;
			case 10:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid menu!");
				break;
			}

		}

	}
}
