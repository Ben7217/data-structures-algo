package algorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {1, 4, 2, 3, 5, 7, 98, 3434, 2, 34};

        MergeSort sorter = new MergeSort();

        sorter.sort(array);

        for (int anArray : array) {
            System.out.println(anArray);
        }


    }

    void sort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    void sort(int[] a, int start, int end) {
        if (end <= start) {
            return;
        }
        int middle = (start + end) / 2;
        sort(a, start, middle);
        sort(a, middle + 1, end);
        merge(a, start, middle, end);
    }


    void merge(int[] a, int start, int middle, int end) {
        int temp[] = new int[end - start + 1];

        // index counter for the left side
        int leftSlot = start;

        // index counter for the right side
        int rightSlot = middle + 1;

        int k = 0;

        // if left slot exceeds middle, then we are done. If right end is out of bounds (exceeds the end) we are done.
        while (leftSlot <= middle && rightSlot <= end) {
            if (a[leftSlot] < a[rightSlot]) {
                temp[k] = a[leftSlot];
                leftSlot++;
            } else {
                temp[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }

        /**
         * When we get to this point, the loop has completed and both sides are merged/sorted.
         */

        if (leftSlot <= middle) { // you can consider the right side done being sorted. Left must be sorted already
            while (leftSlot <= middle) {
                temp[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
           while (rightSlot <= end) {
               temp[k] = a[rightSlot];
               rightSlot++;
               k++;
           }
        }

        System.arraycopy(temp,0,a,start,temp.length);
}
}

