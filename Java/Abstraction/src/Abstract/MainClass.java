
package Abstract;

public class MainClass {
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Rahim();
        mu.sendMessage();
        mu = new Karim();
        mu.sendMessage();
    }
}
