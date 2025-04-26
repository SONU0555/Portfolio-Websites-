public class CountSort {

    static int findMix(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void simpleCountSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMix(arr);
        //frequency count arr
        int[] frqArrSize = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            frqArrSize[arr[i]]++;
        }
           //prefix arr
        for(int i = 1; i < frqArrSize.length; i++){
             int sum = frqArrSize[i-1] + frqArrSize[i];
             frqArrSize[i] = sum;
            }
            // sorting array in stable formate
            for(int i = arr.length-1; i >= 0; i--){
               int stablePosition = frqArrSize[arr[i]]-1;
               output[stablePosition] = arr[i];
               frqArrSize[arr[i]]--;
            }
            // copy all elements of output array in original array
            for(int i = 0; i < n; i++){
                arr[i] = output[i];
            }
        }


    static void displayAns(int[] ansArr){
       for(int val : ansArr){
        System.out.print(val);
       }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,6,1,2,3,7};
        simpleCountSort(arr);
        displayAns(arr);
    }
}