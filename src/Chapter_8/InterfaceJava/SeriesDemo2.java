package Chapter_8.InterfaceJava;

import Chapter_8.InterfaceJava.qpack.ByThrees;
import Chapter_8.InterfaceJava.qpack.ByTwos;

//Применение Интерфейскных ссылок
public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();
        Series series;
        /*------------------------------------------------------------------------------------
        В методе main () переменная series объявляется как ссылка на интерфейс Series. Это
            означает, что в данной переменной может храниться ссылка на любой объект, реали­
            зующий интерфейс Series. В данном случае в переменной series сохраняется ссылка на
            объекты byTwos и byThrees, т.е. в разные моменты времени переменная представляет со­
            бой ссылку на объект класса ByTwos или же на объект класса ByThrees. Оба эти клас­
            са реализуют интерфейс Series. Переменная ссылки на интерфейс содержит сведения
            только о методах, объявленных в этом интерфейсе. Следовательно, переменная series не
            может быть использована для доступа к любым другим переменным и методам, которые
            поддерживаются в объекте, но не объявлены в интерфейсе.
            ---------------------------------------------------------------------------------------*/




        for (int i = 0; i < 5; i++) {
            series = byTwos;
            series.getNext();
        }
        //series.getPrev();  - недоступен, так как в интерфейсе он не определен
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            series = byThrees;
            System.out.println("Следующие значение: " + series.getNext());
        }
    }
}
