import java.util.List;
import java.util.Map;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> stations = List.of("Shibuya", "Ebisu", "Meguro", "Gotanda");


//        コメントアウト
//        System.out.println("eが含まれる駅名");
//        List<String> result = stations.stream().filter(station -> station.contains("e")).toList();
//        System.out.println(result);

        System.out.println("aが含まれる駅名");
        stations.stream().filter(station -> station.contains("a")).forEach(System.out::println);

//        System.out.println("大文字に並び替え");
//        stations.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}