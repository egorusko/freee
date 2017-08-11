package Сhapter1_to_5.Operators;
/*
* данный класс, разработан, для наглядности, точнее показать, силу классов и методов
* данный класс реализован, в HelpClassDemo, каталог Class
* */
import java.io.IOException;

public class Help {
    public void helpon(int what) throws IOException {
        switch (what) {
            case '1':
                System.out.println("Oпepaтop if:");
                System.out.println("if{ycлoвиe) оператор;\"");
                System.out.println("\"else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:");
                System.out.println("switch(выpaжeниe){");
                System.out.println("case константа;");
                System.out.println("последовательность операторов");
                System.out.println(" break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("цикл for");
                System.out.println("один уз лучших практичных цилов. Конструкция цикла for ");
                System.out.println("for(i = 0(значение);i < 10 (проверка); i++(шаг, ход))");
                System.out.println("цикл for, может не иметь тела, for(;;), " +
                        "а может иметь for(i = 0, j =1; i<=j;i++ j--");
                System.out.println("цикл for модет принимать разные проверки например," +
                        " проверку на логику другихданных");
                System.out.println("Например for(int = 0; (char)System.in.read()");
                break;
            case '4':
                System.out.println("цикл while");
                System.out.println("состоит только из проверочного значения на логику");
                System.out.println("while(проверка)действие;");
                System.out.println("в цикле while проверяется сначала тело, и лишь потом действия");
                System.out.println("цикл while, приминим только в тех" +
                        " случаях, где мы не знает, точно сколько нужно выполнять цикл");
                break;
            case '5':
                System.out.println("цикл do-while");
                System.out.println("аналогичен while, но сначала выполняет тело цикла 1 раз");
                System.out.println("Например выполняется действие, лишь потом производится проверка");
                break;
            case '6':
                System.out.println("оператор break: ");
                System.out.println("Данный оператор, позволяет завершать" +
                        "завременно цикл, другими словами выйти из цыкла");
                System.out.println("помимо выхода, опетаор дакже обладает" +
                        " возрата к определенной точке, типа stop: цикл+условие + break stop;" +
                        "таким образом, данный цикл завершиться, и венется к якорю srop");
                break;
            case '7':
                System.out.println("оператор continue: ");
                System.out.println("Данный оператор, позволяет, преднамерено" +
                        " завершить цикл на 1 ход");
                System.out.println("Также данный оператор, имеет возможность " +
                        "возратится с якорю, и сказать чтобы цикл продолжился");
                System.out.println();
                break;
            default:
                System.out.println("запрос не найден");

        }
    }

    public void showMenu() {
        System.out.print("\tСправка: ");
        System.out.print("\t1. if");
        System.out.print("\t2. switch");
        System.out.print("\t3. for");
        System.out.print("\t4. while");
        System.out.print("\t5. do-while");
        System.out.print("\t6. break");
        System.out.print("\t7. continue");
        System.out.print("\t Для выхода, нажмите (q) - Exit");
        System.out.println("выберите: ");
    }
    public boolean isValid(int ch){
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

