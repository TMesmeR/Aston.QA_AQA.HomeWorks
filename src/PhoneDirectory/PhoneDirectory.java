package PhoneDirectory;

import Students.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {
    private HashMap<String, List<String>> phoneBook;

    public PhoneDirectory() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            List<String> phones = phoneBook.get(lastName);
            phones.add(phoneNumber);
        } else {
            List<String> list = new ArrayList<>();
            list.add(phoneNumber);
            phoneBook.put(lastName, list);
        }
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

}
