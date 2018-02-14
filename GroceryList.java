import java.util.Arrays;

public class GroceryList
{

    /*
    The GroceryList class should use an array to store the grocery item orders. Assume that a grocery list will
    have no more than 10 item orders. The GroceryList class should have an add-method that will add a given item
    order to the list if the list has fewer than 10 items, and a getTotalCost-method that will return the total
    sum cost of all grocery item orders in this list. It should also have a toString-method.
    */

    private GroceryItemOrder[] orders;
    private int counter;

    public GroceryList()
    {
        this.orders = new GroceryItemOrder[10];
    }

    public void add(GroceryItemOrder item)
    {
        this.orders [counter] = item;
        counter++;

    }

    public double getTotalCost()
    {
        double cost = 0.0;

        for (int i = 0; i < this.counter; i++)
        {
            cost = orders[i].getCost() + cost;
        }

        System.out.println("Total cost of all items in grocery list: ");

        return cost;
    }

    public int getCounter()
    {
        return counter;
    }

    @Override
    public String toString()
    {
        return "GroceryList{" +
                "orders=" + Arrays.toString(orders) +
                ", counter=" + counter +
                '}';
    }
}
