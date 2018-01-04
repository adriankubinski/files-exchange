package mode.ak.fileexchange.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * - Created by Adrian on 29.12.2017.
 */

public class Settings extends RealmObject {
    @PrimaryKey private String key;
    private String val;

    public Settings() {
    }

    public Settings(String key, String val) {
        this.key = key;
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public String getVal() {
        return val;
    }
}
