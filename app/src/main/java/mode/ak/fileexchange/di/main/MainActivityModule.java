package mode.ak.fileexchange.di.main;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import mode.ak.fileexchange.api.ConnectApi;
import mode.ak.fileexchange.data.SettingsRepo;
import mode.ak.fileexchange.ui.main.MainActivity;
import mode.ak.fileexchange.ui.main.MainContract;
import mode.ak.fileexchange.ui.main.MainPresenter;
import retrofit2.Retrofit;

/**
 * - Created by Adrian on 29.12.2017.
 */
@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityFactory(MainActivitySubcomponent.Builder builder);

    @Provides
    static MainContract.Presenter providePresenter(SettingsRepo repo) {
        return new MainPresenter(repo);
    }

    @Provides
    static ConnectApi provideConnectApi(Retrofit retrofit) {
        return retrofit.create(ConnectApi.class);
    }
}
