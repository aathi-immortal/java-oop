package shop;

public class Delux_Pizza extends Base_Pizza {

    float total;

    Delux_Pizza() {
        this.total = 0.00f;
        super.extra_Cheese();
        super.extra_toppings();

        this.total += super.total;
    }

    @Override
    public void cheese_Type(String type) {
        super.cheese_Type(type);
        this.total += super.total;
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
