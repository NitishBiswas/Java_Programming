
package objectOrientedProgramming;

public class Test {
    public static void main(String[] args) {
        
        //1st Object(student1)
        Students student1 = new Students();
        student1.setInfo("Nitish",05,1956732580);
        student1.getInfo();
        
        //2nd Object(student2)
        Students student2 = new Students();
        student2.setInfo("Mehedi",33,1536463580);
        student2.getInfo();
        
        //3rd Object(student3)
        Students student3 = new Students();
        student3.setInfo("Musha",10,1768473884);
        student3.getInfo();
        
        //4th Object(student4)
        Students student4 = new Students();
        student4.setInfo("Atiq",16,1956732580);
        student4.getInfo();
        
    }
}
