package Chapter_6.Access_modifiers;
// Продемонстрировать использование класса Queue
public class QDemo {
    public static void main(String[] args) {
        // Создать пустую очередь для хранения 10 элементов
        Queue queue = new Queue(10);

        char name[] = {'N', 'A' , 'M'};
        // Создать очередь на основе массива
        Queue queue1 = new Queue(name);

        char ch;
        // Поместить ряд символов в очередь queue
        for (int j = 0; j < 10; j++) {
            queue.put((char) ('A' + j));
        }

        // Создать одну очередь на основе другой
        Queue queue2 = new Queue(queue);

        // Показать очереди
        System.out.println("Содержание очереди queue : ");
        for (int i = 0; i < 10; i++) {
            ch = queue.get();
            System.out.print(ch +  " ");
        }

        System.out.println();
        System.out.println("Содержание очереди queue1 : ");
        for (int i = 0; i < 3; i++) {
            ch = queue1.get();
            System.out.print(ch + " ");
        }






    }
}
