import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }
        owners.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            return owners.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : owners.keySet()
        ) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        List owner = new ArrayList();
        for (String own : owners.values()
        ) {
            if (owner.contains(own)) {
            } else {
                owner.add(own);
            }
        }
        for (Object string : owner
        ) {
            System.out.println(string);
        }
    }
}

