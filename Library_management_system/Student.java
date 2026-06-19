public class Student extends Member {
    private String branch;
    private int batch_no;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(int batch_no) {
        this.batch_no = batch_no;
    }

    public Student(int memberId, String memberName, String branch, int batch_no) {
        super(memberId, memberName);
        this.branch = branch;
        this.batch_no = batch_no;
    }

    void dispalyDetails() {
        System.out.println("MemberId :- " + this.getMemberId());
        System.out.println("MemberName :- " + this.getMemberName());
        System.out.println("Branch :- " + this.getBranch());
        System.out.println("batch_no :- " + this.getBatch_no());
    }

}