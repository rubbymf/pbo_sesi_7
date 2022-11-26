/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Outer {
    int number = 0;

    private class Inner {
        public void print() {
            System.out.println("Mengakses inner class yang ke: " + (++number));
        }
    }

    void displayFromMethod() {
        Inner in = new Inner();
        in.print();
    }
}

class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayFromMethod();
        out.displayFromMethod();
    }
}