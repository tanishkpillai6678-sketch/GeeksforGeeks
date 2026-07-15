class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            list.add(arr[i]);
        }
        Collections.sort(list);
        int n=list.get(k-1);
        return n;
    }
}
