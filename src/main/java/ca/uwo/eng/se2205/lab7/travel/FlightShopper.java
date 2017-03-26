package ca.uwo.eng.se2205.lab7.travel;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Collection;
import java.util.Set;

/**
 * Optimized utility for shopping for flights.
 */
@ParametersAreNonnullByDefault
public final class FlightShopper {

    /**
     * Builds a {@code FlightShopper} via a {@link Set} of {@link Airport}s and {@link Flight}s.
     *
     * @param airports The available airports
     * @param flights All available flights
     */
    public FlightShopper(Collection<? extends Airport> airports, Collection<? extends Flight> flights) {
        // DO NOT CHANGE THE METHOD SIGNATURE
        // Initialize your shopper
    }


    /**
     * Finds the cheapest flight from two {@link Airport}s.
     * @param from Starting airport
     * @param to Ending airport
     * @return Cheapest {@code Itinerary} to fly between {@code from} and {@code to}
     */
    public Itinerary price(Airport from, Airport to) {
        return null;
    }



}
