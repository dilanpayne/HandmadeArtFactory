public class HandmadeArtFactory {
    String location;
    int sqft;
    boolean isOpen;

    public static void main(String[] args) {
        HandmadeArtFactory myStore = new HandmadeArtFactory();
        myStore.location = "Boston";
        myStore.sqft = 234;
        myStore.isOpen = true;

        if (myStore.isOpen) {
            System.out.println("This open art store in " + myStore.location + " is " + myStore.sqft + " square feet");
        } else {
            System.out.println("This closed art store in " + myStore.location + " is " + myStore.sqft + " square feet");
        }
    }
    public HandmadeArtFactory(){
            Pots pot1 = new Pots();
            pot1.mass = 30;
            pot1.isOutdoor = true;
            pot1.color = "green";
            pot1.artist = "Bob";
            pot1.price = 230;
            pot1.printInfo();
            Paintings painting1 = new Paintings();
            painting1.sqft = 20;
            painting1.isOil = true;
            painting1.color = "pink";
            painting1.artist = "Mary";
            painting1.price = 9000;
            painting1.printInfo();

    }
}
