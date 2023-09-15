// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        short s1, s2 = 99;
        float f1 = 4.12F;
                float f2 = 3.4F;
        byte b = -10;
        boolean q = true;
        //System.out.println("s1 = "+s1);

        System.out.println("\nЗавдання 2");
        s1 = (short) Math.pow(b,2);
        System.out.println("s1 = "+s1);
        Random random = new Random();
        s2 = ((short) random.nextInt(10-0));
        System.out.println("s2 = "+s2);
        double d2 = random.nextDouble(9999-1);
        System.out.println("d2 = "+ d2);
        double d1 = d2/(s1*s2);
        System.out.println("d1 = "+d1);

        System.out.println("\nЗавдання 3");
        //f1 = ;
        double y = (Math.pow(Math.tan(f1),2))/Math.log(s1);
        System.out.println("y = "+y);
    }
}