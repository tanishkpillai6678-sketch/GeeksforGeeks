class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        Set<Integer> set1=new LinkedHashSet<>();
        for(int i=0;i<=a.length-1;i++)
        {
            set1.add(a[i]);
        }
        Set<Integer> set2=new LinkedHashSet<>();
        for(int i=0;i<=b.length-1;i++)
        {
            set2.add(b[i]);
        }
        Set<Integer> set3=new LinkedHashSet<>();
        for(int i=0;i<=c.length-1;i++)
        {
            set3.add(c[i]);
        }
        set1.retainAll(set2);
        set1.retainAll(set3);
        return new ArrayList<>(set1);
    }
}