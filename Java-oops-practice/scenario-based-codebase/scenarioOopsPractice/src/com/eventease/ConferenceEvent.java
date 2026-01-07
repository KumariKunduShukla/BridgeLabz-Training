package com.eventease;
class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees,
                            double venueCost, double serviceCost) {
        super(name, location, date, attendees, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println(" Conference scheduled with professional setup!");
    }
}
