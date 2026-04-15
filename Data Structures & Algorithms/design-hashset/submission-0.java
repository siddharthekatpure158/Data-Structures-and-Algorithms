class MyHashSet {
    private boolean[] storage;
    public MyHashSet() {
        storage=new boolean[100000000];
    }
    
    public void add(int key) {
        storage[key]=true;
    }
    
    public void remove(int key) {
        storage[key]=false;
    }
    
    public boolean contains(int key) {
        return storage[key];
    }
}

