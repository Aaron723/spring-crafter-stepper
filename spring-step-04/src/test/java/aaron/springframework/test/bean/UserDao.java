package aaron.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ziqi Wang
 * @date 12/4/22 14:33
 */

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001", "hutool");
        hashMap.put("1002", "aaron");
        hashMap.put("1003", "cglib");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }

}
