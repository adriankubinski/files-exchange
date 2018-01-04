package mode.ak.fileexchange.di;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import mode.ak.fileexchange.data.AppRealm;
import mode.ak.fileexchange.data.SettingsRepo;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * - Created by Adrian on 29.12.2017.
 */

@Module()
public class AppModule {
    private final Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    String provideDupa() {
        return "dupa";
    }

    @Provides
    Context provideApplicationContext() {
        return context;
    }

    @Provides
    AppRealm provideAppRealm(Context context) {
        return new AppRealm(context);
    }

    @Provides
    Realm provideRealm() {
        return Realm.getDefaultInstance();
    }

    @Provides
    SettingsRepo provideSettingsRepo(Realm realm) {
        return new SettingsRepo(realm);
    }

    @Provides
    Retrofit provideRetrofit(SettingsRepo repo) {
        String serverAddress = repo.getServerAddress();
        Log.e("DDD", "provideRetrofit: " +  serverAddress );
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://" + (!serverAddress.isEmpty() ? serverAddress : "localhost"))
                .build();
    }
}
