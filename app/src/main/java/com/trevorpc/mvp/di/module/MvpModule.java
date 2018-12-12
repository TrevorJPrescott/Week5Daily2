package com.trevorpc.mvp.di.module;

import com.trevorpc.mvp.MainContract;
import com.trevorpc.mvp.models.Model;
import com.trevorpc.mvp.presenters.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack
    providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}
