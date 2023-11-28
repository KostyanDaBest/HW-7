package Zadanie2;

import Zadanie2.Circle;
import Zadanie2.Figure;
import Zadanie2.Rectangle;
import Zadanie2.Triangle;

public class Run {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Circle(4);
        figures[2] = new Rectangle(2, 5);
        double totalPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            totalPerimeter = totalPerimeter + figures[i].calculatePerimeter();
        }
        double totalArea = 0;
        for (int i = 0; i < figures.length; i++) {
            totalArea = totalArea + figures[i].calculateArea();
        }
        System.out.println("Сумма перимтров:" + totalPerimeter);
        System.out.println("Сумма площадей :"+ totalArea);
    }
}