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

        System.out.println("正在处理紧急问题。。。处理完成，合并到master");
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
