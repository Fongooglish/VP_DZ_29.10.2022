public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[] {0,1,2,3,4,5,6,7,8};
        //System.out.println(myArray[3]);
        //myArray[3] = 100;
        // System.out.println(myArray[3]);
        int x = myArray[myArray.length-1];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

            for (int i = 0; i < myArray.length/2; i++) {
                int z = myArray[i];
                myArray[i] = myArray[x];
                myArray[x] = z;
                x = x-1;

            }
        System.out.println("перевернули!");

            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
    }
}
