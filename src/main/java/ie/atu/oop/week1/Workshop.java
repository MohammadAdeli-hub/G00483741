package ie.atu.oop.week1;

public class Workshop {
    private String name;
    private int capacity;
    private String IDs;
   public Workshop(String name, int capacity, String IDs) {
       this.name = name;
       this.capacity = capacity;
       this.IDs = IDs;

   }
   public String getName() {
       return name;
   }

    public int getCapacity() {
        return capacity;
    }
    public String getIDs() {
       return IDs;
    }
    public void displayWorkshop() {

        System.out.println( "Name: " + name + " Capacity: " + capacity + " IDs: " + IDs);
    }

}



