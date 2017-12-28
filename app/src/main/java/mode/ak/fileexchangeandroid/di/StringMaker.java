package mode.ak.fileexchangeandroid.di;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Adrian on 28.12.2017.
 */

class StringMaker {
    @Inject String dupa;
    void show() {
        Log.e("dDDD", "show: " + dupa );
    }
}
