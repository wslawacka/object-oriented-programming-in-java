package sport;

public class Event {

    private String title;
    private ScheduledDate scheduledDate;
    private boolean cancelled;

    public Event(){}
    public Event(String title){
        this.title = title;
    }
    public Event(String title, ScheduledDate scheduledDate){
        this(title);
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

    @Override
    public String toString(){
        return "Event:" + title + "," + scheduledDate + "," + cancelled;
    }

}
