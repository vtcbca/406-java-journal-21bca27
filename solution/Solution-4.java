class pro_4
{
    public void display(String a,String b)
    {
        System.out.println("The Concated String is:"+(a+b));
    }
    public void display(int c,int d)
    {
        System.out.println("The Addition of "+c+" and "+d+" is:"+(c+d));
    }
    public static void main(String args[])
    {
        pro_4 obj=new pro_4();
        obj.display("My name is"," Kauhsik Khatwani");
        obj.display(569,234);
        
    }
}
