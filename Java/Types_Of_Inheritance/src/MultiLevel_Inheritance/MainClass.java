
package MultiLevel_Inheritance;

public class MainClass {
    public static void main(String[] args) {
        OldMan ob1 = new OldMan();//Object of OldMan class
        ob1.setInfo(65,6.2);//Method Human class but we can access from OldMan class
        ob1.setInfo("Md.Musha","Male");//Method Man class but we can access from OldMan class
        ob1.setInfo(75);//Method OldMan class
        ob1.displayInfo();
    }
}
