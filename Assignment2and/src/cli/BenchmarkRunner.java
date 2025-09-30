package cli;

import java.util.Random;
import algorithms.SelectionSort;
import metrics.PerformanceTracker;

public class BenchmarkRunner{
    public static void main(String[] args){
        int[] sizes = {100, 1000, 10000, 100000};
        Random rand = new Random();

        for (int n : sizes) {
            int[] array = rand.ints(n, 0, 1_000_000).toArray();

            PerformanceTracker tracker = new PerformanceTracker();

            int[] copy = array.clone();
            SelectionSort selectionSort = new SelectionSort(tracker);
            tracker.reset();
            selectionSort.sort(copy);

            System.out.println("SelectionSort | n=" + n + " | " + tracker);
            System.out.println("---------------------------------------------------");
        }
    }
}
