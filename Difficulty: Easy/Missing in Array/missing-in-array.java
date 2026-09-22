class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
}