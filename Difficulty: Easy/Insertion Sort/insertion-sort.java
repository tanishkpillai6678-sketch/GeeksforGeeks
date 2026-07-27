class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            int currvalue=arr[i];
            int prev=i-1;
            while(prev>=0&&currvalue<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currvalue;
        }
    }
}