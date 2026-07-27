class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int minindex=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    }
}