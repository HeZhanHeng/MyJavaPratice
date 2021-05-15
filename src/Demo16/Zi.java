package Demo16;

public class Zi extends Fu {
    int num = 100;

    public Zi() {
        this(123);//本类的无参构造调用本类的有参构造
//        this(123,333);//不行，只能调用第一个
    }

    public Zi(int n) {
        this(123, 333);//这个可以
    }

    public Zi(int n, int m) {

    }

    public void showNum() {
        int num = 10;
        System.out.println("局部变量" + num);//局部变量
        System.out.println("成员变量" + this.num);
        System.out.println("父类的成员变量" + super.num);
    }
}
