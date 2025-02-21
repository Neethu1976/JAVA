package  geometry.Shapes2D;
import geometry.interfaces.*;
public class circle implements calcArea,calcPerimeter {
public double radius;
public circle(double r){radius=r;
} 
public double area(){return Math.PI*radius*radius;}
public double perimeter(){return  Math.PI*2*radius;} 

}
