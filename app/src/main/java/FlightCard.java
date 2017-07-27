/**
 * Created by jerry on 7/27/2017.
 */

public class FlightCard {
    String dateOut;
    String dateIn;
    String lease;
    String planeType;
    String destination;
    String cashSpent;
    String hobbsIn;
    String hobbsOut;
    String totalHobbs;
    String[] passengers;

    FlightCard(String dateOut, String dateIn,String lease,String planeType,
               String destination,String cashSpent,String hobbsIn,String hobbsOut,
               String totalHobbs,String[] passengers){
        this.dateOut = dateOut;
        this.dateIn = dateIn;
        this.lease = lease;
        this.planeType = planeType;
        this.destination = destination;
        this.cashSpent = cashSpent;
        this.hobbsIn = hobbsIn;
        this.hobbsOut = hobbsOut;
        this.totalHobbs = totalHobbs;
        this.passengers = passengers;
    }


}
