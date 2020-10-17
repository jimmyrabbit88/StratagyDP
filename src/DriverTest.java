import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    @Test
    void highMemberTest(){
        Fee fee = new HighMember();
        Trip trip = new Trip(300, fee);
        trip.calcFee();
        assertEquals(675, trip.getTotalFee());
    }

    @Test
    void lowMemberTest(){
        Fee fee = new LowMember();
        Trip trip = new Trip(300, fee);
        trip.calcFee();
        assertEquals(810,trip.getTotalFee());
    }

    @Test
    void nonMemberTest(){
        Fee fee = new NonMember();
        Trip trip = new Trip(300, fee);
        trip.calcFee();
        assertEquals(900, trip.getTotalFee());
    }

    @Test
    void shortTripHighTest(){
        Fee fee = new HighMember();
        Trip trip = new Trip(25, fee);
        trip.calcFee();
        assertEquals(80, trip.getTotalFee());
    }

    @Test
    void shortTripLowTest(){
        Fee fee = new LowMember();
        Trip trip = new Trip(25, fee);
        trip.calcFee();
        assertEquals(100, trip.getTotalFee());
    }
}