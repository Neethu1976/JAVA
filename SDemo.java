import geometry.Shapes3D.*;


public class SDemo {
    public static void main(String a[]){
        cuboid c = new cuboid(2,3,4);
        sphere s = new sphere(10);
        System.out.println("Area :"+ c.area() + "\n Perimeter : " +c.perimeter()+ "\n Volume: "+s.volume());
        System.out.println("Area :"+ s.area() + "\n Perimeter : " +s.perimeter()+ "\n Volume: "+s.volume());
    }
    
}
