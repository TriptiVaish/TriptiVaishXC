
class overlding
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(double c, double d)
    {
        System.out.println(c+d);
    }
    void add(float m, float n)
    {
        System.out.println(m+n);
    }
    void add(char A, char B)
    {
        System.out.println(A+B);
    }
    public static void main()
    {
      overlding obj=new overlding();
        obj.add(9,8);
        obj.add(5.0,3.6);
        obj.add(2.4F,5.4F);
        obj.add('A','B');
    }
}
