package mode.ak.fileexchangeandroid.di;

import dagger.Component;
import mode.ak.fileexchangeandroid.App;

/**
 * Created by Adrian on 28.12.2017.
 */

@Component( modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
