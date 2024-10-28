public class U1 extends Rocket{
    public U1() {
        cost = 100*1000000;
        rocketWeight = 10;
        maxWeight = 18;
    }

    public boolean launch() {
       double probability = 0.05 * (rocketWeight / maxWeight);
       if(probability* 100 > 4.5) {
           return false;
       }
       return true;
    }

    public  boolean land() {
        double probability = 0.01 * (rocketWeight / maxWeight);
        if(probability * 100 > 0.80) {
            return false;
        }
        return true;
    }
}
