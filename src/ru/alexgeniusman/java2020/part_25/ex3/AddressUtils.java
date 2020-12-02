package ru.alexgeniusman.java2020.part_25.ex3;

public class AddressUtils {

    public static boolean isValid(String address) {
        return address.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }

}
