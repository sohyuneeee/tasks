import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("1234");
        Bus bus2 = new Bus("5678");
        System.out.println(bus1.busNum);
        System.out.println(bus2.busNum);

        bus1.passengerRide(2);

        bus1.getFuel(-50);
        System.out.println(bus1.fuelAmount);
        System.out.println(bus1.state);
        bus1.getFuel(10);
        System.out.println(bus1.fuelAmount);
        System.out.println(bus1.state);

        bus1.passengerRide(45);
        bus1.setState();
        bus1.passengerRide(5);

        bus1.getFuel(-55);
        System.out.println(bus1.fuelAmount);
        System.out.println(bus1.state);
        bus1.fuelCheck();


        Taxi taxi1 = new Taxi("4321");
        Taxi taxi2 = new Taxi("8765");
        System.out.println(taxi1.taxiNum);
        System.out.println(taxi2.taxiNum);
        System.out.println(taxi1.fuelAmount);
        System.out.println(taxi1.state);

        taxi1.passengerRide(2);
        taxi1.setDestination("서울역",2);
        taxi1.setFee(2);
        System.out.println("지불할 요금 = " + taxi1.totalFee);

        taxi1.getFuel(-80);
        taxi1.setFee(2);
        System.out.println("누적 요금 = " + taxi1.totalFee);

        taxi1.setState();
        taxi1.passengerRide(5);
        taxi1.passengerRide(3);
        taxi1.setDestination("구로디지털단지역",12);
        taxi1.setFee(12);
        System.out.println("지불할 요금 = " + taxi1.totalFee);

        taxi1.getFuel(-20);
        taxi1.setState();

        System.out.println("누적 요금 = " + taxi1.income);
        taxi1.checkFuel();
    }
}
