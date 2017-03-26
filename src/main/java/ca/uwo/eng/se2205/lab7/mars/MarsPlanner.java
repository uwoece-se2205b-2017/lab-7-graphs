package ca.uwo.eng.se2205.lab7.mars;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

/**
 * Calculates the best location to land a rover.
 */
@ParametersAreNonnullByDefault
public class MarsPlanner {

    /**
     * Initializes the planner with the topology of the land and the landing sites.
     *
     * @param topology Two dimensional set of heights
     * @param sites {@code List} of coordinates that must be visited
     */
    public MarsPlanner(int[][] topology, List<int[]> sites) {
        // DO NOT CHANGE THE METHOD SIGNATURE
    }

    /**
     * Calculates the best landing spot in the topology.
     *
     * @param fuelAvailable How much fuel is available daily when travelling
     * @return Coordinates for the best landing spot
     */
    public int[] bestLandingSpot(int fuelAvailable) {
        // DO NOT CHANGE THE METHOD SIGNATURE
        return new int[] { 0, 0 };
    }

}
