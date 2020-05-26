
class s_int
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
}
    