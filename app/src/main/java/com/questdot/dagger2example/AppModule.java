package com.questdot.dagger2example;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return context;
    }



    @Provides
    @Singleton
    public ToastUtil provideToastUtil(){
        return new ToastUtil(context);
    }

//    @Provides @Singleton
//    public Test provideTest(){
//        return new Test();
//    }
}
