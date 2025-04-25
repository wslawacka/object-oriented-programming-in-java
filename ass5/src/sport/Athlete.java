package sport;

import infrastructure.Venue;

import java.time.LocalDate;

public class Athlete implements Competition{

    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;
    private SportsDiscipline sportsDiscipline;
    private Match[] ownMatchList = new Match[5];

    public Athlete() {}
    public Athlete(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Athlete(String name, String surname, int athleteNumber, LocalDate birthDate){
        this(name, surname);
        this.athleteNumber = athleteNumber;
        this.birthDate = birthDate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAthleteNumber(int athleteNumber){
        this.athleteNumber = athleteNumber;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public void setSportsDiscipline(SportsDiscipline sportsDiscipline){
        this.sportsDiscipline = sportsDiscipline;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAthleteNumber(){
        return athleteNumber;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public SportsDiscipline getSportsDiscipline(){
        return sportsDiscipline;
    }
    public Match[] getOwnMatchList(){ return ownMatchList; }

    @Override
    public String toString(){
        return "Athlete:" + name + "," + surname + "," + athleteNumber + "," + birthDate + "," + sportsDiscipline;
    }
    public void checkValidity(Venue venue){
        for(int i = 0; i < venue.getMatchList().length; i++){
            if(venue.getMatchList()[i] != null && venue.getMatchList()[i].athleteExists(surname)){
                for(int j = 0; j < ownMatchList.length; j++){
                    if(ownMatchList[j] == null){
                        ownMatchList[j] = venue.getMatchList()[i];
                        return;
                    }
                }
            }
        }
    }

}