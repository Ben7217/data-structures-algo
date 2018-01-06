package algorithms;

public class InsertionSort {

    public static void main(String[] args) {

        InsertionSort gonnaSort = new InsertionSort();
        int[] needToSort = new int[]{3, 4, 3, 2, 67, 8, 5, 6, 3,};

        gonnaSort.sort(needToSort);

        Print(needToSort);


    }


    void sort(int[] arr)
    {

    }

    static void Print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}
