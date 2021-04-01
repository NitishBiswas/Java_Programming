
package mixclass;
interface DesigningClass {
    void Wash();
    void Distance();
    void StayHome();
}
abstract class HalfComplete implements DesigningClass{   
    @Override
    public void Wash(){
        System.out.println("Wash Your Hand");
    }
    @Override
    public void Distance(){
        System.out.println("Maintain Distance");
    }
    abstract void wish();
}
class Complete extends HalfComplete{
    @Override
    public void StayHome(){
        System.out.println("Stay Home Be Safe");
    }
    @Override
    void wish(){
        System.out.println("God Bless You");
    }    
}
