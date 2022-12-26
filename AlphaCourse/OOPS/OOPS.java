package AlphaCourse.OOPS;

public class OOPS
{
public static void main(String args[])
{
    Pen p1=new Pen();//Created a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    // BankAccount myAcc = new BankAccount();
    // myAcc.username="vansh2800";
    // System.out.println(myAcc.username);
    // myAcc.setPassword("12345678910");
    // System.out.println(myAcc.getPassword());

}
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pw)
//     {
//         password=pw;
//     }
//     public String getPassword()
//     {
//         return this.password;
//     }
// }

class Pen{
    private String color;
    private int tip;

    void setColor (String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
    String getColor()
    {
        return this.color;
    }
    int getTip()
    {
        return this.tip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calcPercentage(int phy,int chem,int maths)
//     {
//         percentage= (phy+chem+maths)/3;
//     }
// }