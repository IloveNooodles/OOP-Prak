import java.util.ArrayList;

public abstract class Property {
    private ArrayList<Facility> facilities;

    public Property(){
        this.facilities = new ArrayList<>();
    }

    public abstract void getTotalPrice();
    public abstract void getDailyPrice();

    public void addFacility(Facility f) {
        this.facilities.add(f);
    }
}
