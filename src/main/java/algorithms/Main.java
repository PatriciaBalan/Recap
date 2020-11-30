package algorithms;

import static algorithms.ArrayUtils.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,3,5,1,7};
        int[] arr2 = {1,2,3,7,3,2,1};
        int[] a = {1,2,3,4,5,6};
        String s1 = "mare";
        String s2 = "rame";

        System.out.println(ArrayUtils.isPalindrom(arr));
        System.out.println(ArrayUtils.isPalindrom(arr2));

        System.out.println("________________");

        inverseArray(arr);
        reverseArray(a);

        System.out.println();
        System.out.println("________________");

        prime(4);
        prime(3);

        System.out.println("_________________");

        interSchimb(5,3);

        System.out.println("__________________");



    }
}
