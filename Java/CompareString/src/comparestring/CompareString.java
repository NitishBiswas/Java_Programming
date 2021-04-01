
package comparestring;

public class CompareString {

    public static void main(String[] args) {
        String password1 = "nitish123";
        String password2 = "nitish123";
        String password3 = new String("nitish123");
        String password4 = new String("nitish");
        
        System.out.println(password1 == password2);
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
    }
    
}
