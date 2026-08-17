class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=arr[0];
        int max=0;
        for(int i=0;i<=arr.length-1;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<=arr.length-1;i++){
            int freq=map.get(arr[i]);
            if(freq>max || (freq==max && arr[i]>ans)){
                max=freq;
                ans=arr[i];
            }
        }
        return ans;
    }
}