
class s_interest
{
    int p,t;
 double r,ans;
    void init(int principal,int time,double rate)
    {
    p=principal;
    t=time;
   r=rate;
}
    void cal()
    {
    ans=(p*r*t)/100;
}
void display()
{
    System.out.print(ans);
}
public static void main()
{
 s_interest obj=new s_interest();
 obj.init(2000,5,2.5);
 obj.cal();
 obj.display();
}
}

   