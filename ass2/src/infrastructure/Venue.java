package infrastructure;

public class Venue {
    private String name;
    private String phoneNumber;
    public Venue(){}
    public Venue(String name){
        this.name = name;
    }
    public Venue(String name, String phoneNumber){
        this(name);
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Venue:" + this.name + "," + this.phoneNumber;
    }
}
