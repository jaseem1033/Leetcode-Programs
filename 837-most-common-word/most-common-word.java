class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] arr=paragraph.split("[^a-zA-Z]+");
        ArrayList<String>al=new ArrayList<>(Arrays.asList(banned));
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:arr)
        { s=s.toLowerCase();
            if(!al.contains(s))
                hm.put(s,hm.getOrDefault(s,0)+1);}
        int k=0;
        String str="";
        for(String i:hm.keySet())
        {
                if(hm.get(i)>k)
                {
                    k=hm.get(i);
                    str=i;
                }
        }
        return str;
    }
}