package sport;

import sport.Athlete;

import java.time.LocalDate;

public class Match {
    private String title;
    private ScheduledDate scheduledDate;
    private boolean cancelled;
    private Athlete[] athletesList;
    public Match(){
        this.athletesList = new Athlete[10];
    }
    public Match(String title, ScheduledDate scheduledDate){
        this();
        this.title = title;
        this.scheduledDate = scheduledDate;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setTermin(ScheduledDate scheduledDate){
        this.scheduledDate = scheduledDate;
    }
    public void setCancelled(boolean cancelled){
        this.cancelled = cancelled;
    }
    public String getTitle(){
        return this.title;
    }
    public ScheduledDate getTermin(){
        return this.scheduledDate;
    }
    public boolean getCancelled(){
        return this.cancelled;
    }
    public boolean canCompete(Athlete athlete){
        int birthYear = athlete.getBirthDate().getYear();
        int age = LocalDate.now().getYear() - birthYear;
        if(age >= 14 && age <= 18){
            return true;
        }
        return false;
    }
    public void addAthleteToMatch(Athlete athlete){
        for (int i = 0; i < this.athletesList.length; i++){
            if (this.athletesList[i] == null) {
                this.athletesList[i] = athlete;
                return;
            }
        }
        System.out.println("You cannot add " + athlete + " to the match. There are already 10 athletes!");
        return;
    }
    public void removeAthleteFromMatch(Athlete athlete){
        for (int i = 0; i < this.getNumberOfAthletesInMatch(); i++){
            if(this.athletesList[i] == athlete){
                for (int j = i; j < this.athletesList.length-1; j++){
                    this.athletesList[j] = this.athletesList[j+1];
                }
                this.athletesList[this.athletesList.length-1] = null;
                return;
            }
        }
        System.out.println("You cannot remove " + athlete + " from the match - the athlete was not there!");
    }
    public boolean removeAthleteFromMatch(int athleteNumber){
        for (int i = 0; i < this.getNumberOfAthletesInMatch(); i++){
            if(this.athletesList[i].getAthleteNumber()  == athleteNumber){
                for (int j = i; j < this.athletesList.length-1; j++){
                    this.athletesList[j] = this.athletesList[j+1];
                }
                this.athletesList[this.athletesList.length-1] = null;
                return true;
            }
        }
        System.out.println("You cannot remove athlete with number " + athleteNumber + " from the match - the athlete was not there!");
        return false;
    }
    public int getNumberOfAthletesInMatch(){
        int number = 0;
        for (Athlete ath : this.athletesList){
            if (ath != null){
                number++;
            }
        }
        return number;
    }
    public boolean athleteExists(String surname){
        for (Athlete ath : this.athletesList){
            if(ath != null && ath.getSurname().equals(surname)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "Match:" + this.title + "," + this.scheduledDate + "," + this.cancelled;
    }
}
