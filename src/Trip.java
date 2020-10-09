public class Trip {
    private int timeInMinutes;
    private int totalFee;
    private Member membership;


    public Trip(int timeInMinutes, Member membership){
        this.timeInMinutes = timeInMinutes;
        this.membership = membership;
    }

    public void calculateFee(){
        if(timeInMinutes <= 30){
            this.totalFee = timeInMinutes * 3;
        }
        else{
            if(membership.getMembershipLevel() == 0){
                this.totalFee = timeInMinutes * 3;
            }
            else if(membership.getMembershipLevel() == 1){
                this.totalFee = Math.round((timeInMinutes * 3) * .9f);
            }
            else{
                this.totalFee = Math.round((timeInMinutes * 3) * .75f)
            }
        }
    }
}
