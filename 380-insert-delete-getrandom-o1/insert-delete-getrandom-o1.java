class RandomizedSet {
    HashMap <Integer,Integer> map;
    List<Integer> list;
     Random random = new Random();

    public RandomizedSet() {
        map = new HashMap <>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val,val);
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)) {
            map.remove(val);
            return true;
        }
        else return false;
    }
    
    public int getRandom() {
        list = new ArrayList<>(map.keySet());
        return (list.get(random.nextInt(map.size())));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */