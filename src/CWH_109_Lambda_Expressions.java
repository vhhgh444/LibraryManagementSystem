package com.company;

interface DemoAno{
    int a=45;
    void meth1();
    void meth2();
}

/*class AnonyDemo implements DemoAno{
    void dispaly(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");

    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");

    }
}
 */
public class CWH_109_Lambda_Expressions {
    public static void main(String[] args) {

       // AnonyDemo obj1=new AnonyDemo();
       // obj1.meth1();

        DemoAno obj=new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("Shut up....");

            }

            @Override
            public void meth2() {
                System.out.println("Fuck you....");

            }
        };

        obj.meth1();
        obj.meth2();

    }
}
