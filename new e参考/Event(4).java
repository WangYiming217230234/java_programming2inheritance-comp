public class Event{
    
    public static final double insuranceCost = 1000.00;
    public static final double tax = 0.3;
    
    String eventID;
    String eventName;
    String eventLocation;
    String pointOfContact;
    double eventCost;
    int totalParticipants;
    int totalEventDays;

    public Event(){}
    public Event(String eventID, String eventName, String eventLocation, String pointOfContact, double eventCost, int totalParticipants, int totalEventDays) {  
        this.eventID = eventID;  
        this.eventName = eventName;  
        this.eventLocation = eventLocation;  
        this.pointOfContact = pointOfContact;  
        this.eventCost = eventCost;  
        this.totalParticipants = totalParticipants;  
        this.totalEventDays = totalEventDays;  
    }  
  
    // Getters  
    public String getEventID() {  
        return eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public String getEventLocation() {  
        return eventLocation;  
    }  
  
    public String getPointOfContact() {  
        return pointOfContact;  
    }  
  
    public double getEventCost() {  
        return eventCost;  
    }  
  
    public int getTotalParticipants() {  
        return totalParticipants;  
    }  
  
    public int getTotalEventDays() {  
        return totalEventDays;  
    }  
  
    // Setters  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public void setEventLocation(String eventLocation) {  
        this.eventLocation = eventLocation;  
    }  
  
    public void setPointOfContact(String pointOfContact) {  
        this.pointOfContact = pointOfContact;  
    }  
  
    public void setEventCost(double eventCost) {  
        this.eventCost = eventCost+(eventCost*0.3)+(insuranceCost);  
    }  
  
    public void setTotalParticipants(int totalParticipants) {  
        this.totalParticipants = totalParticipants;  
    }  
  
    public void setTotalEventDays(int totalEventDays) {  
        this.totalEventDays = totalEventDays;  
    } 

    public String toString(){
        return eventID+" "+eventName+" "+eventLocation+" "+pointOfContact+" "+eventCost+" "+totalParticipants+" "+totalEventDays;
    }

    public void calculateEventCost(){
        this.eventCost =eventCost +(eventCost * tax)+ insuranceCost;
    }
}