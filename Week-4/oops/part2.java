 class Outer {

    public void display(){
        System.out.println("Outer class display method");
    }

    class Inner{

        public void display(){
            System.out.println("Inner class display method");
        }
    }
    public static void main(String args[]){
        Outer o1=new Outer();
        o1.display();
        Outer.Inner n1=o1.new Inner();
        n1.display();

    }
}


output;
PS C:\Users\user\Desktop\Dsa\BST> cd "c:\Users\user\Desktop\Assignment\" ; if ($?) { javac Outer.java } ; if ($?) { java Outer }
Outer class display method
Inner class display method
PS C:\Users\user\Desktop\Assignment> 
