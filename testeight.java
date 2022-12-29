import java.util.*;

class InvalidNameException extends Exception
{
    InvalidNameException(String msg1)
    {
        System.out.println(msg1);
    }
}

/*class InvalidRollNoException extends Exception
{
    InvalidRollNoException(String msg)
    {
        System.out.println(msg);
    }
}*/

class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg2)
    {
        System.out.println(msg2);
    }
}

class testeight 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String b = sc.nextLine();
        System.out.print("Enter roll no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Total Marks : ");
        float c = sc.nextFloat();
        try {
            name(b);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            //roll(a);
            int q = a/0;
            System.out.println(q);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            marks(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

    public static void name(String s) throws InvalidNameException {
        if(s.length()<3)
        {
            throw new InvalidNameException("-----------------" + '\n' + "Name should be greater than 2 characters.");
        }
        else
        {
            System.out.println("Your Name is: " + s);
        }
    }
 
    /*public static void roll(int no) throws InvalidRollNoException {
    if(no<1)
    {
        throw new InvalidRollNoException("-----------------" + '\n' + "Roll no. cannot be negative.");
    }
    else
    {
        System.out.println("Roll no. is: " + no);
    }
}*/

   public static void marks(Float m) throws InvalidMarksException {
    if(m<0)
    {
        throw new InvalidMarksException("-----------------" + '\n' + "Total marks cannot be negative.");
    }
    else
    {
        float z = (m/200)*100;
        System.out.println("Final Percentage is: " + z);
    }
}
}