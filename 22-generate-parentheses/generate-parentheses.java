class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0,close = 0;
        String s = "";
        List<String> list = new ArrayList<>();
        gen(open,close,s,list,n);
        return list;
    }
    public void gen(int open,int close,String s,List<String> list,int n) {
        if(s.length() == n*2) list.add(s);
        if(open < n) gen(open + 1,close,s + "(",list,n);
        if(close < open) gen(open,close + 1,s + ")",list,n);
    }
}