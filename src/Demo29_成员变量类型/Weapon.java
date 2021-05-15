package Demo29_成员变量类型;

public class Weapon {
    public Weapon(String tool) {
        this.tool = tool;
    }

    private String tool;

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }


}
