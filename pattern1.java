public class pattern1 {
    public static void main(String[] args) {
        char alf;
        alf='A';
        for (int col = 0; col <6; col++) {

            for (int row = 0; row <= col; row++) {
                System.out.print(alf);
                alf=(char)(alf+1);
            }
            System.out.println();
        }
    }

}
