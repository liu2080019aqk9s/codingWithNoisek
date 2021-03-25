/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class List<T> {
    
    private T[] list;
    private int firstFreeIndex;

    public List() {
        this.list = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(T element) {
        if (list.length == firstFreeIndex) {
            this.grow();
        }
        
        list[firstFreeIndex] = element;
        firstFreeIndex ++;
    }
    
    private void grow() {
        int newSize = list.length + list.length/2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < firstFreeIndex; i++) {
            newValues[i] = list[i];
        }
        
        list = newValues;
    }
    
    public int indexOfValue(T value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if(value.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(T value) {
        return indexOfValue(value) >=0;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex; i++) {
            list[i] = list[i + 1];
        }
    }
    
    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        
        this.moveToTheLeft(indexOfValue);
        firstFreeIndex --;
    }
    
    public int size() {
        return firstFreeIndex;
    }
    
    public T value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + (firstFreeIndex - 1 )+ "]");
        } 
        
        return list[index];
    }
}
