public class Pizza {

    public  int price;
    public boolean isVeg;
    String Bill = " ";

    private  int ExtraCheesePrice;
    private int ExtraToppings;
    private  int PaperBagPrice;

    private  boolean isCheeseAdded;
    private  boolean isToppingAdded;
    private  boolean isTakeAway;
    private int basePrice;
    private  boolean isBillGenerated;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        isBillGenerated = false;
        isCheeseAdded = false;
        isTakeAway = false;
        isToppingAdded = false;

        ExtraCheesePrice = 80;

        if(isVeg){
            price = 300;
            PaperBagPrice = 20;

            ExtraToppings = 70;
        }else{
            price = 400;

            ExtraToppings = 120;
        }
        basePrice = price;

        Bill += "Base price of the Pizza:"+basePrice+"\n";

    }
    public  void addExtraCheese(){
        if(isCheeseAdded == false ){
            this.price += ExtraCheesePrice;
            this.isCheeseAdded = true;
        }

    }
    public  void  addExtraToppings() {
        if (isToppingAdded == false) {
            this.price += ExtraToppings;
            this.isToppingAdded = true;
        }

    }

    public  void  takeAway(){
        if(isTakeAway == false) {
            this.price += PaperBagPrice;
            isTakeAway = true;
        }
    }
    public  void BillGenerated(){
        isBillGenerated = true;

        if(isCheeseAdded){
            Bill += "Extra Cheese added:" + ExtraCheesePrice+ "\n";
        }
        if(isToppingAdded){
            Bill += "Extra Toppings Added:" + ExtraToppings+ "\n";
        }
        if(isTakeAway){
            Bill += "Paper Bad Added:" + PaperBagPrice + "\n";
        }

        Bill += "Total price:" + this.price+ " \n";

        System.out.println(Bill);
    }







}
