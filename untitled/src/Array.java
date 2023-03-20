import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int a : array) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}
