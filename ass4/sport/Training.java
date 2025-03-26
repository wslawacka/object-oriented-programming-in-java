package sport;

import sport.ScheduledDate;

public class Training extends Event {

    private String trainerName;

    public Training(String title, ScheduledDate scheduledDate, String trainerName){
        super(title, scheduledDate);
        this.trainerName = trainerName;
    }

    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
    }
    public String getTrainerName(){
        return trainerName;
    }

    @Override
    public String toString(){
        return super.toString() + "," + trainerName;
    }

}