import java.util.ArrayList;

public class GroceryList2
{
    private ArrayList<GroceryItemOrder> newOrders;

    public GroceryList2()
    {
        this.newOrders = new ArrayList<>();
    }

    public void addOrder(GroceryItemOrder newOrder)
    {
        this.newOrders.add(newOrder);
    }
    
    public double getTotalCost()
    {
        double cost = 0.0;

        for (GroceryItemOrder newOrder : newOrders)
        {
            cost = newOrder.getCost() + cost;
        }

        System.out.println("Total cost of all orders: ");

        return cost;
    }


    public ArrayList<GroceryItemOrder> getGroceryItemOrder()
    {
        return newOrders;
    }

    @Override
    public String toString()
    {
        return "GroceryList2{" +
                "newOrders=" + newOrders +
                '}';
    }
}
