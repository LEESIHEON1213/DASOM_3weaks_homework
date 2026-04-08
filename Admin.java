public class Admin extends Member {

    public Admin(String name, String studentId) {
        super(name, studentId);
    }

    @Override
    public String getRoleName() {
        return "운영진";
    }

    @Override
    public void performRole() {
        System.out.println(name + "님이 행사를 기획합니다.");
    }

    public void manageServer() {
        System.out.println(name + "님이 서버를 관리합니다.");
    }
}