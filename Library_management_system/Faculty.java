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

    void dispalyDetails() {
        System.out.println("MemberId :- " + this.getMemberId());
        System.out.println("MemberName :- " + this.getMemberName());
        System.out.println("Department :- " + this.getDepartment());
    }
}
