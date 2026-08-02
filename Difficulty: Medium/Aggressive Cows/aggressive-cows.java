class Solution {
    static boolean isValidAns(int arr[],int k,int mid){
        int cow=1;
        int lastpos=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]-arr[lastpos]>=mid){
                cow++;
                lastpos=i;
                if(cow==k){
                    return true;
                }
            }
        }
        return false;
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        Arrays.sort(arr);
        int n=arr.length;
        int s=0;
        int e=arr[n-1]-arr[0];
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}