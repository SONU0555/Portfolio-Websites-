import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    static void bucketSrt(float[] arr){
        int n = arr.length;

        //Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        //Create empty buckets
        for(int i = 0; i < n; i++){
            buckets[i] = new ArrayList<Float>();
        }

        //Add all elements in buckets
        for(int i = 0; i < n; i++){
            int bucketIdx = (int) arr[i] * 10;
            buckets[bucketIdx].add(arr[i]);
        }

        //Sort each buckets individually
        for(int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }

        //Merge all buckets to get final sorted array
        int index = 0;
        for(int i = 0; i < n; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            }
        }


    }

    public static void main(String[] args) {
        float[] arr = {0.23f,0.1f,0.65f,0.82f,0.01f,0.12f};
        bucketSrt(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
}
