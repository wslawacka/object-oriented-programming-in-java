public class Training {

    private String title;
    private ScheduledDate scheduledDate;
    private String trainerName;
    private boolean cancelled;

    public Training(String title) {
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setScheduledDate(ScheduledDate scheduledDate){
        this.scheduledDate = scheduledDate;
    }
    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
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
    public String getTrainerName(){
        return trainerName;
    }
    public boolean getCancelled(){
        return cancelled;
    }

}
