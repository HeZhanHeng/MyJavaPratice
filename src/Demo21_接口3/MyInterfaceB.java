package Demo21_接口3;
/**
 * 接口当中也可以定义“成员变量”，但是必须使用public static final 三个关键字实现
 * 【备注】
 * 一旦使用final关键字进行修饰，说明不可改变
 * 【注意事项】
 * 1.接口当中的常量，可以省略public static final
 * 2.接口当中的常量，必须进行明确赋值
 * 3.接口当中的常量,使用完全大写的字母，并用下划线进行分割。（命名规则）
 */
public interface MyInterfaceB {
    public static final String name = "飞侠恒";
    public abstract void getMethod1();
    void sameMethod();
}
