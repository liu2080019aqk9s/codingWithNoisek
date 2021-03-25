
import java.util.ArrayList;
/**
 *
 * @author Kasia
 */
public class HashMap<K, V> {
    
    private ArrayList<Pair<K, V>>[] hashMap;
    private int size;

    public HashMap() {
        this.hashMap = new ArrayList[32];
        this.size = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % hashMap.length);
        if (hashMap[hashValue] == null) {
            return null;
        }
        
        ArrayList<Pair<K, V>> valuesAtIndex = hashMap[hashValue];
        
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if(key.equals(valuesAtIndex.get(i).getKey())) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        
        return null;
    }
    
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % hashMap.length);
        if(hashMap[hashValue] == null) {
            hashMap[hashValue] = new ArrayList<>();
        }
        
        return hashMap[hashValue];
    }
    
    private int getIndexOfKey(ArrayList<Pair<K, V>> valuesAtIndex, K key) {
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if(key.equals(valuesAtIndex.get(i).getKey())) {
                return i;
            }
        }
        
        return -1;
    }
    
    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            size ++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if(1.0 * size / hashMap.length > 0.75) {
            grow();
        }
    }
    
    private void copy(ArrayList<Pair<K, V>>[] newHashMap, int fromIndex) {
        for (int i = 0; i < hashMap[fromIndex].size(); i++) {
            Pair<K, V> value = hashMap[fromIndex].get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newHashMap.length);
            if (newHashMap[hashValue] == null) {
                newHashMap[hashValue] = new ArrayList<>();
            }
            
            newHashMap[hashValue].add(value);
        }
    }
    
    private void grow() {
        ArrayList<Pair<K, V>>[] newHashMap = new ArrayList[hashMap.length * 2];
        
        for (int i = 0; i < hashMap.length; i++) {
            copy(newHashMap, i);
        }
        
        hashMap = newHashMap;
    }
    
    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }
        
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
        
        Pair<K, V> value = valuesAtIndex.get(index);
        valuesAtIndex.remove(index);
        return value.getValue();
    }
}