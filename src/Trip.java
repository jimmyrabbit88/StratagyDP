public class Trip {
    private int timeInMinutes;
    private int totalFee;
    private Fee fee;


    public Trip(int timeInMinutes, Fee fee){
        this.timeInMinutes = timeInMinutes;
        this.fee = fee;
    }

    public void calcFee(){
        fee.calcFee(this);
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public int getTotalFee() {
        return totalFee;
    }
}
