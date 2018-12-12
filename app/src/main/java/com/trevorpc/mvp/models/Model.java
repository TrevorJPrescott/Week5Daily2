package com.trevorpc.mvp.models;

import android.os.Handler;

import com.trevorpc.mvp.MainContract;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements MainContract.ModelCallBack {
    @Override
    public void getNextQuote(final MainContract.ModelCallBack.OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomQuote());
            }
        },1200);
    }


    private List<String> arrayList = Arrays.asList("one.png",
            "two.png","three.png","four.png","five.png","six.png",
            "seven.png","eight.png","nine.png","ten.pgn");

    private String getRandomQuote() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
