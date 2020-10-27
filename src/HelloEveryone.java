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

        System.out.println("在ttttt库基于origin/dev创建dev分支，并修改代码提交，并合并到master");

        System.out.println("master分支直接pull拉取远程库代码，dev先不pull尝试直接修改提交引起冲突。。。");

        System.out.println("mygit库dev分支跟新，提交到远程库dev，等待ttttt库模拟冲突操作。。。");

        System.out.println("mygit库dev分支跟新，提交到远程库dev，等待ttttt库模拟冲突操作。。。");

        System.out.println("ttttt库dev先修改commit后再pull造成冲突。。");

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
