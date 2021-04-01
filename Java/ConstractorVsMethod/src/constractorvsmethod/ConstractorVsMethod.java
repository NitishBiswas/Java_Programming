
package constractorvsmethod;

public class ConstractorVsMethod {

    public static void main(String[] args) {
        Constractor constractor = new Constractor("Nitish Biswas",22);
        constractor.displayInfo();
        
        Method method = new Method();
        method.setInfo("Nitish Biswas", 22);
        method.displayInfo();
    }
    
}
