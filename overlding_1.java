
class overlding_1
{
    void prnsqr( int a)
    {
        System.out.println(a*a);
    }
    void prnsqr(char c)
    {
        System.out.println("there is no squaring as its a character");
    }
    void prnsqr (float f)
    {
        System.out.println(f*f);
    }
    void prnsqr(double l)
    {
        System.out.println(l*l);
    }
    public static void main()
    {
        overlding_1 obj=new overlding_1();
        obj.prnsqr(4);
        obj.prnsqr(3.6);
        obj.prnsqr(6.5f);
        obj.prnsqr('A');
    }
}

        