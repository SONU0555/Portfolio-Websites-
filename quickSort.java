
public class quickSort {
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr, int str, int end){
        int pivot = arr[str];
        int cnt = 0;
        for(int i = str + 1; i <= end; i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = str + cnt;
        swap(arr, str, pivotIdx);
        int i = str;
        int j = end;
        while(i < pivotIdx && j > pivotIdx){
           while(arr[i] <= pivot) i++;
           while(arr[j] > pivot) j--;
           if(i < pivotIdx && j > pivotIdx){
             swap(arr, i, j);
             i++;
             j--;
           }
        }
        return pivotIdx;
    }
    static void quickSortAlgo(int[] arr, int str, int end){
        //base case
        if(str >= end){
            return;
        }
        int pi = partition(arr, str, end);
        quickSortAlgo(arr, str, pi-1);
        quickSortAlgo(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] unSortArr = {1,7,3,9,4,5,7};  
        quickSortAlgo(unSortArr, 0, unSortArr.length-1);
        for(int val : unSortArr){
          System.out.println(val);
        }
    }
}
