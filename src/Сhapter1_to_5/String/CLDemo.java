package Сhapter1_to_5.String;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Пpoгpaммe передано " + args.length +
                " аргументов командной строки.");

        System.out.println("Cnиcoк аргументов: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: "+ args[i]);
    }
}
