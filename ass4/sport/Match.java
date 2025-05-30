package sport;

import infrastructure.Venue;
import sport.Athlete;

import java.time.LocalDate;

public class Match extends Event implements Competition {

    private Athlete[] athletesList = new Athlete[10];

    public Match(String title, ScheduledDate scheduledDate){
        super(title, scheduledDate);
    }

    public boolean canCompete(Athlete athlete){
        int age = LocalDate.now().getYear() - athlete.getBirthDate().getYear();
        if(age >= 14 && age <= 18){
            return true;
        }
        return false;
    }
    public void addAthleteToMatch(Athlete athlete){
        if(!canCompete(athlete)){
            throw new AddingAthleteException("AddingAthleteException");
        }
        for(int i = 0; i < athletesList.length; i++){
            if(athletesList[i] == null){
                athletesList[i] = athlete;
                return;
            }
        }
    }
    public void removeAthleteFromMatch(Athlete athlete){
        for(int i = 0; i < athletesList.length; i++){
            if(athletesList[i] != null && athletesList[i].equals(athlete)){
                athletesList[i] = null;
                return;
            }
        }
    }
    public boolean removeAthleteFromMatch(int athleteNumber){
        for(int i = 0; i < athletesList.length; i++){
            if(athletesList[i] != null && athletesList[i].getAthleteNumber() == athleteNumber){
                athletesList[i] = null;
                return true;
            }
        }
        return false;
    }
    public int getNumberOfAthletesInMatch(){
        int counter = 0;
        for(int i = 0; i < athletesList.length; i++){
            if(athletesList[i] != null){
                counter++;
            }
        }
        return counter;
    }
    public boolean athleteExists(String surname){
        for(int i = 0; i < athletesList.length; i++){
            if(athletesList[i] != null && athletesList[i].getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }
    public void checkValidity(Venue venue){
        for(int i = 0; i < venue.getMatchList().length; i++){
            if(venue.getMatchList()[i].getTitle().equals(this.getTitle())){
                System.out.println("Match " + this.getTitle() + " can be performed");
                return;
            }
        }
        System.out.println("Match " + this.getTitle() + " has not been added to venue");
    }

}