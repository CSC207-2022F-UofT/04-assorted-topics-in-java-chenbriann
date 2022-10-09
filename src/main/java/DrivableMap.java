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