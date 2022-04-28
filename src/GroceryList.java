import java.util.ArrayList;
import java.util.function.IntFunction;

//class declaration
public class GroceryList extends ArrayList<String> {
    //Starting an Array
    private ArrayList<String> groceryList = new ArrayList();
//Method to add items to Grocery List
public void addGroceryItem(String item){
    //Tells the array to add the item
    groceryList.add(item);
}
//checks if list is empty
public void checkGroceryList(){
    boolean contentsCheck = groceryList.isEmpty();
    //if contentCheck returns true, then the ArrayList is empty.
    if (contentsCheck == true)
        System.out.println("Grocery List is Empty!");
        //if contentCheck returns false, then the ArrayList is not empty.
    else
        System.out.println("The Grocery List isn't Empty");
}
public void printGroceryList(){
    if(groceryList.size() > 0) {
        throw new IllegalArgumentException("Array Is Empty! Add to Array before trying to print");
    }
    else {
        System.out.println("There are" + groceryList.size() + "items in your Grocery Bag");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
}
public void editGroceryList (int position, String newItem) {
    //set is an ArrayList method that allows us to set the index of an item
    if (position < 0 || position + 1 > groceryList.size()){
        //If the index is lower than zero, or the size of the array is smaller of than the index + 1, then the program will throw an exception.
        throw new IllegalArgumentException("Array Is Empty! Add to Array before editing");
    }
    else {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item" + (position + 1) + "has been edited");
    }
}
public void removeGroceryItem(int position){
    //If the index is lower than zero, or the size of the array is smaller of than the index + 1, then the program will throw an exception.
    if(position < 0 || position + 1 > groceryList.size()){
        throw new IllegalArgumentException("Array Index cannot be lower than zero! Select an Item in the list to proceed");
    }
    else {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + "has been removed!");
    }
}
public String findItem(String searchItem){
    //Turning String Query into an index.
 int position = groceryList.indexOf(searchItem);
 //Arraylist indexes starts storing from zero. If index is 0 => then method finds the item
    if (position >= 0){
        return groceryList.get(position);
    }
    return null;
}

}
