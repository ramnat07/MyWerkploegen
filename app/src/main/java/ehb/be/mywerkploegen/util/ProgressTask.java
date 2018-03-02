package ehb.be.mywerkploegen.util;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

/**
 * Created by mobapp07 on 2/03/2018.
 */

public class ProgressTask extends AsyncTask<Integer, Integer, Void> {

    private WeakReference<TextView> resultaat1;

    public ProgressTask(TextView resultaat1) {
            this.resultaat1 = new WeakReference<TextView>(resultaat1);
    }

    @Override
    protected Void doInBackground(Integer... speed) {

        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(speed[0]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        resultaat1.get().setText(values[0]+"m^2");
    }
}

