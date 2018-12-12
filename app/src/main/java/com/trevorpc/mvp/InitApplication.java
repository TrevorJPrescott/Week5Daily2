package com.trevorpc.mvp;

import android.app.Application;
import android.content.Context;

import com.trevorpc.mvp.di.component.AppComponent;
import com.trevorpc.mvp.di.module.AppModule;
import com.trevorpc.mvp.di.module.ContextModule;
import com.trevorpc.mvp.di.module.DataModule;

public class InitApplication extends Application {

    private AppComponent component;

    public static InitApplication get(Context context) {
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .contextModule(new ContextModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent component() {
        return component;
    }
}
