package mode.ak.fileexchange.di.files;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import mode.ak.fileexchange.ui.FilesActivity;

/**
 * - Created by Adrian on 29.12.2017.
 */
@Subcomponent
public interface FilesActivitySubcomponent extends AndroidInjector<FilesActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FilesActivity> {

    }
}
