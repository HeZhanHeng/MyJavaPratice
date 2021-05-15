package Demo26_final关键字1;

/**
 * final关键字代表最终的、不可改变的
 * 常用四种方法：
 * 1.可以用来修饰一个类
 * 2.可以用来修饰一个方法
 * 3.可以用来修饰一个成员变量
 * 4.可以用来修饰一个局部变量
 */
public class Demo26 {

    public static void main(String[] args) {
//        一次赋值，终生不变
        final int num = 30;
//        也可以这样写，只要保证唯一一次赋值即可
        final int num1;
        num1 = 40;
        final Student student = new Student("高圆圆");
        System.out.println(student);
        System.out.println(student.getName());
        //final的引用类型变量，其中的地址值不能改变
//        student=new Student("赵丽因");
//        地址所指向的对象可以随便变
        student.setName("高原元渊源");
        System.out.println(student.getName());
    }
}
