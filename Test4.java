// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test4 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                if(i == 4 || j == 4 || (i*j)%4==0){
                    System.out.print("          |");
                    continue;
                }
                System.out.printf("%d * %d = %02d",i,j,i*j);
                System.out.print("|");
            }
            System.out.println( );
        }
    }
}