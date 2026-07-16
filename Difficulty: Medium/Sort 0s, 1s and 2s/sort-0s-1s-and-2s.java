class Solution {
    public void sort012(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            list.add(arr[i]);
        }
        Collections.sort(list);
        for(int i=0;i<=list.size()-1;i++)
        {
            arr[i]=list.get(i);
        }
    }
}