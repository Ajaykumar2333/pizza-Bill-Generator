public class Main {
    public static void main(String[] args) {
        Pizza obj = new Pizza(true);
        obj.addExtraCheese();
        obj.addExtraToppings();
        obj.takeAway();
        obj.BillGenerated();


        Deluxe obj2 = new Deluxe(false);

         obj2.BillGenerated();

    }
}