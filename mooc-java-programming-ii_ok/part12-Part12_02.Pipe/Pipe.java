
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class Pipe<T> {
    
    private ArrayList<T> pipe;
    
    public Pipe() {
        pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        //puts an object with a type in accordance with the type parameter given to the the class into the pipe.
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        //takes out the value, which has been in the pipe the longest. In case there is nothing in the pipe, 
        //return null. Calling the method returns the value, which has been in the pipe the longest, and 
        //removes it from the pipe.
        if (pipe.isEmpty()) {
            return null;
        }
        T fromPipe = pipe.get(0);
        pipe.remove(0);
        return fromPipe;
    }
    
    public boolean isInPipe() {
        //returns the value true if the pipe has values. In case the pipe is empty, it returns the value false.
        return !pipe.isEmpty();
    }
}
