class Node {
    int key, value;
    Node next, prev;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    Map<Integer, Node> mp;
    int capacity;
    Node left,right;

    public LRUCache(int capacity) {
        mp = new HashMap<>();
        this.capacity = capacity;
        left = new Node(0,0);
        right = new Node(0,0);

        left.next = right;
        right.prev= left;

    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
           Node node = mp.get(key);
           remove(node);
           insertRight(node);
           return node.value;   
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            remove(mp.get(key));
            mp.remove(key);
          
        }else{
            if(mp.size() == capacity){
                Node lru = left.next;
                remove(lru);
                mp.remove(lru.key);
            }
        }
        Node newNode = new Node(key,value);
        insertRight(newNode);
        mp.put(key, newNode);
         
    }

    public void insertRight(Node newNode){
        newNode.next = right;
        newNode.prev = right.prev;
        right.prev.next = newNode;
        right.prev = newNode;
    }

    public void remove(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

}
