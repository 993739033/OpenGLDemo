package com.bbny.qifengwlw.opengldemo;

import android.opengl.GLES10;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by ZWX on 2019/2/12.
 */

public class MyGLRender implements GLSurfaceView.Renderer {
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //开始时绘制一些不常用变化参数 如背景色，是否打开z-buffer等
        gl.glClearColor(1f,0.3f,0.6f,0.5f);
        gl.glShadeModel(GL10.GL_SMOOTH);


    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        //此方法发生在屏幕横纵向切换时回调
        gl.glViewport(0,0,width,height);
    }


    @Override
    public void onDrawFrame(GL10 gl) {
        //实际绘图操作
        gl.glClear(GLES10.GL_COLOR_BUFFER_BIT);

    }
}
