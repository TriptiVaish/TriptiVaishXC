
class overlding2
{
    final double pi=3.14;
    void area(int a)
    {
        System.out.println(" The area of square is"+a*a);
    }
    void area(int b,double c)
    {
        System.out.println("The area of rectangle is"+b*c);
    }
    void area(float m)
    {
        System.out.println("The area of circle is"+m*m*pi);
    }
    public static void main()
    {
        overlding2 obj=new overlding2();
        obj.area(4);
        obj.area(5,6.3);
        obj.area(6.3F);
    }
}
