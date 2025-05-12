public class Typecasting {
    public static void main(String[] args) {
        //TYPE CASTING
        // int num1 = (int)(67.643f);
        //    System.out.println(num1);
        //TYPE PROMOTION
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 4.64f;
        double d = 0.1234;
        double result = (f * b) + (i / c) + (d * s);
        System.out.println((f * b)+ " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }


}
