public class U2 extends Rocket {
    public U2() {
        cost = 120 * 1000000;
        rocketWeight = 18;
        maxWeight = 29;
    }

    public boolean launch(){
        double probability = 0.04 * (rocketWeight / maxWeight);
        if(probability > 3.4) {
            return false;
        }
        return true;
    }


    public boolean land() {
        double probability = 0.08 * (rocketWeight/ maxWeight);
        if(probability > 6.8) {
            return false;
        }
        return true;
    }
}
