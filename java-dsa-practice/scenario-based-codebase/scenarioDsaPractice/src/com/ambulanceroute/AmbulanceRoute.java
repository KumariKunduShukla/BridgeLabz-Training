package com.ambulanceroute;

public class AmbulanceRoute {
	public static void main(String[] args) {

		Route route = new Route();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayRoute();

        route.findAvailableUnit();

        route.removeUnit("Radiology");

        route.displayRoute();
    }
}
