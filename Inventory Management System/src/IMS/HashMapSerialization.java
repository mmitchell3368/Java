package IMS;

import java.io.*;
import java.util.HashMap;

public class HashMapSerialization {
	
	public void exportStringHashMapToFile(HashMap<String, String> hashMap, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(hashMap);
            System.out.println("HashMap exported successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, String> importStringHashMapFromFile(String fileName) {
        HashMap<String, String> hashMap = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            hashMap = (HashMap<String, String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hashMap;
    }
    
    public void exportProductHashMapToFile(HashMap<Integer, Product> hashMap, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(hashMap);
            System.out.println("HashMap exported successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Integer, Product> importProductHashMapFromFile(String fileName) {
        HashMap<Integer, Product> hashMap = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            hashMap = (HashMap<Integer, Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

}
