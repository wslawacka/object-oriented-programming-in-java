import java.time.LocalDate;

public class Match {
    private String title;
    private ScheduledDate scheduledDate;
    private boolean cancelled;
    public Match(String title, ScheduledDate scheduledDate){
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
}
