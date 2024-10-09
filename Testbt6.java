package CHUONG2;

public class Testbt6 {
    public static void main(String[] args) {
        BT6 company = new BT6("Ichid","DA NANG",80000,10,90);
        System.out.println(company.getAddress());
        System.out.println(company.getName());
        System.out.println(company.getCost());
        System.out.println(company.getIncome());
        System.out.println(company.getBenefit());

    }
}
