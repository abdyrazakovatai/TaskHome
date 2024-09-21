import java.util.*;

public class Main {
    public static void main(String[] args) {
//        phoneNumber.put("Atai","+996702029560");
//        phoneNumber.put("Adilet","+996700200500");
//        phoneNumber.put("Askat"," +996999999999");
//        phoneNumber.put("Babakhan","+996777777777");
//        phoneNumber.put("Nuradyl","+996990099990");
        Phone phone = new Phone();
        StudentGrade studentGrade = new StudentGrade();
//        ProductTovar productManage = new ProductTovar();
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//
//            System.out.println("""
//                    1 -> Add contact
//                    2 -> Delete contact
//                    3 -> Get All Contact
//                    4 -> Search Contact
//                    5 -> Exit
//                    """);
//
//            switch (scanner.nextInt()) {
//                case 1 -> {
//                    phone.addContact();
//                }
//                case 2 -> {
//                    phone.deleteContact();
//                }
//                case 3 -> {
//                    System.out.println(phone.getAllContact());
//                }
//                case 4 -> {
//                    phone.searchContact();
//                }
//                case 5 -> {
//                    return;
//                }
//                default -> System.out.println("Invalid command");
//            }
//        studentGrade.gradeMethod();

//        productManage.choice(scanner);
        Map<String,Double> map = new HashMap<>();

        map.put("Banan", 188.2);
        map.put("Milk", 75.0);
        map.put("Bread", 25.0);
        map.put("Cheese", 214.3);
        map.put("Apple", 103.7);
        map.put("Yogurt", 120.0);

        List<String> productList = new ArrayList<>(List.of("Banan","Milk","Bread","Cheese","Apple","Yogurt"));


        ProductSum productSum = new ProductSum();
        double sum = productSum.priceMethod(productList,map);

        System.out.println("Summa" + sum);
    }
}
//}
