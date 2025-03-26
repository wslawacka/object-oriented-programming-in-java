package infrastructure;

import sport.Match;
import sport.SportsDiscipline;

public abstract class Venue {

    private String name;
    private String phoneNumber;
    private Match[] matchList;
    private SportsDiscipline sportsDiscipline;

    public Venue(){}
    public Venue(String name) {
        this.name = name;
    }
    public Venue(String name, String phoneNumber){
        this(name);
        this.phoneNumber = phoneNumber;
    }
    public Venue(String name, String phoneNumber, int matchCapacity){
        this(name, phoneNumber);
        this.matchList = new Match[matchCapacity];
    }

    public Match[] getMatchList(){
        return matchList;
    }

    @Override
    public String toString(){
        return "Venue:" + name + "," + phoneNumber + "," + sportsDiscipline;
    }
    public void addMatch(Match match){
        for(int i = 0; i < matchList.length; i++){
            if(matchList[i] == null){
                matchList[i] = match;
                return;
            }
        }
    }
    public void removeMatches(){
        for(int i = 0; i < matchList.length; i++){
            matchList[i] = null;
        }
    }

    public double returnOccupancy(){
        float counter = 0;
        for(int i = 0; i < matchList.length; i++){
            if(matchList[i] != null){
                counter++;
            }
        }
        return counter / returnCapacity() * 100;
    }

    public abstract double returnCapacity();

}