class AdministrativeOfficer extends Employee {
    private String officeSection;

    public AdministrativeOfficer(int memberId, String name,
                                 double salary, String officeSection) {

        super(memberId, name, salary);
        this.officeSection = officeSection;
    }

    public void showOfficeSection() {
        System.out.println("Office Section: " + officeSection);
    }

    @Override
    public void performDuty() {
        System.out.println(name +
                " manages administrative activities.");
    }
}
