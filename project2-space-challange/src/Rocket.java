public class Rocket implements SpaceShip{
    protected int cost;
    protected int rocketWeight;
    protected int maxWeight;


    public boolean launch()  {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return rocketWeight + item.weight <= maxWeight;
    }

    public void carry(Item item) {
        if(canCarry(item)) {
            rocketWeight += item.weight;
        }
    }
}
