public class NinjaSortings {

    // 01. Selection Sort....
    public static void selectionSort(int[] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            // swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

        // 'or'...... 
        for(int i=0; i<=arr.length-2;i++){
            int minpos=i;
            for(int j=i;j<arr.length-1;j++)
        }
    }

    // 02. Bubble Sort...
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


}