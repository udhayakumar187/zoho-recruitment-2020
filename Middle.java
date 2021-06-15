import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        int length = value.length();
        int spaces = value.length();
        String letters ="";
        for(int i = length/2 ; i< length ;i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            letters += value.charAt(i);
            System.out.println(letters);
            spaces--;
        }
        for(int i = 0 ; i< length/2 ;i++){
            for(int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
            letters += value.charAt(i);
            System.out.println(letters);
            spaces--;
        }

    }
}
