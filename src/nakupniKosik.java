public class nakupniKosik {
    public static void main(String[] args) {

        String[] products = {"Rohlik", "Chleba", "Syr", "Paprika", "Rajce", "Banan", "Houska", "Maslo", "Tvaroh"};
        int[] prices = {2, 22, 12, 8, 7, 9, 3, 30, 15};

        int totalPrice = 0;

        if (args.length > 0) {
            for (String vozik : args) {
                switch (vozik) {
                    case "0":
                        System.out.println("Rohlik");
                        totalPrice = totalPrice + 2;
                        break;
                    case "1":
                        System.out.println("Chleba");
                        totalPrice = totalPrice + 22;
                        break;
                    case "2":
                        System.out.println("Syr");
                        totalPrice = totalPrice + 12;
                        break;
                    case "3":
                        System.out.println("Paprika");
                        totalPrice = totalPrice + 8;
                        break;
                    case "4":
                        System.out.println("Rajce");
                        totalPrice = totalPrice + 7;
                        break;
                    case "5":
                        System.out.println("Banan");
                        totalPrice = totalPrice + 9;
                        break;
                    case "6":
                        System.out.println("Houska");
                        totalPrice = totalPrice + 3;
                        break;
                    case "7":
                        System.out.println("Maslo");
                        totalPrice = totalPrice + 30;
                        break;
                    case "8":
                        System.out.println("Tvaroh");
                        totalPrice = totalPrice + 15;
                        break;

                    default:
                        System.out.println("Tato polozka neni dostupna.");
                }
            }
            System.out.println(totalPrice + " Kc");
        } else {
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + " " + products[i] + " " + prices[i]);
            }
        }
    }
}

