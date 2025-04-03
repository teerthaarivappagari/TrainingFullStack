public class TypePromotionExample {
    public static void main(String[] args) {
        int intValue = 10;
        float floatValue = 5.5f;
        double doubleValue = 20.25;
        char charValue = 'A'; 
        double result1 = intValue + floatValue;
        double result2 = intValue + doubleValue;
        int result3 = intValue + charValue;
        double result4 = floatValue + doubleValue + charValue;
        System.out.println("int + float = " + result1);
        System.out.println("int + double = " + result2);
        System.out.println("int + char (ASCII value of 'A') = " + result3);
        System.out.println("float + double + char = " + result4);
    }
}
