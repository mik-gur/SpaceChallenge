public class U2 extends Rocket{
    public U2() {
//    Rocket cost = $120 Million
        cost = 120;
//    Rocket weight = 18 Tonnes
        weight = 18000; //kg
//    Max weight (with cargo) = 29 Tonnes
        maxWeight = 29000; //kg
//    Chance of launch explosion = 4% * (cargo carried / cargo limit)
        launchExplosion = 0.0;
//    Chance of landing crash = 8% * (cargo carried / cargo limit)
        landingCrash = 0.0;
        currentWeight = weight;
    }


//    Calculations of crash launch
    @Override
    public boolean launch() {
        double randomValue = (int)((Math.random()*100) + 1);
        double crashLaunchProb = 4.0*((this.currentWeight-this.weight)/
                (this.maxWeight-this.weight));
        return crashLaunchProb<=randomValue;
    }

//    Calculations of crash land
    @Override
    public boolean land() {
        double randomValue = (int)((Math.random()*100) + 1);
        double crashLandProb = 8.0*((this.currentWeight-this.weight)/
                (this.maxWeight-this.weight));
        return crashLandProb<=randomValue;
    }
}
