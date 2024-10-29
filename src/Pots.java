public class Pots {
    boolean isOutdoor;
    int mass;
    String color;
    String artist;
    int price;

    public Pots() {
    }

    public void printInfo() {
        if (this.isOutdoor) {
            System.out.println("This " + this.mass + " pound outdoor pot by " + this.artist + " is " + this.color + " and costs $" + this.price);
        } else {
            System.out.println("This " + this.mass + " pound indoor pot by " + this.artist + " is " + this.color + " and costs $" + this.price);
        }

    }
}