package sport;

import java.time.LocalDate;
public class Athlete {
    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;
    public Athlete(){}
    public Athlete(String name, String surname){
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
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getAthleteNumber(){
        return this.athleteNumber;
    }
    public LocalDate getBirthDate(){
        return this.birthDate;
    }
    @Override
    public String toString(){
        return "Athlete:" + this.name + "," + this.surname + "," + this.athleteNumber + "," + this.birthDate;
    }
}
