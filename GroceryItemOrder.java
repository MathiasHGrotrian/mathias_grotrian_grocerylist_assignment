public class GroceryItemOrder
{
    /*
    The GroceryItemOrder class should have an item name, a quantity, and a price per unit,
     and it should have a constructor setting all these values, and one only setting the
     name(the default quantity should be one). It should have a getCost-method returning the
    total cost of the item in its given quantity, and a toString-method returning a String with
     the name, quantity, and total cost. All fields should have getter and setter methods.
     */

    private String name;
    private int quantity;
    private double unitPrice;

    //  Constructor
    public GroceryItemOrder(String name, int quantity, double unitPrice)
    {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //  Methods
    public double getCost()
    {
        return unitPrice * quantity;
    }

    // ToString
    @Override
    public String toString()
    {
        return "\n GroceryItemOrder{" +
                "item name:'" + name + '\'' +
                ", item quantity:" + quantity +
                ", unit price:" + unitPrice +
                ", total cost:" + unitPrice * quantity +
                '}' + "\n";
    }

    //  Getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
}
