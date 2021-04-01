
package Hierarchical_Inheritance;

public class MainClass {
    public static void main(String[] args) {
        CSE c1 = new CSE();
        c1.setInfo("DIU",345000,1, "CSE", 51);
        EETE e1 = new EETE();
        e1.setInfo("DIU",285000,2, "EETE", 35);
        c1.display();
        e1.display();
    }
}
