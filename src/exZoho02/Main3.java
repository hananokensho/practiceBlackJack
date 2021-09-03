package exZoho02;
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        while (flag == false) {
            System.out.print("[電卓] >");
            String str = sc.nextLine();
            if (str.length() == 0) {
                flag = true;
                System.out.println("終了します");
                break;
            }
            String[] array = str.split(" ");
            calc(array);
//            if (array.length >= 1) {
//                int a = Integer.parseInt(array[0]);
//                if (array[1].equals("r")) {
//                    System.out.println("r" + a + " " + "=" + " " + (Math.sqrt(a)));
//                } else {
//                    int b = Integer.parseInt(array[2]);
//                    if (array[1].equals("+")) {
//                        System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + (a + b));
//                    }
//                    if (array[1].equals("-")) {
//                        System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + (a - b));
//                    }
//                    if (array[1].equals("*")) {
//                        System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + (a * b));
//                    }
//                    if (array[1].equals("%")) {
//                        System.out.println(a + " " + "%" + " " + b + " " + "=" + " " + (a % b));
//                    }
//                    if (array[1].equals("/")) {
//                        System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + (a / b));
//                    }
//                    if (array[1].equals("^")) {
//                        System.out.println(a + " " + "^" + " " + b + " " + "=" + " " + (Math.pow(a, b)));
//                    }
//                }
//            }
            if (array.length >= 5) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals("*")) {
                        int a = Integer.parseInt(array[i - 1]);
                        int b = Integer.parseInt(array[i + 1]);
                        array[i] = Integer.toString(calc(a, b, array[i]));
                        array[i - 1] = null;
                        array[i + 1] = null;
//                        List<String> list = Arrays.asList(array);
                        List<String> list = new ArrayList<String>(Arrays.asList(array));
                        for(String s : list){
                            System.out.print(s);
                        }
                        String[] array2 = (String[]) list.toArray(new String[list.size()]);

//                        list.removeAll(Collections.singleton(null));
//                        String[] array2 = list.toArray(new String[list.size()]);
                        calc(array2);
                    }
                    if (array[i].equals("%")) {
                        deque.push(array[i - 1]);
                        deque.push(array[i]);
                        deque.push(array[i + 1]);
                    }
                }
            }
        }
    }
        public static int calc(int a, int b, String symbol){
            if (symbol.equals("*")) {
                return a * b;
            }if(symbol.equals("%")){
                return a % b;
            }if(symbol.equals("^")){
                return (int)(Math.pow(a, b));
            }if(symbol.equals(".")){
                return a / b;
            }else{
                return 0;
            }

        }
        public static void calc(String [] array){
            if (array.length >= 1) {
                int a = Integer.parseInt(array[0]);
                if (array[1].equals("r")) {
                    System.out.println("r" + a + " " + "=" + " " + (Math.sqrt(a)));
                } else {
                    int b = Integer.parseInt(array[2]);
                    if (array[1].equals("+")) {
                        System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + (a + b));
                    }
                    if (array[1].equals("-")) {
                        System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + (a - b));
                    }
                    if (array[1].equals("*")) {
                        System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + (a * b));
                    }
                    if (array[1].equals("%")) {
                        System.out.println(a + " " + "%" + " " + b + " " + "=" + " " + (a % b));
                    }
                    if (array[1].equals("/")) {
                        System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + (a / b));
                    }
                    if (array[1].equals("^")) {
                        System.out.println(a + " " + "^" + " " + b + " " + "=" + " " + (Math.pow(a, b)));
                    }
                }
            }
        }


}


