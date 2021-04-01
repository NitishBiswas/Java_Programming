
package problem_1;

public class Box {
    double height,width,depth;
    
    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    
    void displayVol(){
        System.out.println("The volume is "+height*width*depth);
    }
}
