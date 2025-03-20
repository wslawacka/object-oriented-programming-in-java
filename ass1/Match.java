import java.time.LocalDate;

public class Match {

    private String title;
    private ScheduledDate scheduledDate;
    private boolean cancelled;

    public Match(String title, ScheduledDate scheduledDate) {
        this.title = title;
        this.scheduledDate = scheduledDate;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setScheduledDate(ScheduledDate scheduledDate){
        this.scheduledDate = scheduledDate;
    }
    public void setCancelled(boolean cancelled){
        this.cancelled = cancelled;
    }

    public String getTitle(){
        return title;
    }
    public ScheduledDate getScheduledDate(){
        return scheduledDate;
    }
    public boolean getCancelled(){
        return cancelled;
    }

    public boolean canCompete(Athlete athlete){
        int age = LocalDate.now().getYear() - athlete.getBirthDate().getYear();
        if(age >= 14 && age <= 18){
            return true;
        }
        return false;
    }

}
