package infrastructure;

public class Hall extends Venue {

    private boolean eveningGames;

    public Hall(String name, String phoneNumber, boolean eveningGames){
        super(name, phoneNumber);
        this.eveningGames = eveningGames;
    }
    public Hall(String name, String phoneNumber, int matchCapacity, boolean eveningGames){
        super(name, phoneNumber, matchCapacity);
        this.eveningGames = eveningGames;
    }

    public void setEveningGames(boolean eveningGames){
        this.eveningGames = eveningGames;
    }
    public boolean getEveningGames(){
        return eveningGames;
    }

    @Override
    public String toString(){
        return super.toString() + "," + eveningGames;
    }
    public double returnCapacity(){
        if(eveningGames == true){
            return 1.2 * super.getMatchList().length;
        }
        return super.getMatchList().length;
    }

}
