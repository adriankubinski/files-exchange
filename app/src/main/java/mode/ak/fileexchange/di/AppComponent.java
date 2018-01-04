package mode.ak.fileexchange.di;

import dagger.Component;
import mode.ak.fileexchange.App;
import mode.ak.fileexchange.di.files.FilesActivityModule;
import mode.ak.fileexchange.di.main.MainActivityModule;

/**
 * - Created by Adrian on 29.12.2017.
 */

@Component( modules = {
        AppModule.class,
        MainActivityModule.class,
        FilesActivityModule.class
})
public interface AppComponent {
    void inject(App app);
}
