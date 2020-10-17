public class HighMember implements Fee{
    @Override
    public void calcFee(Trip trip) {
        if(trip.getTimeInMinutes() <= 30){
            trip.setTotalFee(80);
        }
        else {
            trip.setTotalFee(Math.round((trip.getTimeInMinutes() * 3) * .75f));
        }
    }
}
