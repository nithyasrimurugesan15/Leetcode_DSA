class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        res.add(sub);
       
        for(int i=1;i<n;i++) {
         List<Integer> prev = res.get(i-1);
         List<Integer> s = new ArrayList<>();
           s.add(1);
            for(int j=1;j<prev.size();j++) {
                int sum=prev.get(j)+prev.get(j-1);
                s.add(sum);
            }
            s.add(1);
            res.add(s);
        }
        return res;
    }
}