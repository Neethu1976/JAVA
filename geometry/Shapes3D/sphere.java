package geometry.Shapes3D;
import geometry.Shapes2D.circle;
public class sphere extends circle {
public sphere(double r){
        super(r);
    }
       
   public double volume (){return (4/3.0)*Math.PI * Math.pow(radius,3);}
}