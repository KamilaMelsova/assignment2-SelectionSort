package algorithms;
import metrics.PerformanceTracker;

public class SelectionSortTest{
    public static void main(String[] args){
        PerformanceTracker tracker = new PerformanceTracker();
        SelectionSort sort = new SelectionSort(tracker);

        testEmptyArray(sort);
        testSingleElement(sort);
        testSimpleArray(sort);
        testWithDuplicates(sort);
        testReverseSorted(sort);
    }

    private static void testEmptyArray(SelectionSort sort){
        int[] arr = {};
        sort.sort(arr);
        printResult(isSorted(arr), "testEmptyArray");
    }
    private static void testSingleElement(SelectionSort sort){
        int[] arr = {42};
        sort.sort(arr);
        printResult(isSorted(arr), "testSingleElement");
    }
    private static void testSimpleArray(SelectionSort sort){
        int[] arr = {5, 3, 1, 4, 2};
        sort.sort(arr);
        printResult(isSorted(arr), "testSimpleArray");
    }
    private static void testWithDuplicates(SelectionSort sort){
        int[] arr = {3, 1, 2, 3, 1};
        sort.sort(arr);
        printResult(isSorted(arr), "testWithDuplicates");
    }
    private static void testReverseSorted(SelectionSort sort){
        int[] arr = {5, 4, 3, 2, 1};
        sort.sort(arr);
        printResult(isSorted(arr), "testReverseSorted");
    }
    private static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    private static void printResult(boolean ok, String testName){
        if (ok) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}
