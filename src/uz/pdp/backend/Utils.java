package uz.pdp.backend;

import java.util.UUID;

public class Utils {
    public static String generateUniqueID(){
        return UUID.randomUUID().toString();
    }
}
