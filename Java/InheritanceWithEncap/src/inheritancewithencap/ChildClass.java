
package inheritancewithencap;

public class ChildClass extends ParentClass {
    private String Gmail;

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    void displayInfo(){
        System.out.println("Name : "+getName());
        System.out.println("Roll : "+getRoll());
        System.out.println("Gmail : "+getGmail());
    }
}
