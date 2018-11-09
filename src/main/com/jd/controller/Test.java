package main.com.jd.controller;

/**
 * Created by yangyuan on 5/29/18.
 */
//import java.lang.invoke.MethodHandle;
//import java.lang.invoke.MethodHandles;
//import java.lang.invoke.MethodType;

/**
 * Created by yangyuan on 5/29/18.
 */
public class Test {
    class GrandFather{
        void thinking(){
            System.out.println("I 'm grandFather!");
        }
    }
    class Father extends GrandFather{
        void thinking(){
            System.out.println("I 'm father!");
        }
    }
    class Son extends Father{
        void thinking() {
            //实现祖父类的thinking(),打印 I 'm grandFather
           // MethodType mt=MethodType.methodType(void.class);
            try {
            //    MethodHandle md= MethodHandles.lookup().findSpecial(GrandFather.class, "thinking", mt,this.getClass());
             //   md.invoke(this);
          //  } catch (NoSuchMethodException e) {
           //     e.printStackTrace();
           // } catch (IllegalAccessException e) {
           //     e.printStackTrace();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test.Son son=new Test().new Son();
        son.thinking();//jdk8下打印 I 'm father! ,试了下jdk7也是这个啊  啊啊啊
    }
}
