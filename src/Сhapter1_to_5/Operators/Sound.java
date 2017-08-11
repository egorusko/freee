package Сhapter1_to_5.Operators;

import java.io.IOException;

public class Sound {
    public static void main(String args[]) throws IOException {
        char cha = 'Z', ch, ignore;

        do {
            System.out.println("Зaдyмaнa буква из диапазона A-Z.");
            System.out.print("Введите загаданую букву: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');
                if (ch == cha) System.out.println("Вы правильно угадали");
                else  {
                    System.out.print("Вы не угодали букву: Загаданная буква ");
                    if (cha > ch) System.out.println(", находится в конце алфавита ");
                    else System.out.println(", находится в начале алфавита");
                }
        } while (ch != 'Z');
    }
}

