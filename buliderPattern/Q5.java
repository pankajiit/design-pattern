package DesignPatterns.buliderPattern;

public class Q5 {

    // Itinerary class which contains the flight, hotel stay, and tour details
    public static class Itinerary {
        private String flight;
        private  String hotelStay;
        private String tour;

        // Private constructor to initialize the Itinerary object using the builder
        private Itinerary(ItineraryBuilder builder) {
            this.flight = builder.flight;
            this.hotelStay = builder.hotelStay;
            this.tour = builder.tour;
        }

        // Nested static builder class
        public static class ItineraryBuilder {
            private String flight;
            private String hotelStay;
            private String tour;

            // Method to set the flight and return the builder
            public ItineraryBuilder setFlight(String flightName) {
                this.flight = flightName;
                return this;
            }

            // Method to set the hotel stay and return the builder
            public ItineraryBuilder setHotelStay(String hotelName) {
                this.hotelStay = hotelName;
                return this;
            }

            // Method to set the tour and return the builder
            public ItineraryBuilder setTour(String tourName) {
                this.tour = tourName;
                return this;
            }

            // Method to build the Itinerary object
            public Itinerary build() {
                return new Itinerary(this);
            }
        }
    }

    public static void main(String[] args) {
        // Using the builder to create an Itinerary object
        Itinerary itinerary1 = new Itinerary.ItineraryBuilder()
                .setFlight("Jaipur to Bengaluru")
                .setHotelStay("Taj Hotel")
                .setTour("Premium")
                .build();

        // Printing the itinerary details
        System.out.println("Flight: " + itinerary1.flight);
        System.out.println("Hotel Stay: " + itinerary1.hotelStay);
        System.out.println("Tour: " + itinerary1.tour);

        Itinerary itinerary2 = new Itinerary.ItineraryBuilder()
        .setFlight("Jaipur to Delhi")
        .setTour("Premium")
        .build();

        // Printing the itinerary details
        System.out.println("Flight: " + itinerary2.flight);
        System.out.println("Hotel Stay: " + itinerary2.hotelStay);
        System.out.println("Tour: " + itinerary2    .tour);
    }
}
