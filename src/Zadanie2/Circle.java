package Zadanie2;

public class Circle extends Figure {
     int r;
public Circle ( int r ){
     this.r=r;
}

     @Override
     double calculateArea() { return r*r*Math.PI;
     }

     @Override
     double calculatePerimeter() { return 2*Math.PI*r;

     }
}
