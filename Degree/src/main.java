import java.util.Scanner;
public class main {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
                long a;
        System.out.println("Введите число и степень по отдельности");
        a = scanner.nextLong();
        char b;
        b = scanner.next().charAt(0);
        long result = -1;
        if(b == '2'){
           result = two(a);
        }
        else if(b == '3'){
            result = three(a);
        }
        else if(b == '4'){
            result = four(a);
        }
        else if(b == '5'){
            result = five(a);
        }
        System.out.println(result);
    }

    private static long five(long a) {
        return a * a* a * a * a;
    }

    private static long four(long a) {
        return a * a * a * a;
    }

    private static long three(long a) {
        return a * a * a;
    }

    private static long two(long a){
        return a * a;
    }
}
