public class SortingII{

    // 01. Merge Sort....
    public static void mergeSort(int[] arr, int si, int ei) {
        if(si >= ei) return;        // Base Case
        int mid= si + (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i= si;      // idx for 1st sorted part
        int j= mid+1;   // idx for 2nd sorted part
        int k=0;        // idx for temp

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for left overelements of 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for left over elements of 2nd Sorted part..
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy the temp array into original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    //02. Quick Sort... 
    public static void quickSort(int[] arr,int si, int ei) {
		if(si>=ei) return;
		// last element
		int pIdx=partition(arr,si,ei);
		quickSort(arr,si,pIdx-1);	// left
		quickSort(arr,pIdx+1, ei);	// right
	}
	public static int partition(int arr[], int si, int ei){
		int pivot=arr[ei];
		int i=si-1;  //to make place for ele. smaller than pivot
		for(int j=si; j<ei;j++){
			if(arr[j]<=pivot){
				i++;
				//swap
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		//swap
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		return i;
	}

}