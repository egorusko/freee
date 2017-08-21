package Chapter_7;
// Многоуровневая иерархия
public class TwoDShape2 {
    private double width;
    private double height;

    // Конструктор по умолчанию
    public TwoDShape2() {
        this.width = height = 0.0;
    }
    // Параметризированный конструктор
    public TwoDShape2(double weidth, double height) {
        this.width = weidth;
        this.height = height;
    }
    // Конструктор с одинаковыми значениями
    // переменных экземпляра width и height
    public TwoDShape2(double x) {
        this.width = height = x;
    }

    // Создать один объект на основе другого
    TwoDShape2(TwoDShape2 tw2) {
        this.width = tw2.width;
        this.height = tw2.height;
    }

    // Методы доступа к переменным экземпляра width и height
    public double getWidth() { return width; }
    public TwoDShape2 setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() { return height; }
    public TwoDShape2 setHeight(double height) {
        this.height = height;
        return this;
    }

    void showDim(){
        System.out.println("Ширина и высота " +
                "" + width + " " + height);
    }
}
class Triagle extends TwoDShape2{
    private String style;

    //Конструктор по умолчанию

    public Triagle() {
        super();
        this.style = "none";
    }

    //Конструктор №2, который вызывает конструктор суперкласса
    public Triagle(double weidth, double height, String style) {
        super(weidth, height);
        this.style = style;
    }

    // Конструктор с одним аргументом для построения треугольника
    public Triagle(double x) {
        super(x);
        this.style = "Закращенный";
    }

    // Передать ссылку на объект Triangle
    // конструктору кпасса TwoDShape
    public Triagle(Triagle trg) {
        super(trg);
        this.style = trg.style;
    }

    double area(){
        return getHeight() * getWidth() / 2;
    }

    void showStyle(){
        System.out.println("Треугольник " + style);
    }
}

// Расширение класса Triangle
/*
* -
Кпасс ColorTriangle насnедует класс
Triangle, nроизводнный от кпасса
TwoDShape, н поэтому включает все члены
кnaccов Triangleн ТWoDShape
* */
class ColorTriagle extends  Triagle{
    private String color;

    //Конструктор

    public ColorTriagle(String style, String color, double width, double height) {
        super(width, height,style);
        this.color = color;
    }

    String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("Цвет: " + color);
    }
}

class TwodSG2{
    public static void main(String[] args) {
        ColorTriagle cl = new ColorTriagle("контурный", "синий", 10.2,20.5);
        Triagle trg2 = new Triagle(10.2, 20.5,"контурный");
        Triagle trg3 = new Triagle(trg2);//  создать копию объекта trg2
        Triagle trg4 = new Triagle(cl);// создать копию объекта cl, без подкласса ColorTriagle

        //объект cl - может вызывать как собственные так и методы суперкласса
        System.out.println("информация о с1: ");
        cl.showStyle();
        trg4.showStyle();
        cl.showColor();
        //trg4.showColor(); Ошибка, не виден подкласс, так как объект Triagle
        cl.showDim();
        trg4.showDim();
        System.out.println("Площадь: " + cl.area());


    }
}