package GymMemberShip;

// Base class
class GymMembership {
    protected String memberName;
    protected String membershipType; 
    protected int duration; 

    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }
}
