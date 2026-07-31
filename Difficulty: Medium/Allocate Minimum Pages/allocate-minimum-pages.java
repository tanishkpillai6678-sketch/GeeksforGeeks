class Solution {
    static boolean isValidAns(int arr[],int k,long mid){
        int student=1;
        int pages=0;
        for(int i=0;i<=arr.length-1;i++){
          if(pages+arr[i]<=mid){
              pages=pages+arr[i];
          }
          else{
              student++;
              if(student>k || arr[i]>mid){
                  return false;
              }
              else{
                  pages=0;
                  pages=pages+arr[i];
              }
          }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k){
            return -1;
        }
        int n=arr.length;
        long s=1;
        long sum=0;
        for(int i=0;i<=n-1;i++){
            sum=sum+arr[i];
        }
        long e=sum;
        long ans=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(isValidAns(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }  
        }
        return (int)ans;
    }
}