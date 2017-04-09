package com.questdot.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private MainComponent mMainComponent;
    @Inject
    ToastUtil toastUtil;

    @Inject
    String helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainComponent = DaggerMainComponent.builder().appComponent(getAppComponent())
                .mainModule(new MainModule())
              .build();
        mMainComponent.inject(this);

        toastUtil.showToast("Custom Toast Message");

        toastUtil.showToast(helloText);
    }

    public AppComponent getAppComponent(){
        return ((App)getApplication()).getAppComponent();
    }
}
