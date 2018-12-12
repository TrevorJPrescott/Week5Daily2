package com.trevorpc.mvp.di.component;


import com.trevorpc.mvp.MainContract;
import com.trevorpc.mvp.di.module.MvpModule;
import com.trevorpc.mvp.di.scope.ActivityScope;
import com.trevorpc.mvp.views.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules =
        MvpModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}
