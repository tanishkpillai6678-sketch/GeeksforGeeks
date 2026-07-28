class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        int lb=n;
        int ub=n;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]>=target){
                lb=mid;
                e=mid-1;
            }
            if(arr[mid]<target){
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        s=0;
        e=n-1;
        mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]<=target){
                s=mid+1;
            }
            if(arr[mid]>target){
                ub=mid;
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ub-lb;
    }
}
