package Chapter_7;
// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
public class Rectangle extends TwoDShape {
    boolean isSquare(){
       return width == height ? true : false;
    }
    double area(){
        return width*height;
    }

}
