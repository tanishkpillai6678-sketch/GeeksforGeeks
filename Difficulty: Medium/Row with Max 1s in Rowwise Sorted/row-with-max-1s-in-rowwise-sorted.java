class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int count=0;
        int mat[]=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            mat[i]=count;
            count=0;
        }
        int max=-1;
        int n=-1;
        for(int i=0;i<=mat.length-1;i++){
            if(mat[i]>max){
                max=mat[i];
                n=i;
            }
        }
        if(max==0){
            return -1;
        }
        return n;
    }
};