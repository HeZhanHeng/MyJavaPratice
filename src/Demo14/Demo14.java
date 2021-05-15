package Demo14;

public class Demo14 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMsg();
        phone.show();
        System.out.println("==============");
//        覆盖重写的应用：新手机拥有旧手机全部功能，同时还有新功能
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMsg();
        newPhone.show();
//        P160
    }
}
