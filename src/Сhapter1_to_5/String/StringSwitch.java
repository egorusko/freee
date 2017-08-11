package Сhapter1_to_5.String;

public class StringSwitch {
    public static void main(String[] args) {
        String comand = "cancel";

        switch (comand){
            case "conect":
                System.out.println("Conect");
                break;
            case "cancel":
                System.out.println("Cancel");
                break;
            case "disconect":
                System.out.println("disconect");
                break;
                default:
                    System.out.println("Incorrect comand");
                    break;
        }


    }
}
