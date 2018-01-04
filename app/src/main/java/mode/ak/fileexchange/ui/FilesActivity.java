package mode.ak.fileexchange.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import mode.ak.fileexchange.data.SettingsRepo;

/**
 *  Created by Adrian on 29.12.2017.
 */

public class FilesActivity extends AppCompatActivity {
    @Inject
    SettingsRepo repo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
