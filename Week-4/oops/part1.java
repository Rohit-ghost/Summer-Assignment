public class ToTestInt {
    public static void main(String args[]){
        Airthmatic a1=new Airthmatic();
        int n=5;
        int result=a1.square(n);
        System.out.println(result);
    }
}
interface test{
    public int square(int x);
}

class Airthmatic implements test{

    public int square(int x){
        return x*x;
    }
}

output;
PS C:\Users\user> cd "c:\Users\user\Desktop\Assignment\" ; if ($?) { javac ToTestInt.java } ; if ($?) { java ToTestInt }
25
PS C:\Users\user\Desktop\Assignment> 
