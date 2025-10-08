class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : arr) freq.put(i, freq.getOrDefault(i, 0) + 1);

        for(int i : freq.keySet()) list.add(i);

        Collections.sort(list, (a, b) -> {
            return freq.get(b) - freq.get(a);
        });

        int size = arr.length;
        int count = 0;
        while(size > arr.length/2) {
            size -= freq.get(list.get(0));
            count++;
            list.remove(0);
        }
        return count;
    }
}