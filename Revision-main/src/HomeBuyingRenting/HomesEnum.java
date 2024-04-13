package HomeBuyingRenting;

public enum HomesEnum {

/* Has details like ID, number of bedrooms, halls, kitchen, bathroom, galleries, 
                                    total area, type of property, price, build year, current status, etc.*/

    HOME01("H001", 2, 1, 1, 2, 1, 60.0, 4, "Studio", "Oulu", 600000.00, "2010", "Available", "Renting"), 
    HOME02("H002", 1, 1, 1, 2, 0, 40.0, 2, "Apartment", "Helsinki", 100000.00, "1999", "Available Soon", "Selling"),
    HOME03("H003", 3, 2, 2, 3, 2, 250.0, 1, "Row House", "Turku", 2500000.00, "2018", "Not available", "Selling"),
    HOME04("H004", 2, 1, 1, 2, 1, 180.0, 12, "Apartment", "Tampere", 2000000.00, "2020", "Available", "Renting");

    public final String homeID;
    public final int noOfBedrooms;
    public final int noOfHalls;
    public final int noOfKitchens;
    public final int noOfBathrooms;
    public final int noOfGalleries;
    public final double totalArea;
    public final int floor;
    public final String propertyType;
    public final double price;
    public final String location;
    public final String buildYear;
    public final String availability;
    public final String sellingOrRenting;

    HomesEnum(String homeID, int noOfBedrooms, int noOfHalls, int noOfKitchens, int noOfBathrooms, int noOfGalleries, double totalArea, int floor, String propertyType, String location, double price, String buildYear, String availability, String sellingOrRenting) {
        this.homeID = homeID;
        this.noOfBedrooms = noOfBedrooms;
        this.noOfHalls = noOfHalls;
        this.noOfKitchens = noOfKitchens;
        this.noOfBathrooms = noOfBathrooms;
        this.noOfGalleries = noOfGalleries;
        this.totalArea = totalArea;
        this.floor = floor;
        this.propertyType = propertyType;
        this.price = price;
        this.location = location;
        this.buildYear = buildYear;
        this.availability = availability;
        this.sellingOrRenting = sellingOrRenting;
    }

    public String getHomeID() {
        return homeID;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public int getNoOfHalls() {
        return noOfHalls;
    }

    public int getNoOfKitchens() {
        return noOfKitchens;
    }

    public int getNoOfBathrooms() {
        return noOfBathrooms;
    }

    public int getNoOfGalleries() {
        return noOfGalleries;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public int getFloor() {
        return floor;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public String getAvailability() {
        return availability;
    }

    public String getSellingOrRenting() {
        return sellingOrRenting;
    }


    public String toString(){
        return "\n" + "Home ID: " + homeID + 
        "\n" + "Number of Bedrooms: " + noOfBedrooms +
        "\n" + "Number of Halls: " + noOfHalls +
        "\n" + "Number of Kitchens: " + noOfKitchens +
        "\n" + "Number of Bathrooms: " + noOfBathrooms +
        "\n" + "Number of Galleries: " + noOfGalleries +
        "\n" + "Total Area: " + totalArea + " sq. mt." +
        "\n" + "Floor: " + floor +
        "\n" + "Property Type: " + propertyType +
        "\n" + "Price: " + price +
        "\n" + "Build Year: " + buildYear +
        "\n" + "Availability: " + availability +
        "\n" + "Selling or Renting: " + sellingOrRenting;

    }
    
}
