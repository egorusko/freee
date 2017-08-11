package Сhapter1_to_5.Class;
/*
* Демонстрация использования Класса ShowBits
* */
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b =new ShowBits(8);//создаем объект, класса, и назначаем размер целочисленного типа
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(1024);

        b.show(-127);// демонстрируем, целое число в 2-ичном ввиде
        i.show(87835);
        li.show(-123123123);


    }
}
