public class RadixSort {

    static int findMix(int[] arr){
        int mx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
       
        return mx;
    }

    static void CountSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int max = 10;

        //making frequency count array
        int[] frqArrSize = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            frqArrSize[(arr[i]/place)%10]++;
        }

           //prefix arr
        for(int i = 1; i < frqArrSize.length; i++){
             int sum = frqArrSize[i-1] + frqArrSize[i];
             frqArrSize[i] = sum;
            }

            // sorting array in stable formate
            for(int i = arr.length-1; i >= 0; i--){
               int stablePosition = frqArrSize[(arr[i]/place)%10]-1;
               output[stablePosition] = arr[i];
               frqArrSize[(arr[i]/place)%10]--;
            }
            // copy all elements of output array in original array
            for(int i = 0; i < n; i++){
                arr[i] = output[i];
            }
        }

        // sorting according to digits places
        static void radixSrt(int[] arr){
              int maxVal = findMix(arr);
              for(int place = 1; maxVal/place > 0; place *= 10){
                CountSort(arr, place);
              }
        }

    public static void main(String[] args) {
        int[] arr = {401,342,962,121,012,003};
        radixSrt(arr);
        for(int val : arr){
            System.out.print(val + ",");
        }
    }
}