/**
 * Project name(项目名称)：final修饰符 final-modifier
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 19:05
 * Version(版本): 1.0
 * Description(描述)：
 * final 用在变量的前面表示变量的值不可以改变，此时该变量可以被称为常量。
 * final 用在方法的前面表示方法不可以被重写（子类中如果创建了一个与父类中相同名称、相同返回值类型、相同参数列表的方法，
 * 只是方法体中的实现不同，以实现不同于父类的功能，这种方式被称为方法重写，又称为方法覆盖。）。
 * final 用在类的前面表示该类不能有子类，即该类不可以被继承。
 * final 修饰变量
 * final 修饰的变量即成为常量，只能赋值一次，但是 final 所修饰局部变量和成员变量有所不同。
 * final 修饰的局部变量必须使用之前被赋值一次才能使用。
 * final 修饰的成员变量在声明时没有赋值的叫“空白 final 变量”。空白 final 变量必须在构造方法或静态代码块中初始化。
 */

public class test
{
    void doSomething()
    {
        // 没有在声明的同时赋值
        final int e;
        // 只能赋值一次
        e = 100;
        System.out.print(e);
        // 声明的同时赋值
        final int f = 200;
    }

    // 实例常量
    final int a = 5; // 直接赋值
    final int b; // 空白final变量
    // 静态常量
    final static int c = 12;// 直接赋值
    final static int d; // 空白final变量

    // 静态代码块
    static
    {
        // 初始化静态变量
        d = 32;
    }

    test()
    {
        b = 3;
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test t = new test();
        t.doSomething();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}
