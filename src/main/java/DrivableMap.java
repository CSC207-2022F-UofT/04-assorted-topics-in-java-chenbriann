/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    /**
     * Adds Drivable object to map.
     *
     * @param id     ID of object to be added.
     * @param object Drivable object to be added to map.
     * @return True if object was added to map, false otherwise.
     */
    public boolean addDrivable(String id, Drivable object) {
        if (drivable_map.containsKey(id)) {
            return false;
        }

        drivable_map.put(id, object);
        return true;
    }


    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    /**
     * Returns if at least one item in map has speed greater than or equal to the given speed.
     *
     * @param speed given threshold speed
     * @return True if at least one item in map has a maxSpeed >= the speed given, false otherwise.
     */
    public boolean hasFasterThan(int speed) {


        for (String key : drivable_map.keySet()) {
            if (drivable_map.get(key).getMaxSpeed() >= speed) {
                return true;
            }

        }

        return false;
    }


    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable() {
        List<Tradable> tradable_items = new ArrayList<>();

        for (Drivable item : drivable_map.values()) {
            if (item instanceof Tradable) {
                tradable_items.add((Tradable) item);

            }
        }
        return tradable_items;

    }


}