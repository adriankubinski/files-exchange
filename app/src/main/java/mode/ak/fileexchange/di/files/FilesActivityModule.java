package mode.ak.fileexchange.di.files;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import mode.ak.fileexchange.ui.FilesActivity;

/**
 * - Created by Adrian on 29.12.2017.
 */
@Module(subcomponents = FilesActivitySubcomponent.class)
public abstract class FilesActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(FilesActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityFactory(FilesActivitySubcomponent.Builder builder);
}
