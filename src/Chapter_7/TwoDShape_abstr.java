package Chapter_7;

// Создание абстрактного класса
abstract class TwoDShape_abstr {
    private double width;
    private double height;
    private String name;

    //Конструктор по умолчанию
    public TwoDShape_abstr() {
        width = height = 0.0;
        name = "none";
    }

    //Параметризированный конструктор
    public TwoDShape_abstr(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width и height
    public TwoDShape_abstr(double height, String name) {
        this.height = width = height;
        this.name = name;
    }

    // Создать один объект на основе другого
    public TwoDShape_abstr(TwoDShape_abstr tw_abstr) {
        this.width = tw_abstr.width;
        this.height = tw_abstr.height;
        this.name = tw_abstr.name;
    }

    // Методы доступа к переменным width и height
    public double getWidth() {
        return width;
    }

    public TwoDShape_abstr setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public TwoDShape_abstr setHeight(double height) {
        this.height = height;
        return this;
    }

    public String getName() {
        return name;
    }

    //метод демонстрируюший ширину высоту
    void showDin() {
        System.out.println("Ширина и Высота " +
                width + " " + height);
    }

    //абстрактный метод
    abstract double area();
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape
class Triangle3 extends TwoDShape_abstr {
    private String style;

    //Конкструктор по умолчанию
    public Triangle3() {
        super();
        this.style = "none";
    }

    // Конструктор класса Triangle
    public Triangle3(double width, double height, String style) {
        super(width, height, "Треугольник");
        this.style = style;
    }

    // Конструктор с одним аргументом для построения треугольника
    public Triangle3(double x) {
        super(x, "Треугольник");
        this.style = "Закрашеный ";
    }

    //Конструтор созданию объекта из объекта
    public Triangle3(Triangle3 tw_abstr) {
        super(tw_abstr); // передать объект конструктору класса TwoDShape
        this.style = tw_abstr.style;
    }

    //метод площади
    double area() {
        return getHeight() * getWidth() / 2;
    }

    //метод стиля треугольника
    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Подкласс для представления прямоугольников,
// производный от класса TwoDShape
class Rectangle3 extends TwoDShape_abstr {

    // Конструктор по умолчанию
    public Rectangle3() {
        super();// вызвать конструктор суперкласса
    }

    // Конструктор класса Rectangle
    public Rectangle3(double width, double height) {
        super(width, height, "Прямоугольник");// вызвать конструктор суперкласса

    }

    //Конструктор с 1 параметром, создание квадрата
    public Rectangle3(double x) {
        super(x, "Прямоугольник");// вызвать конструктор суперкласса
    }

    //Конструктор на основе объекта, копия
    public Rectangle3(Rectangle3 rectangle3) {
        super(rectangle3);
    }

    //медот, проверяет является ли прямоугольник квадрат
    boolean isSquare() {
        return (getHeight() == getWidth()) ? true : false;
    }


        // метод возвращаюший площадь
    double area() {
        return getWidth() * getHeight();
    }
}

class AbsShape {
    public static void main(String[] args) {
        TwoDShape_abstr twA[] = new TwoDShape_abstr[4];
        twA[0] = new Triangle3(8.0, 12.0, "контурный");
        twA[1] = new Rectangle3(10);
        twA[2] = new Rectangle3(10, 4);
        twA[3] = new Triangle3(7.0);

        for (TwoDShape_abstr t :twA) {
            System.out.println("Объект - " + t.getName()
            + "\n"  + "Площадь - " + t.area() + "\n");

        }

    }
}