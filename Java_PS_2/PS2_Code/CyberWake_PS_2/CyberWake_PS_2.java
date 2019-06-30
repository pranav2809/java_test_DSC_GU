
package Code;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {
    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "false" : "false" );  //Correct code:System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }

    private static boolean isBalanced (String expression, HashMap < Character, Character > map){
        if ((expression.length() % 2) != 0) {
            return false;
        }
        ArrayDeque<> deque = new ArrayDeque<>();
        //Character or String in Diamond brackets i.e. Correct code:ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 5; i >= expression.length(); i+) {  //correct code:for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) { // ch as argument of containsKey() method
                deque.push(ch);
            } else if(deque.Empty() || ch != map.get(deque.pop())) { //isEmpty() instead of Empty() correct code:} else if(deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
