package algorithms;

import metrics.PerformanceTracker;

public class SelectionSort{
    private final PerformanceTracker tracker;
    public SelectionSort(PerformanceTracker tracker) {
        this.tracker = tracker;
    }

    public void sort(int[] array){
        if (array != null && array.length > 1){
            for(int i = 0; i < array.length - 1; ++i){
                int minIndex = i;
                boolean swapped = false;

                for(int j = i + 1; j < array.length; ++j){
                    this.tracker.countComparison();
                    this.tracker.countArrayAccess();
                    this.tracker.countArrayAccess();
                    if (array[j] < array[minIndex]){
                        minIndex = j;
                        swapped = true;
                    }
                }
                if (!swapped){
                    break;
                }
                if (minIndex != i){
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                    this.tracker.countSwap();
                    this.tracker.countArrayAccess();
                    this.tracker.countArrayAccess();
                }
            }

        }
    }
}

