package Chapter_6.Access_modifiers;
//статические блоки, в которых иницилиазируются
//статические переменные, как только класс будет вызван
public class StaticBlock {
    static double rootOf2;
    static double rootOf32;

    static {
        System.out.println("Статические блок, активирован," +
                " данные проинициализированны");
        rootOf2 = Math.sqrt(2.0);
        rootOf32 = Math.random()*2.0f;
    }

    StaticBlock(String msg){
        System.out.println(msg);
    }
}
class Demo3{
    public static void main(String[] args) {
        // После первого вызова, класса, происходит вызов статического блока только 1 раз, и самое главное
        // это происходит даже до вызова конструктора
        StaticBlock st = new StaticBlock("Kopeнь квадратный из 2.0 равен " + StaticBlock.rootOf2);
        StaticBlock st1 = new StaticBlock("Случайнное число " + StaticBlock.rootOf32);



    }
}
