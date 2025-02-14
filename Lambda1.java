interface Dim{
    double apply(int x);

}
public class Lambda1 {
    

    
 public static void main (String[] args){
 Dim square= x -> (x * x);
 System.out.println("Area of Square = "+square.apply(2));
 Dim cube=(x) -> 6*(x * x);
 System.out.println("Area of Cube = "+cube.apply(2));
 Dim circle =(x)-> Math.PI*(x *x);
 System.out.println("Area of Circle = "+circle.apply(3));
 Dim sphere=(x)-> 4* Math.PI*(x * x);
 System.out.println("Area of Sphere = "+sphere.apply(2));

 
 }



}