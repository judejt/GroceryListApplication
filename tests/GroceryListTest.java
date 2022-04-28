import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
class GroceryListTest {
    ArrayList <String> testCase_0 = new GroceryList();
    @Test
    //testing that new arraylist is empty.
    void newGroceryListShouldBeEmpty() {
        assertNull(testCase_0);
    }
    @Test
    //Testing Print Method.
    void printIndexUnderOneShouldReturnIllegalArgumentException() {
        var testCase_0 = new GroceryList();
        assertThrows(IllegalArgumentException.class,
                testCase_0::printGroceryList);
    }
}
