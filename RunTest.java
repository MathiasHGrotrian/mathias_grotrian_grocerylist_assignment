public class RunTest
{
    public static void main(String[] args)
    {

        //  Array assignment

        GroceryList list = new GroceryList();

        GroceryItemOrder order = new GroceryItemOrder("cucumber", 2, 15.0);
        GroceryItemOrder order2 = new GroceryItemOrder("orange", 2, 5.0);
        GroceryItemOrder order3 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order4 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order5 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order6 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order7 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order8 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order9 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order10 = new GroceryItemOrder("test", 1, 1.0);
        GroceryItemOrder order11 = new GroceryItemOrder("test", 1, 1.0);



        list.add(order);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order10);
        //list.add(order11);

        System.out.println(list);
        System.out.println(list.getTotalCost());

        System.out.println("\n");

        //  ArrayList assignment

        System.out.println("Now with arraylist \n");

        GroceryList2 list2 = new GroceryList2();

        GroceryItemOrder newOrder = new GroceryItemOrder("Tomato", 4, 5.0);
        GroceryItemOrder newOrder2 = new GroceryItemOrder("Apple", 10, 6.0);


        list2.addOrder(newOrder);
        list2.addOrder(newOrder2);

        System.out.println(list2);
        System.out.println(list2.getTotalCost());

    }
}
