import java.util.ArrayList;

public class mergeSort{
  // static void merge(int[] arr, int l, int mid, int r){
  //      int n1 = mid-l+1;
  //      int n2 = r-mid;
  //      int[] left = new int[n1];
  //      int[] right = new int[n2];
  //      int i, j, k;
  //      for(i = 0; i < n1; i++){
  //       left[i] = arr[l+i];
  //      };
  //      for(j = 0; j < n2; j++){
  //       right[j] = arr[mid+1+j];
  //      };
  //      i = 0;
  //      j = 0;
  //      k = l;
  //      while(i < n1 && j < n2){
  //         if(left[i] < right[j]){
  //           arr[k++] = left[i++];
  //         }else{
  //           arr[k++] = right[j++];
  //         }
  //      }
  //    while(i < n1){
  //     arr[k++] = left[i++];
  //    }
  //    while(j < n2){
  //     arr[k++] = right[j++];
  //    }

  // }


  // static void sortingAlgo(int[] arr, int l, int r){
  //   if(l >= r) return;

  //   int mid = (l + r)/2;
  //   sortingAlgo(arr, l, mid);
  //   sortingAlgo(arr, mid+1, r);
  //   merge(arr, l, mid, r);
  // }
  static ArrayList<Integer> mergeTwoList(int[] arr1, int[] arr2){
    ArrayList<Integer> ans = new ArrayList<>();
    
    int l1 = arr1.length;
    int l2 = arr2.length;
    int i = 0;
    int j = 0;
    while(i > l1 && j > l2){
      if(arr1[i] < arr2[j]){
        ans.add(arr1[i]);
        i++;
      }else{
        ans.add(arr2[j]);
        j++;
      }
    }
    return ans;
  }


  
  public static void main(String[] args) {
  
  }
}