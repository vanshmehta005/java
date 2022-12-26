package AlphaCourse.Patterns;

public class InverHalfNumberPyra {
    public static void main(String args[])
    {
        for(int lines=1;lines<=5;lines++)
        {
            for(int numbers=1;numbers<=5-lines+1;numbers++)
            {
                System.out.print(numbers);
            }
            System.out.println();
    }
    
}
}
