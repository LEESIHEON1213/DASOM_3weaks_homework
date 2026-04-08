public abstract class Member implements RoleAction {
    protected String name;
    protected String studentId;

    public Member(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public abstract String getRoleName();
}