package Zadanie2;

import Zadanie2.Figure;

public class Rectangle extends Figure {
     int a;
     int b;

     public Rectangle(int a, int b) {
         this.a = a;
         this.b = b;
     }

         @Override
         double calculateArea () {
             return (a * b);
         }

         @Override
         double calculatePerimeter () {
             return 2 * (a + b);
         }
 }
