package com.infosys.java811.inheritance;

public class Pizza {
    int price;
    String size;
    int quantity;

    Pizza(String size, int quantity){
        this.size = size;
        this.quantity = quantity;

        if(this.size.equals("Regular")){
            this.price = 100;
        }else if(this.size.equals("Medium")){
            this.price = 250;
        }else {
            this.price = 390;
        }
    }

}
class Foodie{
    public int foodieId;
    public String foodieName;
    public String city;
    public long mobileNo;
    public double totalPrice;

    Foodie(int foodieId, String foodieName, String city, long mobileNo){
        this.foodieId = foodieId;
        this.foodieName = foodieName;
        this.city = city;
        this.mobileNo = mobileNo;
    }

    public void calculateTotalPrice(Pizza[] pizzasList){
        for(Pizza pizza : pizzasList){
            totalPrice += pizza.price * pizza.quantity;
        }
    }

    public int getFoodieId() {
        return foodieId;
    }

    public void setFoodieId(int foodieId) {
        this.foodieId = foodieId;
    }

    public String getFoodieName() {
        return foodieName;
    }

    public void setFoodieName(String foodieName) {
        this.foodieName = foodieName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

class SuperFoodie extends Foodie{
    public double discount;
    SuperFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount){
        super(foodieId, foodieName, city, mobileNo);
        this.discount = discount;
    }

    public void calculateTotalPriceWithDiscount(Pizza[] pizzaList){
        this.calculateTotalPrice(pizzaList);
        this.totalPrice -= totalPrice * (discount/100);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

class UltraFoodie extends SuperFoodie{
    public int rewardPoints;

    UltraFoodie(int foodieId, String foodieName, String city, long mobileNo, double discount){
        super(foodieId, foodieName, city, mobileNo, discount);
    }

    public void calculateTotalPriceWithRewardPoints(Pizza[] pizzaList){
        this.calculateTotalPriceWithDiscount(pizzaList);
        rewardPoints = (int)(totalPrice/10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}

class Testers{
    public static void main(String[] args) {
        Pizza[] pizzaList1 = {new Pizza("Regular", 1), new Pizza("Medium", 2)};

        Foodie foodie = new Foodie(1, "Jacob", "NY", 321433632);
        foodie.calculateTotalPrice(pizzaList1);
        System.out.println("Total cost for Foodie " +foodie.getFoodieName() +" "+foodie.getTotalPrice());

        SuperFoodie superFoodie = new SuperFoodie(2, "Queenie", "Delhi", 34567890, 5);
        superFoodie.calculateTotalPriceWithDiscount(pizzaList1);
        System.out.println("Total cost for SuperFoodie " +superFoodie.getFoodieName()+": "+superFoodie.getTotalPrice());

        UltraFoodie ultraFoodie = new UltraFoodie(3, "Eddie", "London", 234567890, 9 );
        ultraFoodie.calculateTotalPriceWithRewardPoints(pizzaList1);
        System.out.println("Total cost for UltraFoodie "+ultraFoodie.getFoodieName()+": "+ultraFoodie.getTotalPrice()+" with reward points: "+ultraFoodie.getRewardPoints());



    }
}