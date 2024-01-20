// Java program to find index of 
import java.util.Arrays;

public class Search_Element {

    // find the index of an element
    public static int Index(int arr[], int t) {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int[] array = { 90, 3, 44, 5, 44, 22, 31 };
        int t = 3;

        // find the index of 5
        System.out.println("Index position of is: "
                + Index(array, t));

    }
}


