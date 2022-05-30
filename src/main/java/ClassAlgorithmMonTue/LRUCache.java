package ClassAlgorithmMonTue;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

//        Implement an LRUCache class for a Least Recently Used (LRU) cache. The class should support:
//
//        Inserting key-value pairs with the insertKeyValuePair method.
//        Retrieving a key's value with the getValueFromKey method.
//        Retrieving the most recently used (the most recently inserted or retrieved) key with the getMostRecentKey method.
//        Try to implement each of these methods to run in constant time.
//
//        Additionally, the LRUCache class should store a maxSize property set to the size of the cache, which is passed in as an argument during instantiation. This size represents the maximum number of key-value pairs that the cache can store at once. If a key-value pair is inserted in the cache when it has reached maximum capacity, the least recently used key-value pair should be evicted from the cache and no longer retrievable; the newly added key-value pair should effectively replace it.
//
//        Note that inserting a key-value pair with an already existing key should simply replace the key's value in the cache with the new value and shouldn't evict a key-value pair if the cache is full. Lastly, attempting to retrieve a value from a key that isn't in the cache should return None / null.
public class LRUCache {
    int maxSize;
    Map<String, Integer> cache = new LinkedHashMap<>();
    LinkedList<String> keys = new LinkedList<>();
    public LRUCache(int maxSize) {
        this.maxSize = Math.max(maxSize, 1);
    }
    public void insertKeyValuePair(String key, int value) {
        // Write your code here.
        if (cache.size() >= maxSize) {
            cache.remove(keys.poll());
        }
        cache.put(key, value);
        keys.remove(key);
        keys.add(key);
    }
    public LRUResult getValueFromKey(String key) {
        // Write your code here.
        if (!cache.containsKey(key))
            return new LRUResult(false, null);
        keys.remove(key);
        keys.add(key);
        return new LRUResult(true, cache.get(key));
    }
    public String getMostRecentKey() {
        // Write your code here.
        return keys.size() > 0 ? keys.get(keys.size() - 1) : null;
    }
}



class LRUResult {
    boolean found;
    Integer value;
    public LRUResult(boolean found, Integer value) {
        this.found = found;
        this.value = value;
    }
}
