class Solution {
    static boolean isValidAns(int n,int ranks[],int mid,int m){
        int count =0;
        for(int i=0;i<=ranks.length-1;i++){
            int currchefrank=ranks[i];
            int timetaken=0;
            int j=1;
            while(timetaken<=mid){
                if(timetaken+j*currchefrank<=mid){
                    timetaken=timetaken+j*currchefrank;
                    count++;
                    j++;
                }
                else{
                    break;
                }
            }
        }
        if(count>=n){
            return true;
        }
        else{
            return false;
        }
    }
    public int minTime(int[] ranks, int n) {
        // code here
        int m=ranks.length;
        int s=0;
        int maxrank=-1;
        for(int i=0;i<=m-1;i++){
            if(ranks[i]>maxrank){
                maxrank=ranks[i];
            }
        }
        int e=maxrank*(n*(n+1)/2);
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(n,ranks,mid,m)){
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