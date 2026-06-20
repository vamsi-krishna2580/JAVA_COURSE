public class Member {
    private int MemberId;
    private String MemberName;

    public Member(int memberId, String memberName) {
        MemberId = memberId;
        MemberName = memberName;
    }

    void displayDetails(){
        System.out.println("MemberId :- "+ this.getMemberId());
        System.out.println("MemberName :- "+ this.getMemberName());
    }

    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }
}
