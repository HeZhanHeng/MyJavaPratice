package Demo13;
/**
 * 重写（Override）概念：在继承关系当中，方法的名称一样，参数列表也一样。
 * 重写和重载的区别：
 *      重写：方法名称一样，参数列表【也一样】。覆盖、复写
 *      重载（Overload）：方法名称一样，参数列表【不一样】
 *方法覆盖重写的特点：创建的是子类对象，则优先使用子类方法。
 *
 * 注意事项:
 *1. @Override: 可以检测是不是有效的正确覆盖重写（不写，只要满足要求，也是正确方法的覆盖重写）
 *2.子类方法的返回值必须小于或等于父类方法返回值的范围
 *  java.lang.Object类是所有类的公共最高父类，java.lang.String就是Object的子类
 *3.子类方法的权限必须【大于或等于】父类方法的权限修饰符
 *   public>protected>(default)>private
 *       PS : 大部分情况下，我们重写权限及返回值类型都会是相等的关系。
 */
public class Demo13 {
    public static void main(String[] args) {
        Zi zi =new Zi();
        zi.method();
    }
}
