package Zadanie2;

import Zadanie2.Figure;

public class Triangle extends Figure {
    int s1;
    int s2;
    int s3;
    public Triangle( int s1, int s2, int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    @Override
    double calculateArea() {
        return Math.sqrt((s1+s2+s3)* ((s1+s2+s3)-s1)*((s1+s2+s3)-s2)*((s1+s2+s3)-s3));
    }

    @Override
    double calculatePerimeter() {
        return s1+s2+s3;
    }


}
