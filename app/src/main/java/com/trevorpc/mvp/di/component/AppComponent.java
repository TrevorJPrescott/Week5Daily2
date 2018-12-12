package com.trevorpc.mvp.di.component;


import android.app.Application;
import android.content.Context;

import com.trevorpc.mvp.InitApplication;
import com.trevorpc.mvp.di.module.AppModule;
import com.trevorpc.mvp.di.module.ContextModule;
import com.trevorpc.mvp.di.module.DataModule;
import com.trevorpc.mvp.models.Model;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {AppModule.class, DataModule.class,
        ContextModule.class})
public interface AppComponent {
    void inject (InitApplication initApplication);

    Context getContext();

    Model getFindItemInteractor();

    Application getApplication();
}
