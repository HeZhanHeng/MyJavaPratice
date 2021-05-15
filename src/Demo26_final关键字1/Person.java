package Demo26_final关键字1;
/**
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也是不可变得
 * 1.由于成员变量有默认值，所以用了final之后必须手动赋值，不再给默认值了。
 * 2.对于final的成员变量，要么使用直接赋值，要么用构造方法进行赋值，二者选一。
 * 3.必须保证类当中所有重载方法的构造方法，都最终会对final的成员变量进行赋值
 */
public class Person {
//    private final String name;
    private  String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(final String name) {
        this.name = name;
    }
}
