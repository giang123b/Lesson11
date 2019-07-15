import javax.sound.midi.Soundbank;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

enum Numbers {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}

public class TestEnumMap {
    public static void main(String[] args) {
        Map<Numbers, String> map = new EnumMap<Numbers, String>(Numbers.class);
        map.put(Numbers.ONE, "1");
        map.put(Numbers.TWO, "2");
        map.put(Numbers.THREE, "3");
        map.put(Numbers.FOUR, "4");
        map.put(Numbers.FIVE, "5");
        map.put(Numbers.SIX, "6");

        Set<Map.Entry<Numbers, String>> entrySet = map.entrySet();

        for(Map.Entry<Numbers, String> entry: entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
