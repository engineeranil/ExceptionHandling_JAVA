import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try{System.out.println("PLEASE ENTER THE NUMBER");
            int numbOne = scan.nextInt();
            System.out.println("PLEASE ENTER THE SECOND NUMBER");
            int numbTwo  = scan.nextInt();
            System.out.println(numbOne/numbTwo);
        }catch (Exception e) {
            System.out.println(e.toString());
        }finally {
         System.out.println("PROGRAM IS FINISHED !!!");
        }



    }
}
