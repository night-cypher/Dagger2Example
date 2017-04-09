package com.questdot.dagger2example;

import android.content.Context;


import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {

    Context getContext();

    ToastUtil getToastUtil();
//    Test test();

}
