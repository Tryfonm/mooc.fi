/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {
        this.value -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            for (int i = 0; i < increaseBy; i++) {
                this.increase();
            }
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            for (int i = 0; i < decreaseBy; i++) {
                this.decrease();
            }
        }
    }
}
