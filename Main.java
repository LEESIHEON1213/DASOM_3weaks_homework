// 다솜 동아리 회원 관리 시스템

import java.util.Scanner;

public class Main {
    static final String CLUB_NAME = "DASOM";

    public static void main(String[] args) {
        ClubManager<Member> manager = new ClubManager<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== " + CLUB_NAME + " 백엔드 과제 시스템 ===");

        String[] menu = {"1. 부원 등록", "2. 특별 활동", "3. 종료"};

        while (true) {
            System.out.println("\n--- 메뉴 ---");
            for (String m : menu) {
                System.out.println(m);
            }
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            try {
                if (choice.equals("1")) {
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("학번: ");
                    String id = scanner.nextLine();
                    Member newMember = new Admin(name, id);
                    manager.addMember(newMember);
                } else if (choice.equals("2")) {
                    for (Member m : manager.getMembers()) {
                        m.performRole();
                        if (m instanceof Admin) {
                            Admin admin = (Admin) m;
                            admin.manageServer();
                        }
                    }
                } else if (choice.equals("3")) {
                    System.out.println("종료합니다.");
                    break;
                }
            } catch (DuplicateException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}