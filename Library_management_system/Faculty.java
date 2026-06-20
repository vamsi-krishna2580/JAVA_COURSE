public class Faculty extends Member{
    private String Department;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Faculty(int memberId, String memberName, String department) {
        super(memberId, memberName);
        Department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department :- " + this.getDepartment());
    }
}
