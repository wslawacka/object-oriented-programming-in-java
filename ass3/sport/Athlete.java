package sport;

import java.time.LocalDate;

public class Athlete {

    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;
    private SportsDiscipline sportsDiscipline;

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

    @Override
    public String toString(){
        return "Athlete:" + name + "," + surname + "," + athleteNumber + "," + birthDate;
    }

}