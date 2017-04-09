package com.questdot.dagger2example;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class MainModule {

    @Provides
    public String providesHello(){
        return "Main Hello";
    }

}
