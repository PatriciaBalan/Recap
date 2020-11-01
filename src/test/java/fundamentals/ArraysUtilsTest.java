package fundamentals;

import algorithms.ArrayUtils;
import org.junit.jupiter.api.*;

public class ArraysUtilsTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before all tests");
    }

    @Test
    public void isPalindromTest() {

        //given
        int[] e1 = { 1, 2, 5, 5, 2, 1};
        int[] e2 = { 2, 1, 1, 3, 2, 1};
        int[] e3 = { 1, 3, 5, 3, 1};
        int[] e4 = { 4, 8, 7};
        int[] e5 = { 10, 20, 20, 30, 40, 50, 50};

        //when
        boolean testResultE1 = ArrayUtils.isPalindrom(e1);

        //then
        Assertions.assertTrue(testResultE1);
        Assertions.assertFalse(ArrayUtils.isPalindrom(e2));
        Assertions.assertTrue(ArrayUtils.isPalindrom(e3));
        Assertions.assertFalse(ArrayUtils.isPalindrom(e4));
        Assertions.assertFalse(ArrayUtils.isPalindrom(e5));
    }

    // metodele de test -> nu sunt statice si nu returneaza nimic si nu au parametrii

    @Test
    public void findMissingNumberTest() {
       //given
        int[] a1 = {1,2,4,5};
        int maxNumber = 5;

       //when then
       int result = ArrayUtils.findMissingNumber(a1, 5);
       Assertions.assertEquals(3, result);

       int resultUsingSum = ArrayUtils.findMissingNumberUsingSum(a1, 5);
       Assertions.assertEquals(3, resultUsingSum);
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After all test");
    }
}
