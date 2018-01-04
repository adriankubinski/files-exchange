package mode.ak.fileexchange.ui.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import mode.ak.fileexchange.R;
import mode.ak.fileexchange.databinding.ActivityMainBinding;

/**
 * - Created by Adrian on 29.12.2017.
 */

public class MainActivity extends AppCompatActivity implements MainContract.View {
    @Inject MainContract.Presenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(presenter);
    }
}
