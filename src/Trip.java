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
                this.totalFee = doCalculationNonMember();
            }
            else if(isLowMember()){
                this.totalFee = doCalculationLowMember();
            }
            else if(isHighMember()){
                this.totalFee = doCalculationHighMember();
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

    private int doCalculationNonMember(){
        return timeInMinutes * 3;
    }
    private int doCalculationLowMember(){
        return Math.round((timeInMinutes * 3) * .9f);
    }
    private int doCalculationHighMember(){
        return Math.round((timeInMinutes * 3) * .75f);
    }
}
