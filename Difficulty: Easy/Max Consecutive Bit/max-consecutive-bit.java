class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count0=0;
        int count1=0;
        int max=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                count1=0;
                count0++;
                max=Math.max(max,count0);
            }
            else{
                count0=0;
                count1++;
                max=Math.max(max,count1);
            }
        }
        return max;
    }
}
