import java.util.Scanner;

public class UserInout {

    private static Scanner scanner = new Scanner(System.in);

    public static int input(String msg){
        System.out.print(msg);
        return scanner.nextInt();
    }
}
