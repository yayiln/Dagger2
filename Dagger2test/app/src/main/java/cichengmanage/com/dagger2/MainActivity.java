package cichengmanage.com.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    ApiService apiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserComponet.create().inJect(this);
        apiService.register();
    }
}
