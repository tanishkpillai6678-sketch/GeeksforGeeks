class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
        int p=-1;
        for(int i=0;i<=arr1.length-1;i++){
                p=Math.max(p,(k/arr1[i])*arr2[i]);
        }
        return p;
    }
}
