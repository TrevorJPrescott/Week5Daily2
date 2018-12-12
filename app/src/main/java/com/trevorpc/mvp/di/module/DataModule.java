package com.trevorpc.mvp.di.module;


import com.trevorpc.mvp.models.Model;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}
