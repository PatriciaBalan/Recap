package algorithms;

public class ArrayUtils {

//cum verifici daca un array e palindrom (citire la fel din ambele parti)

    public static boolean isPalindrom(int[] arr) {

        // v1 isPalindrom
//        boolean isPalindrom = false;
//        palindrom:int[] arr = {1,3,5,5,3,1}

        // i : arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]
        // j : arr[5], arr[4], arr[3], arr[2], arr[1], arr[0]
        // i: 0,1,2
        // j: 2,1,0

//        for(int i = 0,j = arr.length - 1; i <= j; i++,j--) {
//            if(arr[i] != arr[j]) {
//                isPalindrom = false;
//                break;
//                // scoate break si atunci ti da true true daca un arr e impar
//
//            } else {
//                isPalindrom = true;
//            }
//        }
//        return isPalindrom;
//    }
//
        // v2 isPalindrom
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

                                                // V1 reverse array
    public static int inverseArray(int[] arr) {

        int[] array = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            array[j] = arr[i];
            j++;
        }

        System.out.println();
        System.out.print("[");

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }

        System.out.println("]");
        return j;
    }
                                                 // V2 reverse array
    public static void reverseArray(int[] a){
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            int b = a[i];
            a[i] = a[j];
            a[j] = b;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }
    }

//    public static void main(String[] args) {
//
//        int[] n ={1,2,3,4,7};
//
//        for (int i = 0; i < n.length; i++) {
//            System.out.print(n[i]);
//        }
//        System.out.println();
//
//        for (int j = n.length - 1; j >= 0 ; j--) {
//            System.out.print(n[j]);
//        }
//    }


                                                 // numar prim
    public static void prime(int n) {

        boolean noPrime = false;

        for (int i = 2; i <= n/2; i++) {

            if(n % i == 0 ) {
                noPrime = true;
                break;
            }
        }

        if(!noPrime)
            System.out.println("este numar prim");
        else
            System.out.println("nu este numar prim");

    }

                                                     // V1 vector de frcventa :
                                                     // - de verificat intro lista de nr de la 1 la 1000 care este numarul care lipseeste
    public static int findMissingNumber(int[] array, int maxNumber) {
        int[] f = new int[maxNumber + 1];

        for (int i = 0; i < f.length; i++) {
            f[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            f[array[i]]++;
        }

        for (int i = 1; i < f.length; i++) {
            if (f[i] == 0) {
                return i;
            }
        }
        return 0;
    }

                                                    // V2 vector de frcventa
    public static int findMissingNumberUsingSum(int[] array, int maxNumber) {

        //[1,2,3,4,5] = 1+2+3+4_5 = 15
        //sum = n(n+1)/2 = 5(5+1) = 15

        int sum = 0;
        int expectedSum = maxNumber * (maxNumber + 1)/2;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return expectedSum - sum;
    }

                                                    //interschimbare a doua numere

    public static void interSchimb(int a, int b) {
        System.out.println("Initial: " + a + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Dupa: " + a + b);
    }
}

