package algorithms;

public class ArrayUtils {

//cum verifici daca un array e palindrom (citire la fel din ambele parti)

    public static boolean isPalindrom(int[] arr) {

        boolean isPalindrom = false;

        // palindrom:int[] arr = {1,3,5,5,3,1}
        // i : arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]
        // j : arr[5], arr[4], arr[3], arr[2], arr[1], arr[0]
        // i: 0,1,2
        // j: 2,1,0

        for(int i = 0,j = arr.length - 1; i <= j; i++,j--) {
            if(arr[i] != arr[j]) {
                isPalindrom = false;
                break;
                // scoate break si atunci ti da true true daca un arr e impar

            } else {
                isPalindrom = true;
            }
        }
        return isPalindrom;
    }
}