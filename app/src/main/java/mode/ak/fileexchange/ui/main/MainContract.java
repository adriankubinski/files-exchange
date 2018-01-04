package mode.ak.fileexchange.ui.main;

/**
 * - Created by Adrian on 29.12.2017.
 */
public interface MainContract {
    interface View {
    }

    interface Presenter {
        void onConnectClick(String url, String token);
    }
}
