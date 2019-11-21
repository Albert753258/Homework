import java.util.Scanner;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static String element1 = "Hello, world!";

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add(element1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter help");
        while (true) {
            String command = sc.nextLine();
            if (command.equals("print")) {
                System.out.println(list);
            }
            else if (command.equals("help")) {
                System.out.println("To print list, enter `print`");
                System.out.println("To add new element, enter `add`");
                System.out.println("To add new element with number, enter `addWithNumber`");
                System.out.println("To remove element, enter `remove`");
            }
            else if (command.equals("add")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new element");
                String elementAdd = sc1.nextLine();
                list.add(elementAdd);
            }
            else if (command.equals("addWithNumber")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter new element");
                String elementAdd = sc1.nextLine();
                System.out.println("Enter number of element");
                int i = sc1.nextInt();
                list.add(i, elementAdd);
            }
            else if (command.equals("remove")){
                System.out.println("Enter number of element, what you want to remove");
                Scanner sc1 = new Scanner(System.in);
                int i = sc1.nextInt();
                list.remove(i);
            }
        }
    }
}
