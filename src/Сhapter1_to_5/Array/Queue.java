package Сhapter1_to_5.Array;

class Queue{
    char q_char[];
    int q_int[];
    double q_dou[];// массив для хранения элементов очереди
    int putloc, getloc;
    // элементов очереди
    // индексы для вставки и извлечения

    public Queue(int size) {
        this.q_char = new char [size+1]; // выделить памьять для очереди
        this.q_dou = new double[size+1];
        this.q_int = new int[size+1];
        putloc = getloc = 0;
    }


    void put(char ch){
        if (putloc==q_char.length-1){
            System.out.println("Очередь заполнена");
            return;
        }
        putloc++;
        q_char[putloc] = ch;
    }
    void put(int ch){
        if (putloc==q_int.length-1){
            System.out.println("Очередь заполнена");
            return;
        }
        putloc++;
        q_int[putloc] = ch;
    }
    void put(double ch){
        if (putloc==q_dou.length-1){
            System.out.println("Очередь заполнена!");
            return;
        }
        putloc++;
        q_dou[putloc] = ch;
    }

    char get(){
        if (getloc==putloc){
            System.out.println(" - Очередь пуста!");
            return (char) 0;
        }
        getloc++;
        return q_char[getloc];
    }
    int getInt(){
        if (getloc==putloc){
            System.out.println(" - Очередь пуста");
            return 0;
        }
        getloc++;
        return q_int[getloc];
    }
    double getDou(){
        if (getloc==putloc){
            System.out.println(" - Очередь пуста");
            return 0.0;
        }
        getloc++;
        return q_dou[getloc];
    }

}
