import sun.security.jgss.GSSCaller;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter `help`");
        while (true){
            String command = scanner.nextLine();
            if (command.equals("help")){
                System.out.println("To write numbers to file, enter `write`");
                System.out.println("To read numbers from file, enter `read`");
            }
            if (command.equals("write")){
                writeNumbers();
            }
            if (command.equals("read")){
                readFile();
            }
        }
    }

    public static void readFile() throws FileNotFoundException {
        Scanner scanner;
        scanner = new Scanner(new File("numbers.txt"));
        while (scanner.hasNextLine()){
            String current = scanner.nextLine();
            System.out.println(current);
        }
    }

    public static void writeNumbers() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("numbers.txt")),true);
        for(int i = 0; i < 132; i ++){
            Random random = new Random();
             int t = random.nextInt();
            printWriter.println(t);
        }
        printWriter.close();
    }
}
