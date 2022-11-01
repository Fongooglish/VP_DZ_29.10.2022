//класс
public class Lesson2 {
    //методы
    public static void main(String[] args) {
//        float piVal = (float) Math.PI;
//        System.out.println(piVal);
//      //  System.out.printf("My cout %d \n ", piVal);
//        double piDoub = Math.PI;
//        System.out.println(piDoub);

//        float amount = 1.00000005F;
//        float avalue = 0.00000004F;
//
//        float result = amount - avalue;
//        System.out.println(result);

//        String costForPrint = "5р";
//        System.out.println("Цена только для вас " + +costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));
        MyClass myClass = new MyClass();
        myClass.method();
    }

        public static String getCurrencyName(char symbol) {
            if (symbol == '$') {
                return " долларов";
            } else {
                return " какая-то др валюта";
            }
        }



}
