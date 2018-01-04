package mode.ak.fileexchange.data;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * - Created by Adrian on 29.12.2017.
 */

public class AppRealm {
    private final String LOG_TAG = this.getClass().getSimpleName();
    private Context context;

    @Inject
    public AppRealm(Context context) {
        this.context = context;
        Log.e(LOG_TAG, "AppRealm: ");
    }

    public void init() {
        Realm.init(context);
        Realm.setDefaultConfiguration(prepareConfiguration());
    }

    private RealmConfiguration prepareConfiguration() {
        return new RealmConfiguration.Builder()
                .encryptionKey("<Aq9},?U5r##RJGah@5^F$[?&\"^MFz.w8&jJ^W%!G<\\6B'W8T\"/TQh8?'x[spK}p".getBytes())
                .deleteRealmIfMigrationNeeded()
                .build();
    }
}
