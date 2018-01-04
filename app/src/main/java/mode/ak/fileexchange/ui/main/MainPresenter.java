package mode.ak.fileexchange.ui.main;

import android.util.Log;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;
import mode.ak.fileexchange.api.ConnectApi;
import mode.ak.fileexchange.data.SettingsRepo;

/**
 * - Created by Adrian on 29.12.2017.
 */
public class MainPresenter implements MainContract.Presenter {
    private final SettingsRepo repo;
    private ConnectApi api;
    private String LOG_TAG = this.getClass().getCanonicalName();

    @Inject
    public MainPresenter(SettingsRepo repo, ConnectApi api) {
        this.repo = repo;
        this.api = api;
    }

    @Override
    public void onConnectClick(String url, String token) {
        api.connect(url)
                .subscribeOn(Schedulers.io())
                .subscribe(connectResponse -> Log.e(LOG_TAG, "onConnectClick: " + connectResponse.toString()), Throwable::printStackTrace);
    }
}
