package sport;

import java.time.LocalDate;

public class ScheduledDate {

    private LocalDate scheduledDate;

    public ScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setScheduledDate(LocalDate scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    @Override
    public String toString(){
        return "ScheduledDate:" + scheduledDate;
    }
}