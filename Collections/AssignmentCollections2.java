import java.util.*;

public class AssignmentCollections2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1=== LinkedList Operations Menu ===");
            System.out.println("1. Add element at first");
            System.out.println("2. Add element at last");
            System.out.println("3. Add element at given index");
            System.out.println("4. Update element at given index");
            System.out.println("5. Delete element at first");
            System.out.println("6. Delete element at last");
            System.out.println("7. Delete the given element");
            System.out.println("8. Delete element at given index");
            System.out.println("9. Display the elements");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add at first: ");
                    String first = scanner.nextLine();
                    list.addFirst(first);
                    break;

                case 2:
                    System.out.print("Enter element to add at last: ");
                    String last = scanner.nextLine();
                    list.addLast(last);
                    break;

                case 3:
                    System.out.print("Enter index: ");
                    int indexAdd = scanner.nextInt();
                    scanner.nextLine();
                    if (indexAdd >= 0 && indexAdd <= list.size()) {
                        System.out.print("Enter element to add: ");
                        String elementAdd = scanner.nextLine();
                        list.add(indexAdd, elementAdd);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexUpdate >= 0 && indexUpdate < list.size()) {
                        System.out.print("Enter new element: ");
                        String elementUpdate = scanner.nextLine();
                        list.set(indexUpdate, elementUpdate);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    if (!list.isEmpty()) {
                        list.removeFirst();
                        System.out.println("First element deleted.");
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;

                case 6:
                    if (!list.isEmpty()) {
                        list.removeLast();
                        System.out.println("Last element deleted.");
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;

                case 7:
                    System.out.print("Enter element to delete: ");
                    String elementDelete = scanner.nextLine();
                    if (list.remove(elementDelete)) {
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 8:
                    System.out.print("Enter index to delete: ");
                    int indexDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (indexDelete >= 0 && indexDelete < list.size()) {
                        list.remove(indexDelete);
                        System.out.println("Element deleted at index " + indexDelete);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 9:
                    System.out.println("Current List: " + list);
                    break;

                case 10:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
