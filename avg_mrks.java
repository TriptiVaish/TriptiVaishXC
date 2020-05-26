
class avg_mrks
{
    int s1,s3,s2;
    double ans;
    void init(int sub1,int sub2,int sub3)
    {
        s1=sub1;
        s2=sub2;
        s3=sub3;
    }
    void cal()
    {
        ans=(s1+s2+s3)/3;
    }
    void display()
    {
        System.out.print(ans);
    }
}
