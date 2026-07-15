class Solution {
    public void reverseArray(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<=list.size()-1;i++)
        {
            arr[i]=list.get(i);
        }
    }
}