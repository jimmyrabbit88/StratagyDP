public class LowMember implements Fee {
    @Override
    public void calcFee(Trip trip) {
        if(trip.getTimeInMinutes() <= 30){
            trip.setTotalFee(100);
        }
        else {
            trip.setTotalFee(Math.round((trip.getTimeInMinutes() * 3) * .9f));
        }
    }
}
