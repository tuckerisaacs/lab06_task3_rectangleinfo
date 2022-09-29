import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
       double side1 = 0;
       double side2 = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lenth of side 1");
        if(in.hasNextDouble()) {
             side1 = in.nextDouble();
            in.nextLine();
        }
        else{
            trash = in.nextLine();
            System.out.println(trash + "enter a valid number");
        }
        System.out.println("enter the width of side 2");
        if(in.hasNextDouble()) {
            side2 = in.nextDouble();
            in.nextLine();
        }
        else{
            trash = in.nextLine();
            System.out.println(trash + "enter a valid number");
        }
        double perimiter = ((side1*2)+(side2*2));
        double area = (side1*side2);
        double diagonal = ((side1*side1)+(side2*side2));

        System.out.println("the perimiter of the rectangle is "+perimiter+"and the area is "+area);
        System.out.println("the lenth of the diagonal is "+diagonal);




    }
}