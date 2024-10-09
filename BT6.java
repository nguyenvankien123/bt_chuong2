package CHUONG2;

 public class BT6 {
    String name;

    String address;
    double income;
    double benefit;
    double cost;
    BT6(String name,  String address, double income, double benefit, double cost) {
        this.name = name;

        this.address = address;
        this.income = income;
        this.benefit = benefit;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public double getIncome() {
       return income;
    }
    public double getBenefit() {
       return benefit;
    }
    public double getCost() {
        return cost;
    }

}
