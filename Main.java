import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UniversityMember> members =
                new ArrayList<>();

        members.add(
                new Professor(
                        101,
                        "Dr. Rahman",
                        80000,
                        "CSE",
                        "Artificial Intelligence",
                        25
                )
        );

        members.add(
                new AdministrativeOfficer(
                        201,
                        "Mr. Karim",
                        45000,
                        "Accounts"
                )
        );

        System.out.println("===== Dynamic Binding =====");

        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty();
            System.out.println();
        }

        System.out.println("===== Downcasting =====");

        for (UniversityMember member : members) {

            if (member instanceof Professor) {

                Professor p = (Professor) member;

                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}
