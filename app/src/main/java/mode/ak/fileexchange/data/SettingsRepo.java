package mode.ak.fileexchange.data;

import javax.inject.Inject;

import io.realm.Realm;

/**
 * - Created by Adrian on 29.12.2017.
 */

public class SettingsRepo {
    private final Realm realm;
    private final static String SERV_ADDR = "server_address";

    @Inject
    public SettingsRepo(Realm realm) {
        this.realm = realm;
    }

    public void put(String key, String val) {
        try (Realm realm = this.realm) {
            realm.executeTransaction(realm1 -> realm1.insertOrUpdate(new Settings(key, val)));
        }
    }

    public String getServerAddress() {
        try (Realm realm = this.realm){
            Settings first = realm.where(Settings.class).equalTo("key", SERV_ADDR).findFirst();
            return first == null ? "" : first.getVal();
        }
    }
}
