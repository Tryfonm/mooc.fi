/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Timer {

    private int s;
    private int h;

    public void Timer() {
        this.s = 0;
        this.h = 0;
    }

    public void advance() {
        if (this.h < 99) {
            this.h++;
        } else {
            if (this.s < 59) {
                this.s++;
                this.h = 0;
            } else {
                this.s = 0;
                this.h = 0;
            }
        }

    }

    public String toString() {
        if (this.s >= 10 && this.h >= 10) {
            return this.s + ":" + this.h;
        } else if (this.s >= 10 && this.h < 10) {
            return this.s + ":0" + this.h;
        } else if (this.s < 10 && this.h < 10) {
            return "0" + this.s + ":0" + this.h;
        } else {
            return "0" + this.s + ":" + this.h;
        }
    }
}
