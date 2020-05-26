
class avg_marks 
{
int sub1,sub2,sub3;
double ans;

  void init()
  {
    sub1=90;
    sub2=88;
    sub3=85;
  }
  void cal()
  {
    ans=(sub1+sub2+sub3)/3;
  }
  void display()
  {
    System.out.print(ans);
  }
}
