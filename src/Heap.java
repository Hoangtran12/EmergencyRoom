import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> {
    private final ArrayList<T> heapList;
    private final Comparator<? super T> comparator;

    public Heap(Comparator<? super T> comparator) {
        heapList = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T element) {
        heapList.add(element);
        int currentIndex = heapList.size() - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (comparator.compare(heapList.get(currentIndex), heapList.get(parentIndex)) < 0) {
                swap(currentIndex, parentIndex);
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    public T remove() {
        if (heapList.isEmpty()) {
            return null;
        }
        T removedElement = heapList.get(0);
        T lastElement = heapList.remove(heapList.size() - 1);
        if (!heapList.isEmpty()) {
            heapList.set(0, lastElement);
            int currentIndex = 0;
            while (currentIndex < heapList.size()) {
                int leftChildIndex = 2 * currentIndex + 1;
                int rightChildIndex = 2 * currentIndex + 2;
                int minIndex = currentIndex;
                if (leftChildIndex < heapList.size() && comparator.compare(heapList.get(leftChildIndex), heapList.get(minIndex)) < 0) {
                    minIndex = leftChildIndex;
                }
                if (rightChildIndex < heapList.size() && comparator.compare(heapList.get(rightChildIndex), heapList.get(minIndex)) < 0) {
                    minIndex = rightChildIndex;
                }
                if (minIndex != currentIndex) {
                    swap(currentIndex, minIndex);
                    currentIndex = minIndex;
                } else {
                    break;
                }
            }
        }
        return removedElement;
    }

    private void swap(int index1, int index2) {
        T temp = heapList.get(index1);
        heapList.set(index1, heapList.get(index2));
        heapList.set(index2, temp);
    }
}