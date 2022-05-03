public class Item {
    String name;
    int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
// Items whose added to Rockets
        public Item(String name, int weight){
            this.name = name;
            this.weight = weight;
        }
}
