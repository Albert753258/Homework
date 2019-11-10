import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int intarray[];
        long longarray[];
        double doublearray[];
        boolean booleanarray[];
        intarray = new int[15];
        longarray = new long[100];
        doublearray = new double[80];
        booleanarray = new boolean[10];
        String intarrayString = Arrays.toString(intarray(intarray));
        System.out.print("Int array:   ");
        System.out.println(intarrayString);
        String longarrayString = Arrays.toString(longarray(longarray));
        System.out.print("Long array:   ");
        System.out.println(longarrayString);
        String doublearrayString = Arrays.toString(doublearray(doublearray));
        System.out.print("Double array:   ");
        System.out.println(doublearrayString);
        String booleanarrayString = Arrays.toString(booleanarray(booleanarray));
        System.out.print("Boolean array:   ");
        System.out.print(booleanarrayString);
    }
    public static int[] intarray(int intarray[]) {
        for (int q = 0; q < intarray.length; q++){
            Random random = new Random();
            intarray[q] = random.nextInt();
        }
        return intarray;
    }

    public static long[] longarray(long longarray[]) {
        for (int q = 0; q < longarray.length; q++){
            Random random = new Random();
            longarray[q] = random.nextInt();
        }
        return longarray;
    }
    public static double[] doublearray(double doublearray[]) {
        for (int q = 0; q < doublearray.length; q++){
            Random random = new Random();
            doublearray[q] = random.nextDouble();
        }
        return doublearray;
    }
    public static boolean[] booleanarray(boolean booleanarray[]) {
        for (int q = 0; q < booleanarray.length; q++){
            Random random = new Random();
            booleanarray[q] = random.nextBoolean();
        }
        return booleanarray;
    }
}
