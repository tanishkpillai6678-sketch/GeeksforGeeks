class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }
}