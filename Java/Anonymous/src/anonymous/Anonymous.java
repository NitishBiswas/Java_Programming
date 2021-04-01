
package anonymous;

public class Anonymous {

    public static void main(String[] args) {
        NewClass nc = new NewClass(){
            @Override
            void display(){
                System.out.println("Main Class");
            }
        };
        nc.display();
    }
    
}
