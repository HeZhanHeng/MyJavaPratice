package Demo18_抽象类2;

public class User {
    private String name;//姓名
    private int money;//余额，用户所拥有的钱数

    public User() {
    }

    public void show(){
        System.out.println("我叫"+name+",我有"+money+"钱");
    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
