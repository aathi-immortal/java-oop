package shop;

public class Delux_Pizza extends Base_Pizza {

    Delux_Pizza() {

        super.extra_Cheese();
        super.extra_toppings();
    }

    @Override
    public void cheese_Type(String type) {
        super.cheese_Type(type);
    }

    @Override
    public void take_Away() {
        this.total += 20;

    }

    @Override
    public void addOn_List() {
        System.out.println("1.take_away \n " +
                "2.No Need ");
    }

}
