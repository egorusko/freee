package Chapter_8.InterfaceJava;
// Интерфейс, содержащий только константы, так как интрефейс, неявно, обозначает свои переменные
// privat static final
public interface IConst {
    int MIN = 0;//константы
    int MAX = 10;//константы
    String ERRORMSG = "Ошибка диапазона";//константы
}

class IConstDemo implements IConst{
    public static void main(String[] args) {
        int nums[] =new int[MAX];
        for (int i = 0; i < 11; i++) {
            if (i>=MAX) System.out.println(ERRORMSG);
            else {
                nums[i]=i;
                System.out.println(nums[i]);
            }
        }
    }
}