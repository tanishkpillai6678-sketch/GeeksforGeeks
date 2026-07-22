class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
        
    }
}
