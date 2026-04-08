import java.util.ArrayList;
import java.util.List;

public class ClubManager<T extends Member> {
    private List<T> members = new ArrayList<>();

    public void addMember(T member) throws DuplicateException {
        if (member == null) {
            return;
        }
        for (T m : members) {
            if (m.getStudentId().equals(member.getStudentId())) {
                throw new DuplicateException("중복된 학번입니다");
            }
        }
        members.add(member);
        System.out.println("등록되었습니다");
    }

    public List<T> getMembers() {
        return members;
    }
}