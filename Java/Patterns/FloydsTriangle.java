public class FloydsTriangle {
    public static void main(String[] args) {
        int a = 4;
        int count = 1;
        for(int i = 1; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
