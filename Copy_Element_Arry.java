import java.util.*;

public class Copy_Element_Arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }
        for (int j = 0; j < arr.length; j++) {
            for (int j2 = 0; j2 < copy.length; j2++) {
                copy[j2] = arr[j];

            }
            System.out.println(copy[j]);

        }

    }

}
