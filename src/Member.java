public class Member {
    private String name;
    private int membershipLevel;

    public Member(String name){
        this.name = name;
        this.membershipLevel = 0;
    }

    public void changeMembership(int level){
        this.membershipLevel = level;
    }

    public String getName() {
        return name;
    }

    public int getMembershipLevel() {
        return membershipLevel;
    }
}
