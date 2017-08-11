package Сhapter1_to_5.Array;
/*
* Модель Стек - нецеклическая очередь
* */
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        double ch_Dou;


        System.out.println("Использование очереди " +
                "bigQ для сохранения алфавита");

        // Поместить буквенные символы в очередь ЬigQ
        for (int i = 0; i < 26; i++) {
            bigQ.put((double) (1+i));
        }

        System.out.println("Содержимое очереди bigQ ");
        for (int i = 0; i <26 ; i++) {
            ch_Dou = bigQ.getDou();
            if (ch_Dou != (double) 0) System.out.print(ch_Dou + " ");
        }

        System.out.println("\n");

        System.out.println("Использование очереди, для " +
                "генерации ошибок smallQ, ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Попытка сохранения "
            + (double)(26-i));
            smallQ.put((double) (26-i));
            System.out.println();
        }

        // Дополнительные ошибки при обращении к очереди srnallQ 
        System.out.println("Содержимое SmallQ ");
        for (int i = 0; i < 5; i++) {
            ch_Dou=smallQ.getDou();
            if (ch_Dou != (double) 0) System.out.print(ch_Dou + " ");
        }



    }

}
