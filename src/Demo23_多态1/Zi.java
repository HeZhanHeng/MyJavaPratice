package Demo23_多态1;

public class Zi extends Fu {
    int num = 20;
    @Override
    public void method() {
        System.out.println("子类方法重写");
    }
    @Override
    public void showNum(){
        System.out.println(num);
    }
}
