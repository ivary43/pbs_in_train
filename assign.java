import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class assign {

    public static void main(String[] args) {
        HashMap<String, HashSet<String>> hMap = new HashMap<>();
        
        HashSet<String> options_A = new HashSet<>();
        options_A.add("GoodMorning");
        options_A.add("Shubhodaya");
        options_A.add("Shubhohday");
        options_A.add("Bonjour");
        hMap.put("GoodMorning", options_A);

        HashSet<String> options_B = new HashSet<>();
        options_B.add("good Evening");
        options_B.add("Shubha sange");
        options_B.add("susandhya");
        options_B.add("Bonsoir");
        hMap.put("GoodEvening", options_B);

        Scanner sc = new Scanner(System.in);

        while(true) {

            String input = sc.nextLine();
            String key = input.toLowerCase();

            if(input.equals("exit")) {
                break;
            }


            if(hMap.containsKey(key)) {
                HashSet<String> temp_res = hMap.get(key);
                temp_res.forEach(k -> System.out.print(k+", "));
                System.out.println();
            } else {
                System.out.println("Want to add this key to query base ?");
                input = sc.nextLine();
                input = input.toLowerCase();

                if(input.equals("y")) {
                    input = sc.nextLine();
                    while(!input.equals("")) {
                        hMap.get(key).add(input.toLowerCase());
                    }
                }

            }
        }

    }
}