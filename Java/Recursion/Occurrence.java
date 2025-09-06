package Java.Recursion;

public class Occurrence {

public static int first = -1;
public static int last = -1;

public void findOccurrence(String s, int index, char element){
    if(index == s.length()){
    System.out.println(first);
    System.out.println(last);
    return;
    }
    char currentChar = s.charAt(index);
    if(currentChar == element){
        if(first == -1){
            first = index;
        }
            last = index;
    }
    
    findOccurrence(s, index + 1, element);
}

    public static void main(String[] args) {
        String s = "abababbaauauaaa";
        Occurrence obj = new Occurrence();
        obj.findOccurrence(s, 0 , 'a');
    }
    
}
