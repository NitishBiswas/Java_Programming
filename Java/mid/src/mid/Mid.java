/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

interface A {

    void a();

    void b();

    void c();

    default void d() {
        System.out.println("I am D method");
    }
}

abstract class B implements A {

    public void c() {
        System.out.println("I am C method");
    }
}

class M extends B {

    public void a() {
        System.out.println("I am A method");
    }

    public void b() {
        System.out.println("I am B method");
    }
}

class AbsInter {

    public static void main(String args[]) {
        M m = new M();
        B b = new M();
        m.a();
        m.b();
  
        b.c();
    }
}
