package Demo15;

public class Fu {
    int num = 100;
    public Fu(){
        System.out.println("父类无参构造");
    }
    public Fu(int num){
        System.out.println("父类有参构造");
    }
    public void methodFu(){
        System.out.println("访问父类的成员方法");
    }
}
