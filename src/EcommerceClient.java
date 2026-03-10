public class EcommerceClient {
    public static void main(String[] args) {
        Furniture officeChair = new Chair();
        Furniture diningTable = new Table(45.5);
        Furniture livingRoomSofa = new Sofa(15.0, 3.5);

        ShippingCalculator calculator = new StandardShippingCalculator();

        System.out.println("--- E-Commerce Shipping Costs ---");
        System.out.println("Office Chair Shipping: $" + officeChair.accept(calculator));
        System.out.println("Dining Table Shipping: $" + diningTable.accept(calculator));
        System.out.println("Living Room Sofa Shipping: $" + livingRoomSofa.accept(calculator));
    }
}