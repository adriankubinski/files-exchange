package mode.ak.fileexchange.di.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import mode.ak.fileexchange.ui.main.MainActivity;

/**
 * - Created by Adrian on 29.12.2017.
 */
@Subcomponent
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
