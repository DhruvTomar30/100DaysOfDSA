public class SortingII{

    // Merge Sort....
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }








    // Main....
    public static void main(String[] args) {
        int N = 7;
        int[] ARR = {2, 13, 4, 1, 3, 6, 28};
        int l = 0;
        int r = N - 1;

        mergeSort(ARR, l, r);

        System.out.print("Sorted array: ");
        for (int num : ARR) {
            System.out.print(num + " ");
        }
    }















    public static void main(String args[]){
        
    }
}