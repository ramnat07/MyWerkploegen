package ehb.be.mywerkploegen.activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import ehb.be.mywerkploegen.R;
import ehb.be.mywerkploegen.util.ProgressTask;

public class MainActivity extends AppCompatActivity {


    private ProgressTask pbTaskLoodgieters;
    private ProgressTask pbTaskMetsers;
    private TextView tvTextLoodgieters;
    private TextView tvTextMetsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTextLoodgieters = findViewById(R.id.tv_loodgieters);
        tvTextMetsers = findViewById(R.id.tv_metsers);

    ProgressTask prt = new ProgressTask(tvTextLoodgieters);
    ProgressTask prt1 = new ProgressTask(tvTextMetsers);

    prt.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 200);
    prt1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 1500);
    }
}
