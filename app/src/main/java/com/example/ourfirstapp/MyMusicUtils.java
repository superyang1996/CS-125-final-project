package com.example.ourfirstapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;

public class MyMusicUtils {
    int[] Music = {R.raw.do1, R.raw.re2, R.raw.mi3, R.raw.fa4, R.raw.sol5, R.raw.la6, R.raw.si7};
    SoundPool soundPool;
    HashMap<Integer, Integer> soundPoolMap;

    public MyMusicUtils(Context context) {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 100);
        soundPoolMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < Music.length; i++) {
            soundPoolMap.put(i, soundPool.load(context, Music[i], 1));
        }
    }

    public int soundPlay(int id) {
        return soundPool.play(soundPoolMap.get(id), 200, 200, 1, 0, 2.0f);
    }
}
