package mode.ak.fileexchange.ui.main;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * - Created by Adrian on 29.12.2017.
 */
public class MainViewBinding {

    @BindingAdapter(value = {"presenter", "url"}, requireAll = true)

//    @BindingAdapter("onDoneInSoftKeyboard")
    public static void setOnDoneListener(TextView view, MainContract.Presenter presenter, String url) {
        view.setOnEditorActionListener((v, actionId, event) -> {
            presenter.onConnectClick(url, v.getText().toString());
            return false;
        });
    }
}
