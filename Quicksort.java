public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {2,7,3,9,5,1,0,4};
        quick(arr,0,arr.length);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void quick(int[] arr,int low,int high){
        if(low>high){
            return;
        }
        int start = low;
        int end = high;
        int pivot = (start + (end-start))/2;

        while(start<=end){
            while(arr[start]<arr[pivot]){
                start++;
            }
            while(arr[end]>arr[pivot]){
                end--;
            }
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quick(arr,low,end);
        quick(arr,start,high);
    }
}
