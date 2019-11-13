import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int intarray[] = new int[15];
        long longarray[];
        double doublearray[];
        boolean booleanarray[];
        longarray = new long[100];
        doublearray = new double[80];
        int[] intarray1 = intArrayCreator(intarray);
        int[] intarray2 = bubbleSort(intarray1);
        long[] longarray1 = longArrayCreator(longarray);
        long[] longarray2 = insertionSort(longarray1);
        for (int i = 0; i < intarray2.length; i ++){
            System.out.print(intarray2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < longarray2.length; i ++){
            System.out.print(longarray2[i] + " ");
        }
    }
    public static int[] bubbleSort(int[] intarray1){
        boolean sorted = false;
        int j;
        while (!sorted){
            sorted = true;
            for (int i = intarray1.length - 1; i > 0; i --){
                if (intarray1[i] < intarray1[i - 1]){
                    j = intarray1[i];
                    intarray1[i] = intarray1[i - 1];
                    intarray1[i - 1] = j;
                    sorted = false;
                }
            }
        }
        return intarray1;
    }
    public static long[] insertionSort(long[] longarray) {
        for (int i = 1; i < longarray.length; i++) {
            long current = longarray[i];
            int j = i - 1;
            while(j >= 0 && current < longarray[j]) {
                longarray[j+1] = longarray[j];
                j --;
            }
            longarray[j+1] = current;
        }
        return longarray;
    }
    public static int[] intArrayCreator(int intarray[]) {
        for (int q = 0; q < intarray.length; q++){
            Random random = new Random();
            intarray[q] = random.nextInt();
        }
        return intarray;
    }

    public static long[] longArrayCreator(long longarray[]) {
        for (int q = 0; q < longarray.length; q++){
            Random random = new Random();
            longarray[q] = random.nextInt();
        }
        return longarray;
    }
    public static double[] doubleArrayCreator(double doublearray[]) {
        for (int q = 0; q < doublearray.length; q++){
            Random random = new Random();
            doublearray[q] = random.nextDouble();
        }
        return doublearray;
    }
    public static boolean[] booleanArrayCreator(boolean booleanarray[]) {
        for (int q = 0; q < booleanarray.length; q++){
            Random random = new Random();
            booleanarray[q] = random.nextBoolean();
        }
        return booleanarray;
    }
}
