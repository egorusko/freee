package Chapter_7;
// Простая иерархия классов
// Класс, описывающий двумерные объекты
public class TwoDShape {
    double width;
    double height;
    private double width_private;   //  эти переменные
    private double height_private;  // объявлены как закрытые

    public TwoDShape() {
    }

    public TwoDShape(double width_private, double height_private) {
        this.width_private = width_private;
        this.height_private = height_private;
    }

    public TwoDShape(double x) {
        width_private = height_private = x;
    }
    // Методы доступа к закрытым переменным

    public double getWidth_private() {
        return width_private;
    }

    public double getHeight_private() {
        return height_private;
    }

    public TwoDShape setHeight_private(double height_private) {
        this.height_private = height_private;
        return this;
    }

    public TwoDShape setWidth_private(double width_private) {
        this.width_private = width_private;
        return this;
    }

    void showDimPrivate(){
        System.out.println("Ширина и высота private " +
                "" + width_private + " " + height_private);
    }

    void showDim(){
        System.out.println("Ширина и высота " +
                "" + width + " " + height);
    }

}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
    class Triangle extends TwoDShape{
    private String style_private;
    String style;
    //конструктор № 1
    public Triangle() {
        super();
    }
    //конструктор № 2
    public Triangle(String style, double width, double height) {
        super(width,height);
        this.style = style;
    }
    //конструктор № 3
    public Triangle(String style_private, double x) {
        super(x);
        this.style_private = style_private;
    }
    //конструктор №4

    public Triangle(double x) {
        super(x);
        style_private = "none";
    }

    double area(){
        return width * height /2;
    }

    void  showStyle(){
        System.out.println("Треуголник " + style);
    }

    void  showStyle_private(){
        System.out.println("Треуголник " + style +
        " ширина - " + getWidth_private() + " высота - " + getHeight_private());
    }
}
class Circle extends TwoDShape_abstr{
    public Circle(double width, double height) {
        super(width, height, "Круг");
    }

    @Override
    double area() {
        return Math.PI * Math.pow(getHeight(),2);
    }
}
class Shapes{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle("Мощный",30.1,33.1); //испольхуем конструктор
        Triangle t4 = new Triangle(5.1);
        Triangle t5 = new Triangle("Красный", 5.5);

        t1.width = 5.8;
        t1.height = 4.4;
        t1.style = "закрашенный";
        t1.setWidth_private(10.1); // задаем ширину через метод, так как переменная закрытая private
        t1.setHeight_private(20.11); // аналогично

        t2.height = 8.1;
        t2.width = 13.3;
        t2.style = "классный";

        System.out.println("Информация о t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println("Информация о t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        t1.showDimPrivate();
        System.out.println(t1.getHeight_private()); // демонстрация закрытых перменных тоже через метод
        System.out.println(t1.getWidth_private());

        t3.showStyle_private();

    }
}