package Android.CodingExcercise;
import java.util.Scanner;
// import java.lang.Math;
public class Exercise02 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println(Math.PI*(radius*radius)+" "+2*Math.PI*radius);
    }
}
