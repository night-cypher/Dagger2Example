package com.questdot.dagger2example;


import dagger.Component;


@PerActivity
@Component(dependencies = AppComponent.class,modules = {MainModule.class})
public interface MainComponent {
    //对MainActivity进行依赖注入
    void inject(MainActivity mainActivity);


}
