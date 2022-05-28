import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split("");
        String[] q = scanner.nextLine().split("");
        Map<String, String> second = new LinkedHashMap<>();

        for (int i = 0; i < q.length; i++) {
            if (Objects.equals(q[i], first[i])) {
                second.put(q[i] + i, "correct");
                first[i] = null;
            } else {
                second.put(q[i] + i, "absent");
            }
        }
        for (String key : second.keySet()) {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != null && Objects.equals(key.substring(0, 1), first[i])) {
                    second.put(key, "present");
                    first[i] = null;
                    break;
                }
            }
        }
        for(String value : second.values()) {
            System.out.println(value);
        }
    }
}