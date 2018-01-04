package mode.ak.fileexchange;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import mode.ak.fileexchange.data.AppRealm;
import mode.ak.fileexchange.di.AppModule;
import mode.ak.fileexchange.di.DaggerAppComponent;

/**
 * - Created by Adrian on 29.12.2017.
 */

public class App extends Application implements HasActivityInjector {
    @Inject DispatchingAndroidInjector<Activity> dispatchingActivityInjector;
    @Inject AppRealm                             appRealm;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build()
                .inject(this);

        appRealm.init();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
