public class ConferenceEvent extends Event{
    
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
 
    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, double eventCost, int totalParticipants, int totalEventDays,double breakfastCost,double lunchCost,double dinnerCost){
        super(eventID,eventName,eventLocation,pointOfContact,eventCost,totalParticipants,totalEventDays);
         
        this.breakfastCost = breakfastCost;  
          
        this.lunchCost = lunchCost;  
         
        this.dinnerCost = dinnerCost;  
    }   

    public void calculateEventCost(){
        conferenceEventCost = getEventCost()+ (getBreakfastCost()+ getLunchCost()+ getDinnerCost())*getTotalParticipants() * getTotalEventDays();
    }

    Event event=new Event(getEventID(), getEventName(), getEventLocation(), getPointOfContact(),getEventCost(), getTotalParticipants(),getTotalEventDays());

    public String toString(){
        return "Conference Event details: "+"\n"+
        "Event ID:"+ getEventID()+"\n" +
        "Event Name:"+ getEventName()+"\n" +
        "Event Location:"+ getEventLocation()+"\n" +
        "Total participants:"+ getTotalParticipants()+"\n"+
        "Total Conference Cost:"+ conferenceEventCost;
    }

    // Getters  
    public boolean isBreakfastRequired() {  
        return breakfastRequired;  
    }  
  
    public double getBreakfastCost() {  
        return breakfastCost;  
    }  
  
    public boolean isLunchRequired() {  
        return lunchRequired;  
    }  
  
    public double getLunchCost() {  
        return lunchCost;  
    }  
  
    public boolean isDinnerRequired() {  
        return dinnerRequired;  
    }  
  
    public double getDinnerCost() {  
        return dinnerCost;  
    }  
  
    public double getConferenceEventCost() {  
        return conferenceEventCost;  
    }  
  
    // Setters  
    public void setBreakfastRequired(boolean breakfastRequired) {  
        this.breakfastRequired = breakfastRequired;  
    }  
  
    public void setBreakfastCost(double breakfastCost) {  
        this.breakfastCost = breakfastCost;  
    }  
  
    public void setLunchRequired(boolean lunchRequired) {  
        this.lunchRequired = lunchRequired;  
    }  
  
    public void setLunchCost(double lunchCost) {  
        this.lunchCost = lunchCost;  
    }  
  
    public void setDinnerRequired(boolean dinnerRequired) {  
        this.dinnerRequired = dinnerRequired;  
    }  
  
    public void setDinnerCost(double dinnerCost) {  
        this.dinnerCost = dinnerCost;  
    }  
  
    public void setConferenceEventCost(double conferenceEventCost) {  
        this.conferenceEventCost = conferenceEventCost;  
    }  

}
