package com.tourmate;

public class TourMateAap {
	public static void main(String[] args) {

        Transport transport = new Transport(15000);
        Hotel hotel1 = new Hotel(20000);
        Hotel hotel2 = new Hotel(78000);
        Activity activity = new Activity(5000);

        Trip trip1 = new DomesticTrip(
                "Goa", 5, transport, hotel1, activity);
        
        Trip trip3 = new DomesticTrip(
                "America", 5, transport, hotel2, activity);

        Trip trip2 = new InternationalTrip(
                "Paris", 7,
                new Transport(60000),
                new Hotel(80000),
                new Activity(20000));

        trip1.book();
        System.out.println();
        trip3.book();
        System.out.println();

        trip2.book();
    }
}
