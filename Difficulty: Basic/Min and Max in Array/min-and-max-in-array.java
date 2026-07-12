class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
}
