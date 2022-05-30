package ClassAlgorithmMonTue;

//You have to write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed(W<->E or S<->N
//side by side).
// The Haskell version takes a list of directions with data Direction=North|East|West|South.The Clojure version returns nil when the path is reduced to nothing. java
import java.util.*;

public class DirReduction {
    public static void main(String[] args) {
    String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(arr)));
    }

    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            String lengthElements = stack.size() > 0 ? stack.lastElement() : null;
            switch (arr[i]){
                case "NORTH" :
                    if ("SOUTH".equals(lengthElements)){
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                    break;
                case "SOUTH":
                    if ("NORTH".equals(lengthElements)){
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                    break;
                case "EAST":
                    if ("WEST".equals(lengthElements)){
                        stack.pop();
                    } else{
                        stack.push(arr[i]);
                    }
                    break;
                case "WEST":
                    if ("EAST".equals(lengthElements)){
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                    break;
            }
        }
        return stack.toArray(String[]::new);
    }
}





