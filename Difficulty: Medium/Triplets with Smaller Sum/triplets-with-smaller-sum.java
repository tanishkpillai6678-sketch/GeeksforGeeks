class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans=0;
        for(int i=0;i<=n-1;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                if(arr[i]+arr[s]+arr[e]>=sum){
                    e--;
                }
                else{
                    ans=ans+(e-s);
                    s++;
                }
            }
        }
        return ans;
    }
}