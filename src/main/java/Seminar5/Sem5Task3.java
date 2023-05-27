package Seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Написать программу, определяющую правильность расстановки скобок в выражении
Ex1: a+(d*3) - true
Ex2: [a+(1*3) - false
Ex3: [6+(3*3)] - true
Ex4: {a}[+]{(d*3)} - true
Ex5: <{a}+{(d*3)}> - true
Ex6: {a+]}{(d*3)} - false
Ex7: ([)] - false
 */
public class Sem5Task3 {

    static boolean brackets(String a) {

        Map<Character, Character> db = new HashMap<>();
        db.put(')', '(');
        db.put('}', '{');
        db.put('>', '<');
        db.put('[', ']');
        Stack<Character> MyStack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (db.containsValue(a.charAt(i))) {
                MyStack.push(a.charAt(i));
            }
            if (db.containsKey(a.charAt(i))) {
                if (MyStack.empty() || MyStack.pop() != db.get(a.charAt(i))) {
                    return false;
                }
            }
        }
        return MyStack.empty();
    }

    public static void main(String[] args) {
        System.out.println(brackets("a+(d*3)"));
        System.out.println(brackets("[a+(1*3)"));
        System.out.println(brackets("[6+(3*3)]"));
        System.out.println(brackets("{a}[+]{(d*3)}"));
        System.out.println(brackets("<{a}+{(d*3)}>"));
        System.out.println(brackets("{a+]}{(d*3)}"));
    }
}
