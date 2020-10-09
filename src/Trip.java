public class Trip {
    private int timeInMinutes;
    private int totalFee;
    private Member membership;


    public Trip(int timeInMinutes, Member membership){
        this.timeInMinutes = timeInMinutes;
        this.membership = membership;
    }

    public void calculateFee(){
        if(isShortTrip()){
            this.totalFee = timeInMinutes * 3;
        }
        else{
            if(isNotMember()){
                this.totalFee = timeInMinutes * 3;
            }
            else if(isLowMember()){
                this.totalFee = Math.round((timeInMinutes * 3) * .9f);
            }
            else if(isHighMember()){
                this.totalFee = Math.round((timeInMinutes * 3) * .75f);
            }
        }
    }

    private boolean isShortTrip(){
        return timeInMinutes <= 30;
    }

    private boolean isNotMember(){
        return membership.getMembershipLevel() == 0;
    }

    private boolean isLowMember(){
        return membership.getMembershipLevel() == 1;
    }

    private boolean isHighMember(){
        return membership.getMembershipLevel() == 2;
    }
}
