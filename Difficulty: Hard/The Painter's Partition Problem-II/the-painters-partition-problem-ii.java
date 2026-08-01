class Solution {
    static boolean isValidAns(int arr[],int k,int mid){
        int painters=1;
        int time=0;
        for(int i=0;i<=arr.length-1;i++){
            if(time+arr[i]<=mid){
                time+=arr[i];
            }
            else{
                painters++;
                if(painters>k || arr[i]>mid){
                    return false;
                }
                else{
                    time=0;
                    time+=arr[i];
                }
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        if(k>arr.length){
            return -1;
        }
        int n=arr.length;
        int s=0;
        int sum=0;
        int ans=-1;
        for(int i=0;i<=n-1;i++){
            sum+=arr[i];
        }
        int e=sum;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
