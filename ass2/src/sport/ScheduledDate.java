package sport;

import java.time.LocalDate;

public class ScheduledDate {
    private LocalDate date;
    public ScheduledDate(LocalDate date){
        this.date = date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalDate getDate(){
        return this.date;
    }
    @Override
    public String toString(){
        return "ScheduledDate:" + this.date;
    }
}
