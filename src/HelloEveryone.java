public class HelloEveryone {
    private String id;
    private String name;

    public static void main(String[] args) {
        System.out.println("hi");
        HelloEveryone helloEveryone = new HelloEveryone();
        helloEveryone.setId("111");
        helloEveryone.setName("wangxiaoer");
        System.out.println(helloEveryone);

        System.out.println("dev上第二次提交，并合并到master");

        System.out.println("dev上开发时，遇到紧急情况，需要立即处理。。。将dev部分代码保存在stansh，创建并切换到hotfix分支");

        System.out.println("正在处理紧急问题。。。处理完成，合并到master");

        System.out.println("切回dev分支，删除hotfix分支，合并master分支到dev分支，并取回stansh部分代码，开发完剩余工作后提交，并合并到master");

    }

    public HelloEveryone() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloEveryone(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloEveryone{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
