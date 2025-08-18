package Java.Recursion;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char helper, char dest){
        if(n == 1){
            System.out.println("Transfer "+ n +" from " + source + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, helper);
        System.out.println("Transfer "+ n +" from " + source + " to " + dest);
        towerOfHanoi(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
      towerOfHanoi(3,'S','H','D');
    }
}
