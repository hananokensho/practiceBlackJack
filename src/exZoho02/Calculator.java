package exZoho02;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    static boolean repeatFlag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("[電卓] >");
            String str = sc.nextLine();
            //空Enterが入力されると終了
            if (str.length() == 0) {
                System.out.println("終了します");
                break;
            }
            List<String> inputNumber = new ArrayList<>(Arrays.asList(str.split(" ")));
            List<String> firstFormula = new ArrayList<>(Arrays.asList(str.split(" ")));
//            if (inputNumber.size() > 1 && inputNumber.size() < 5) { // 2はありえないので3~4のみで良い
            if (inputNumber.size() == 3) {
                show(firstFormula, simpleCalc(inputNumber));
            }
            // + - 以外の演算を終わらせる
            while (!repeatFlag) {
                multipleCalc(inputNumber);
            }
            // + - だけの演算を要素数が3以下になるまで繰り返す
            while (inputNumber.size() > 4) {
                multipleSimpleCalc(inputNumber);
            }

            show(firstFormula, simpleCalc(inputNumber));
        }
        sc.close();
    }

    //要素が5以上の場合の + - 以外を先に計算行うメソッド
    public static List<String> multipleCalc(List<String> inputNumber) {
        for (int i = 0; i < inputNumber.size(); i++) {
            if (inputNumber.get(i).equals("r")) {
                int a = Integer.parseInt(inputNumber.get(i - 1));
                inputNumber.set(i - 1, null);
                String calcTotal = String.valueOf(calc(a));
                inputNumber.set(i, calcTotal);
                inputNumber.removeIf(Objects::isNull);
                return inputNumber;
            }
//            if (inputNumber.get(i).equals(decision(inputNumber.get(i)))) {
            if (!decision(inputNumber.get(i))) {
                if (!inputNumber.get(i).equals("+") && !inputNumber.get(i).equals("-")) {
                    int a = Integer.parseInt(inputNumber.get(i - 1));
                    int b = Integer.parseInt(inputNumber.get(i + 1));
                    String calcTotal = Integer.toString(calc(a, b, inputNumber.get(i)));
                    inputNumber.set(i, calcTotal);
                    inputNumber.set(i - 1, null);
                    inputNumber.set(i + 1, null);
                    inputNumber.removeIf(Objects::isNull);
                    return inputNumber;
                }
            }
        }
        repeatFlag = true;
        return inputNumber;
    }

    //要素が5以上の場合の + -を先に計算行うメソッド
    public static List<String> multipleSimpleCalc(List<String> inputNumber) {
        for (int i = 0; i < inputNumber.size(); i++) {
//            if (inputNumber.get(i).equals(decision(inputNumber.get(i)))) {
            if (!decision(inputNumber.get(i))) {
                int a = Integer.parseInt(inputNumber.get(i - 1));
                int b = Integer.parseInt(inputNumber.get(i + 1));
                String calcTotal = Integer.toString(calc(a, b, inputNumber.get(i)));
                inputNumber.set(i, calcTotal);
                inputNumber.set(i - 1, null);
                inputNumber.set(i + 1, null);
                inputNumber.removeIf(Objects::isNull);
            }
        }
        return inputNumber;
    }

    // 数字かそれ以外かの判定
    public static boolean decision(String decision) {
        char[] decisionCharacter = decision.toCharArray();
        return Character.isDigit(decisionCharacter[0]);
    }

    // 演算子を判定
//    public static String decision(String decision) {
//
//        switch (decision) {
//            case "*":
//                return "*";
//            case "%":
//                return "%";
//            case "/":
//                return "/";
//            case "^":
//                return "^";
//            case "+":
//                return "+";
//            case "-":
//                return "-";
//        }
//        return "+";
//    }

    // * % ^ / の計算をするメソッド
    public static int calc(int a, int b, String symbol) {
        if (symbol.equals("*")) {
            return a * b;
        }
        if (symbol.equals("%")) {
            return a % b;
        }
        if (symbol.equals("^")) {
            return (int) (Math.pow(a, b));
        }
        if (symbol.equals("/")) {
            return a / b;
        }
        if (symbol.equals("+")) {
            return a + b;
        }
        if (symbol.equals("-")) {
            return a - b;
        }
        return 0;
    }

    // ルートの計算メソッド
    public static double calc(int a) {
        return (Math.sqrt(a));
    }

    //プリントメソッド
    public static void show(List<String> firstFormula, double answer) {
        DecimalFormat format = new DecimalFormat("0.######");
        for (String s : firstFormula) {
            System.out.print(s + " ");
        }
        System.out.println("= " + format.format(answer));
    }

    //要素が5以下の単純な計算メソッド
    public static double simpleCalc(List<String> inputNumber) {
        double a = Double.parseDouble(inputNumber.get(0));
        if (inputNumber.get(1).equals("r")) {
            return (Math.sqrt(a));
        }
        double b = Double.parseDouble(inputNumber.get(2));
        if (inputNumber.get(1).equals("+")) {
            return a + b;
        }
        if (inputNumber.get(1).equals("-")) {
            return a - b;
        }
        if (inputNumber.get(1).equals("*")) {
            return a * b;
        }
        if (inputNumber.get(1).equals("%")) {
            return a % b;
        }
        if (inputNumber.get(1).equals("/")) {
            return a / b;
        }
        if (inputNumber.get(1).equals("^")) {
            return (Math.pow(a, b));
        }
        return 0;
    }
}