class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d%=n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void reverseArray(int arr[],int fst,int lst)
    {
        while(fst<lst)
        {
            int temp=arr[fst];
            arr[fst]=arr[lst];
            arr[lst]=temp;
            fst++;
            lst--;
        }
    }
}