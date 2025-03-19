// Item.java - Define the Item class with static and instance variables, methods
class Item {
    // Static variable to track the number of objects created
    static int objectCount = 0;

    // Instance variable to store the name of the item
    String itemName;

    // Constructor to initialize the itemName and increment the objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment the static variable when a new object is created
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the name of the item
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

// ItemDemo.java - Main class to demonstrate the Item class
public class ItemDemo {
    public static void main(String[] args) {
        // Create Item objects with different names
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Call the instance method to display each item's name
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Call the static method to display the total number of objects created
        Item.displayObjectCount();
    }
}
