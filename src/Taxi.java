public class Taxi extends PublicTransport {

    String taxiNum;
    int maxPassenger;
    int distanceFee;
    int basicDistance;
    int fuelAmount;
    String state;
    int speed;
    int totalFee;
    int fee;
    String destination;
    int distance;
    int income;

    public Taxi(String num){
        this.taxiNum = num;
        this.maxPassenger = 4;
        this.fee = 3000;
        this.distanceFee = 1000;
        this.basicDistance = 1;
        this.fuelAmount = 100;
        this.state = "일반";
        this.speed = 0;
        this.totalFee = 0;
        this.income = 0;
    }

    public void setState(){
        if(this.fuelAmount>10){
            this.state = "일반";
            this.currentPassenger = 0;
            this.maxPassenger = 4;
        }else if(this.fuelAmount<=0){
            this.state = "운행불가";
            System.out.println("상태 = " + this.state);
        }
    }


    public void getFuel(int fuel){
        if(this.fuelAmount !=0){
            this.fuelAmount = this.fuelAmount+fuel;
            System.out.println("주유량 = " + this.fuelAmount);
        }
    }

    public void checkFuel(){
        if(this.fuelAmount<=0){
            System.out.println("'주유 필요'");
        }
    }


    public void passengerRide(int passenger){
        if(this.state.equals("일반")){
            if(this.maxPassenger<this.currentPassenger+passenger){
                System.out.println("'최대 승객 수 초과!'");
            } else if(passenger>0){
                this.state = "운행중";
                this.currentPassenger=this.currentPassenger+passenger;
                this.maxPassenger=this.maxPassenger-passenger;

                System.out.println("탑승 승객 수 = " + this.currentPassenger);
                System.out.println("잔여 승객 수 = " + this.maxPassenger);
                System.out.println("상태= " + this.state);
            }
        }
    }

    public void setDestination (String destination, int distance){
        this.destination = destination;
        this.distance = distance;
        System.out.println("목적지 = " + this.destination);
        System.out.println("목적지까지 거리 = " + this.distance+"km");
    }

    public void setFee (int distance){
        this.totalFee = this.fee + ((distance-this.basicDistance)*this.distanceFee);

    }

}
