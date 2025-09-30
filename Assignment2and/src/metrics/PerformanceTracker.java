package metrics;

public class PerformanceTracker {
    private long comparisons;
    private long swaps;
    private long arrayAccesses;

    public PerformanceTracker() {
    }

    public void countComparison() {
        ++this.comparisons;
    }

    public void countSwap() {
        ++this.swaps;
    }

    public void countArrayAccess() {
        ++this.arrayAccesses;
    }

    public void reset() {
        this.comparisons = 0L;
        this.swaps = 0L;
        this.arrayAccesses = 0L;
    }

    public long getComparisons() {
        return this.comparisons;
    }

    public long getSwaps() {
        return this.swaps;
    }

    public long getArrayAccesses() {
        return this.arrayAccesses;
    }

    public String toString() {
        return "Comparisons=" + this.comparisons + ", Swaps=" + this.swaps + ", ArrayAccesses=" + this.arrayAccesses;
    }
}
