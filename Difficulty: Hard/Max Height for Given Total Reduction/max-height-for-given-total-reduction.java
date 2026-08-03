class Solution {
    static boolean isValidAns(int arr[],int m,int mid){
        long wood=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>mid){
                wood=wood+(arr[i]-mid);
            }
        }
        if(wood>=m){
            return true;
        }
        return false;
        
    }
    int maxHeight(int[] arr, int m) {
        // code here
        int n=arr.length;
        int s=0;
        int max=arr[0];
        for(int i=1;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int e=max;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(arr,m,mid)){
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
