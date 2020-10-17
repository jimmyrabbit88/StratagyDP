public class NonMember implements Fee{
    @Override
    public void calcFee(Trip trip) {
        trip.setTotalFee(trip.getTimeInMinutes() * 3);
    }
}
