import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        //java doesnt interprete float and double so f should be specified here
        System.out.println(area);
    }
}