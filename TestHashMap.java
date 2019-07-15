import java.util.HashMap;

public class TestHashMap {
    public static HashMap<String, String> list = new HashMap<String, String>();

    public static void main(String[] args) {
        list.put("Mot", "Giang");
        list.put("Hai", "Nam");
        list.put("Ba", "Ha");

        System.out.println("==========================");
        showList();

        System.out.println("Delete the 3rd member");
        list.remove(3);

    }

    private static void showList() {
        for (String integer : list.keySet()) {
            System.out.println(integer);
        }

    }
}
