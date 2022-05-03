public class U1 extends Rocket{
    public U1() {
//    Rocket cost = $100 Million
        cost = 100;
//    Rocket weight = 10 Tonnes
        weight = 10000; //kg
//    Max weight (with cargo) = 18 Tonnes
        maxWeight = 18000; //kg
//    Chance of launch explosion = 5% * (cargo carried / cargo limit)
        launchExplosion = 0.0;
//    Chance of landing crash = 1% * (cargo carried / cargo limit)
        landingCrash = 0.0;
        currentWeight = weight;
    }


//    Calculations of crash launch
    @Override
    public boolean launch() {
        double randomValue = (int)((Math.random()*100) + 1);
        double crashLaunchProb = 5.0*((this.currentWeight-this.weight)/
                (this.maxWeight-this.weight));
        return crashLaunchProb<=randomValue;
    }

//    Calculations of crash land
    @Override
    public boolean land() {
        double randomValue = (int)((Math.random()*100) + 1);
        double crashLandProb = 1.0*((this.currentWeight-this.weight)/
                (this.maxWeight-this.weight));
        return crashLandProb<=randomValue;
    }
}
