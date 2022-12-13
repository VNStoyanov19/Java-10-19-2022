import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();

        if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday"))  {
            System.out.println("Working day");
        }
        else if(day.equals("Sunday")||day.equals("Saturday")) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Error");
        }
    }
}