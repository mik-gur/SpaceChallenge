public class Rocket implements SpaceShip{
    int cost;
    int weight;
    int maxWeight;
    double launchExplosion;
    double landingCrash;
    int currentWeight;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        if(this.currentWeight+item.getWeight()<=maxWeight)
            return true;
        return false;
    }

    @Override
    public int carry(Item item) {
        this.currentWeight += item.getWeight();
        return this.currentWeight;
    }

}
