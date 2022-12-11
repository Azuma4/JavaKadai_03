import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("山田", "沖縄県那覇市出身。39歳です。");
        userMap.put("佐藤", "埼玉県岩槻市出身。33歳です。");
        userMap.put("田中", "東京都江東区出身。38歳です。");
        userMap.put("窪田", "神奈川県横浜市出身。34歳です。");


        try {
            if (null != userMap.get("やまだ")) {
                System.out.println(userMap.get("やまだ"));
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("要素が見つかりません");
        }


    }
}
