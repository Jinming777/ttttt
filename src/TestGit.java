public class TestGit {
    public static void main(String[] args) {
        System.out.println("ttttt库pull下TestGit后也进行了修改");

        System.out.println("mygit库dev修改后提交，造成与master不一致后，去master创建新的分支");

        System.out.println("mygit库基于master创建新的临时分支hotfix，修改TestGit后commit并合并到master");
    }
}
