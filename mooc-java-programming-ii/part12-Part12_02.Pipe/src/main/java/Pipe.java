
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class Pipe<T> {

    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(0, value);
    }

    public T takeFromPipe() {
        if (this.pipe.size() != 0) {
            return this.pipe.remove(this.pipe.size() - 1);
        }
        return null;
    }

    public boolean isInPipe() {
        if (this.pipe.size() > 0) {
            return true;
        }
        return false;
    }
}
