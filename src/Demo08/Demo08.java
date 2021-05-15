package Demo08;


/**
 * static关键字:一旦使用了static关键字，那么这样的内容不再属于对象自己的，而是属于类的，所以
 * 凡是本类的对象，都共享同一份。（学生对象的姓名学号不同，但所在班级是一样的）
 */
public class Demo08 {
    public static void main(String[] args) {
        Student one = new Student("飞侠恒", 26);
        one.room="101教室";//只对一个对象进行赋值，但多个对象是可以共享的
        Student two = new Student("黄蓉", 24);
        System.out.println(one.getName()+"|"+one.getAge()+"|"+one.room+"|"+one.getId());
        System.out.println(two.getName()+"|"+two.getAge()+"|"+two.room+"|"+two.getId());//所以这里可以打印出来room
        /**
         * 一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的
         * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
         * 无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
         *
         * （1）静态方法不能直接访问非静态内容：
         * 原因是在内存当中【先】有静态的内容，【后】有非静态内容
         * “先人不知道后人，但后人知道先人”
         * （2）静态方法中不能使用this关键字
         */
        MyClass myClass=new MyClass();
        myClass.method();//调用成员方法
//        myClass.methodStatic();//不推荐
        MyClass.methodStatic();//调用静态方法（推荐：类名直接调用）
        getStaticMethod();
    }
    private static void getStaticMethod(){
        System.out.println("调用本类中的静态方法，可以省略类名");
//        System.out.println(this);
    }
}
