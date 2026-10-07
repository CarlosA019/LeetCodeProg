class RandomizedSet {
    Map<Integer,Integer> map = new HashMap<>();
    List<Integer> arr = new ArrayList<>();

    public RandomizedSet() {
    
    }
    
    public boolean insert(int val) {
        if ( map.containsKey(val)){
            return false;
        }
        arr.add(val);
        map.put(val, arr.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        //now lets remove from the array
        //but we have to get,switch and then delete
        //get
        int i = map.get(val);

        //switch (add the end at the position of i)
        arr.set(i,arr.get( arr.size()-1));
        //update map
        map.put(arr.get(i),i);
        //remove from list
        arr.remove(arr.size()-1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return arr.get( rand.nextInt(arr.size()) );
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
