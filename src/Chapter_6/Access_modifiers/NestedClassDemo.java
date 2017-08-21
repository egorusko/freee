package Chapter_6.Access_modifiers;
//Реализация внутриних классов
public class NestedClassDemo {
    public static void main(String[] args) {
        int arr[]={1,23,4,34545646,4324,234,23,465};
        Outer ou = new Outer(arr);
        int i1 = 0;
        for (int i :ou.num) {
            System.out.println("ou.num = [" + i1++ + "] = "  +i );
        }

        ou.Analiz();
    }
}
