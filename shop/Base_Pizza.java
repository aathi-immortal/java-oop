package shop;

public class Base_Pizza extends Pizza {

    Base_Pizza() {
        this.total = 0.00f;
    }

    @Override
    public void cheese_Type(String type) {
        if (type.equals("Veg")) {
            this.total += 300;
        } else {
            this.total += 400;
        }
    }

    @Override
    public void extra_Cheese() {
        this.total += 100;
    }

    @Override
    public void extra_toppings() {
        this.extra_Cheese();
    }

    @Override
    public void take_Away() {
        this.total += 20;
    }

    @Override
    public void addOn_List() {
        System.out.println("1.Extra Cheese \n" +
                "2. Extra Topping \n" +
                "3.take_away \n" +
                "4.No Need");
    }

    @Override
    public void pizza_Type_List() {
        System.out.println("1.veg pizza \n" +
                "2.Non Veg pizza \n");

    }

}
