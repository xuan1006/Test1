public class Test1 {
    public static void main(String[] args) {
        for(int x=0; x<15; x++) {
            for (int y = 0; y < 30; y++) {
                if ((x < 5 && (y > 14 && y < 30)) || ((x > 9 && x < 15) && (y > 14 && y < 30))) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
    }
}