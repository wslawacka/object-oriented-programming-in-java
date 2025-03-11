public class Cyclist {
    private String name;
    private String surname;
    private String team;
    private int jerseyNumber;
    public Cyclist(){}
    public Cyclist(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setTeam(String team){
        this.team = team;
    }
    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getTeam(){
        return this.team;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }

}
