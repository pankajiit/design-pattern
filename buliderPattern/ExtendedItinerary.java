package DesignPatterns.builderPattern;

// ExtendedItinerary class extending the basic Itinerary to include insurance and car rental
public class ExtendedItinerary extends Itinerary {
    private String insurance;
    private String carRental;

    // Constructor to initialize ExtendedItinerary using ExtendedBuilder
    public ExtendedItinerary(ExtendedBuilder builder) {
        super(builder); // Call super constructor from Itinerary
        this.insurance = builder.insurance;
        this.carRental = builder.carRental;
    }

    // ExtendedBuilder class to build ExtendedItinerary objects
    public static class ExtendedBuilder extends Q5.Itinerary.ItineraryBuilder {
        private String insurance;
        private String carRental;

        // Method to set insurance and return the builder
        public ExtendedBuilder setInsurance(String insurance) {
            this.insurance = insurance;
            return this;
        }

        // Method to set car rental and return the builder
        public ExtendedBuilder setCarRental(String carRental) {
            this.carRental = carRental;
            return this;
        }

        // Override build() method to return ExtendedItinerary
        @Override
        public ExtendedItinerary build() {
            return new ExtendedItinerary(this);
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Using the extended builder to create an ExtendedItinerary object with all options
        ExtendedItinerary extendedItinerary = new ExtendedItinerary().ExtendedBuilder()
                .setFlight("Jaipur to Bengaluru")
                .setHotelStay("Taj Hotel")
                .setTour("Premium")
                .setInsurance("Comprehensive Insurance")
                .setCarRental("Luxury Car Rental")
                .build();

        // Printing the extended itinerary details
        System.out.println("Extended Itinerary:");
        System.out.println("Flight: " + extendedItinerary.getFlight());
        System.out.println("Hotel Stay: " + extendedItinerary.getHotelStay());
        System.out.println("Tour: " + extendedItinerary.getTour());
        System.out.println("Insurance: " + extendedItinerary.insurance);
        System.out.println("Car Rental: " + extendedItinerary.carRental);
    }
}
