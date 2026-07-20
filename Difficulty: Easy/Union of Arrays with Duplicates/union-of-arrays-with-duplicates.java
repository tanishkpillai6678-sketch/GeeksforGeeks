class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<=a.length-1;i++)
        {
            set.add(a[i]);
        }
        for(int i=0;i<=b.length-1;i++)
        {
            set.add(b[i]);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        return list;
    }
}