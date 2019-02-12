package com.bbny.qifengwlw.opengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;

/**
 * Created by ZWX on 2019/2/12.
 */

public class MyGLSurfaceView extends GLSurfaceView {
    private  MyGLRender render;

    public MyGLSurfaceView(Context context) {
        super(context);
        //使用2.0版本
        setEGLContextClientVersion(2);
        render = new MyGLRender();
        setRenderer(render);
        this.setRenderMode(RENDERMODE_CONTINUOUSLY);//默认一直刷新  16Fps    RENDERMODE_WHEN_DIRTY  表示不主动刷新需通过glsurfaceView.requestRender() 进行刷新

    }

}
