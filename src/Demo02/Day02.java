package Demo02;

//面向对象三大特征：封装、继承、多态
//封装在java中的体现：1.方法就是一种封装 2.关键字private也是一种封装
//间接访问private成员变量，就一定要定义getter/setter方法
//this关键字：方法的成员变量和局部变量名字一样，”就近原则“，优先使用局部变量，如果想访问本类中的
//的成员变量，前面加this关键字。
//构造方法：new对象就是执行构造方法
//          1.构造方法名称必须和类名保持一致
//          2.构造方法不要写返回值类型，连void都不写
//          3.构造方法不能return一个具体的返回值
//          4.如果没有编写构造方法，编译器会默认 赠送一个构造方法
//          5.一旦编写了一个构造方法，那么编译器将不再赠送
public class Day02 {
    public static void main(String[] args) {
        int[]array={19,23,32,34,56,70};
        System.out.println("最大值"+getMax(array));
//        P113 定义一个标准类

    }

//    获取数组最大值
    public static int getMax(int[]array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
