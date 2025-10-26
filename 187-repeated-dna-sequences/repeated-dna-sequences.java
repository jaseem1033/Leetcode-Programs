class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> resultList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> resultSet = new HashSet<>();

        for(int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            if(set.contains(str)) resultSet.add(str);
            else set.add(str);
        }
        return new ArrayList(resultSet);
    }
}