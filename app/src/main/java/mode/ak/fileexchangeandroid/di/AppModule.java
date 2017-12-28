package mode.ak.fileexchangeandroid.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import mode.ak.fileexchangeandroid.ui.MainActivity;

/**
 * Created by Adrian on 28.12.2017.
 */

@Module
abstract class AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = AppModule.class)
    abstract MainActivity contributeMainActivityInjector();

}
