
class ar_circle
{
   final double pi=3.14;
   double len,ans,s;
    void init(double r)
    {
   len=r;
   s=pi;
    
}
void cal()
{
    ans=len*len*s;
}
void display()
{
    System.out.print(ans);
}
}


