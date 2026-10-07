class RandomizedSet {
    //0(1) insert, delete and random
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> arr = new ArrayList<>();

    public RandomizedSet() {
        //we dont really need anything here yet
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)){
            return false;
        }
        arr.add(val);
        map.put(val, arr.size()-1); //array list is size not length
        return true;
    }
    
    public boolean remove(int val) {
        //remove is a bit tricky
        //it should remove false if it isnt in the set
        //we want to get the index of the value we want to remove
        //we switch the last thing to that index. (update map)
        //then we delete that from array and map
        if (!map.containsKey(val)){return false;}
        int i = map.get(val); //index of thing we want to delete

        arr.set(i, arr.get(arr.size()-1)); //i of the array is now the end value
        map.put(arr.get(i),i);//switch in map

        arr.remove(arr.size()-1);//delte in both
        map.remove(val); //delete in both

        return true;

    }
    
    public int getRandom() {
        Random rand = new Random();
        return arr.get( rand.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
