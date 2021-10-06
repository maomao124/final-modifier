import java.util.Arrays;

/**
 * Project name(项目名称)：final修饰符
 * Package(包名): PACKAGE_NAME
 * Class(类名): Person
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 19:16
 * Version(版本): 1.0
 * Description(描述)： 当使用 final 修饰基本类型变量时，不能对基本类型变量重新赋值，因此基本类型变量不能被改变。
 * 但对于引用类型变量而言，它保存的仅仅是一个引用，final 只保证这个引用类型变量所引用的地址不会改变，
 * 即一直引用同一个对象，但这个对象完全可以发生改变。
 */

class Person
{
    private int age;

    public Person()
    {
    }

    // 有参数的构造器
    public Person(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    // 省略age的setter和getter方法
    // age 的 setter 和 getter 方法
}

public class FinalReferenceTest
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------


        // final修饰数组变量，iArr是一个引用变量
        final int[] iArr = {5, 6, 12, 9};
        System.out.println(Arrays.toString(iArr));
        // 对数组元素进行排序，合法
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        // 对数组元素赋值，合法
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        // 下面语句对iArr重新赋值,非法
        // iArr = null;
        // final修饰Person变量，p是一个引用变量
        final Person p = new Person(45);
        // 改变Person对象的age实例变量，合法
        p.setAge(23);
        System.out.println(p.getAge());
        // 下面语句对P重新赋值，非法
        // p = null;


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
/*
1. final 修饰类中的变量
表示该变量一旦被初始化便不可改变，这里不可改变的意思对基本类型变量来说是其值不可变，而对对象引用类型变量来说其引用不可再变。
其初始化可以在两个地方：一是其定义处，也就是说在 final 变量定义时直接给其赋值；二是在构造方法中。这两个地方只能选其一，要么在定义时给值，
要么在构造方法中给值，不能同时既在定义时赋值，又在构造方法中赋予另外的值。
2. final 修饰类中的方法
说明这种方法提供的功能已经满足当前要求，不需要进行扩展，并且也不允许任何从此类继承的类来重写这种方法，但是继承仍然可以继承这个方法，
也就是说可以直接使用。在声明类中，一个 final 方法只被实现一次。
3. final 修饰类
表示该类是无法被任何其他类继承的，意味着此类在一个继承树中是一个叶子类，并且此类的设计已被认为很完美而不需要进行修改或扩展。
 */
