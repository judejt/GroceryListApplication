import java.util.Scanner; //importing Scanner to read user input.
//main class Intialisation
public class Main {
    //Setting up User Input
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    //Main Method
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        while(!quit) {
            System.out.println("Enter your Choice:");
            choice = scan.nextInt();
            scan.nextLine();
            //Using a switch case statement in order to control selection.
            //Each case leads to new method.
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
            }
        }
        //Listing the Instruction Method
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 1 - Check what Items are on your Grocery List");
        System.out.println("\t 2 - Add Items to your Grocery List");
        System.out.println("\t 3 - Edit Items on your Grocery List");
        System.out.println("\t 4 - Remove Items to your Grocery List");
        System.out.println("\t 5 - Look for Items on your Grocery List");
        System.out.println("\t 6 - To quit the program");
    }
    //Adding Item Method with User Input.
     public static void addItem(){
         System.out.println("Enter a Grocery Item: ");
         groceryList.addGroceryItem(scan.nextLine());
     }
     //Editing Items on List with User Input.
     public static void modifyItem(){
         System.out.println("Enter Item number: ");
         int itemNo = scan.nextInt();
         scan.nextLine();
         System.out.println("Enter replacement item : ");
         String newItem = scan.nextLine();
         groceryList.editGroceryList(itemNo -1, newItem);
     }
     //Deleting Items on the List with User Input
     //User only need to enter the Item in String, they don't need to remember the Item Index.
     public static void deleteItem(){
         System.out.println("Enter Item you want deleted: ");
         int itemNo= scan.nextInt();
         scan.nextLine();
         groceryList.removeGroceryItem(itemNo-1 );
     }
     //Checking what items are on List with User Input.
     public static void searchForItem(){
         System.out.println("Enter Item: ");
         String searchItem = scan.nextLine();
         if (groceryList.findItem(searchItem) !=null){
             System.out.println("Found" +searchItem+ "in grocery List");
         }
         else {
             System.out.println(searchItem+  "is not on your grocery list");
         }
     }
}
