package geometry.Shapes3D;
import geometry.Shapes2D.Rectangle;
public class cuboid extends Rectangle {
    public double height;
    public cuboid (double l,double w,double h){
        super(l,w);
        height=h;
    }
    public double volume(){
        return area() * height;
    }
}
    

