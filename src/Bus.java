public class Bus extends PublicTransport {
    String busNum;
    int currentPassenger;
    int maxPassenger;
    String state;
    int fuelAmount;
    int speed;
    int totalFee;
    int fee;


    public Bus(String num) {
        this.busNum = num;
        this.currentPassenger = 0;
        this.maxPassenger = 30;
        this.state = "운행중";
        this.fuelAmount = 100;
        this.speed = 0;
        this.totalFee = 0;
        this.fee = 1000;
    }



    public void setState(){
        if(this.state.equals("운행중")) {
            this.currentPassenger = 0;
            this.maxPassenger = 30;
            this.totalFee = 0;
        }else {
            this.state.equals("운행중");
        }
    }

    public void fuelCheck () {
        if (fuelAmount < 10) {
            String state = "차고지행";
            System.out.println("'주유 필요!'");
        }
    }

    public void getFuel (int fuel) {
        if (fuel<0) {
            this.fuelAmount += fuel;
            this.state = "차고지행";
        } else {
            this.fuelAmount += fuel;
            this.state = "운행중";}
    }



    public void passengerRide(int passenger){
        if(this.state.equals("운행중")){
            if(this.maxPassenger<this.currentPassenger+passenger){
                System.out.println("'최대 승객 수 초과!'");
            } else {
                this.currentPassenger = this.currentPassenger+passenger;
                this.maxPassenger = this.maxPassenger-passenger;
                this.totalFee = this.totalFee+(this.currentPassenger*fee);

                System.out.println("탑승 승객 수 = " + this.currentPassenger);
                System.out.println("잔여 승객 수 = " + this.maxPassenger);
                System.out.println("요금 확인 = " + this.totalFee);
            }
        }
    }



}
