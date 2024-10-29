public class Paintings {
    boolean isOil;
    int sqft;
    String color;
    int price;
    String artist;

    public Paintings() {
    }

    public void printInfo() {
        if (this.isOil) {
            System.out.println("This " + this.color + " painting is not watercolor, but is oil, and is by " + this.artist + ". It is " + this.sqft + " square feet and costs $" + this.price);
        } else {
            System.out.println("This " + this.color + " painting is not oil but watercolor, and is by " + this.artist + ". It is " + this.sqft + " square feet and costs $" + this.price);
        }

    }
}