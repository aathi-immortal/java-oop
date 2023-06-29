package shop;

public abstract class Pizza {
    float total;
    abstract void  cheese_Type(String type);

    abstract void  extra_Cheese();

    abstract void  extra_toppings();

    abstract void  take_Away();

    abstract void  addOn_List();

    abstract void  pizza_Type_List();
}
