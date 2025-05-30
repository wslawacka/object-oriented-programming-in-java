import java.time.LocalDate;

public class Athlete {

    private String name;
    private String surname;
    private int athleteNumber;
    private LocalDate birthDate;

    public Athlete() {}

    public Athlete(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

}
