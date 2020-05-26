
class test_1
{
    int n1,n2,ans;
    void init(int num1,int num2)
    {
        n1=num1;
        n2=num2;
    }
    
    int cal()
    {
        ans=n1+n2;
        return ans;
    }
    public static void main()
    {
        test_1 obj=new test_1();
        obj.init(3,5);
        int result=obj.cal();
        System.out.print(result);
    }
}
        
   