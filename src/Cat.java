
public class Cat {
    static int a = 520;
    public static void main(String[]args){
       if (a < 500) {
           Meau(a);
       }
       else {
           Sleep();
       }
    }
    public static void Meau(int a){
        if (a == 10) {
            System.out.println("МЯУ!");
        }
        else if (500 > a && a > 100) {
                System.out.printf("МУР!");
            }
        }
        public static void Sleep() {
            System.out.println("Кот устал!!!");
    }

}
