package infrastructure;

public class Stadium extends Venue {

    public Stadium(String name, String phoneNumber){
        super(name, phoneNumber);
    }
    public Stadium(String name, String phoneNumber, int matchCapacity){
        super(name, phoneNumber, matchCapacity);
    }

    public double returnCapacity(){
        return super.getMatchList().length;
    }

}
