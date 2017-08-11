package Сhapter1_to_5.String;

public class Phone {

    public static void main(String args[]) {
        String number[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;
        // Для того чтобы воспользоваться программой,
// ей нужно передать один аргумент командной строки
        if (args.length != 1)
            System.out.println("Use: java Phone <name>");
        else {
            for (i = 0; i < number.length; i++) {
                if (number[i][0].equals(args[0])) {
                    System.out.println(number[i][0] + ": " +
                            number[i][1]);
                    break;
                }
            }
            if (i == number.length)
                System.out.println("Name not found.");
        }
    }
}


