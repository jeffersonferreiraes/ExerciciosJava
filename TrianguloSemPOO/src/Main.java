import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the measures of triangle X: ");
        Double xA = sc.nextDouble();
        Double xB = sc.nextDouble();
        Double xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        Double yA = sc.nextDouble();
        Double yB = sc.nextDouble();
        Double yC = sc.nextDouble();

        Double p = (xA + xB + xC)/2;
        Double areaX = Math.sqrt(p*(p - xA)*(p - xB)*(p - xC));

        p = (yA + yB + yC)/2;
        Double areaY = Math.sqrt(p*(p - yA)*(p - yB)*(p - yC));

        System.out.println("areaX = " + areaX);
        System.out.println("areaY = " + areaY);

        if (areaX > areaY){
            System.out.println("Area X é maior");
        } else if (areaX < areaY) {
            System.out.println("Area Y é maior");
        } else {
            System.out.println("Equal areas");
        }
    sc.close();
    }

}

