package com.bdqn.hr.view;

import com.bdqn.hr.activity.GameGY;
import com.bdqn.hr.activity.LoginActivity;
import com.bdqn.hr.activity.R;
import com.bdqn.hr.entity.Actor;
import com.bdqn.hr.manager.MyBitMapManager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

//显示三分之2的区域
public class LoadingView extends View {
    Bitmap bitmapbg = null;
    public static Handler handler = new Handler();
    Paint paint = null;
    Actor actor = null;
    int alpha = 0;
    int currentIndex = 2;
    int width, height;


    public LoadingView(Context context) {
        super(context);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);

        width = ((Activity) context).getWindowManager().getDefaultDisplay().getWidth();
        height = ((Activity) context).getWindowManager().getDefaultDisplay().getHeight();

        currentIndex = 0;
        alpha = 0;
        handler.postDelayed(runnable, 100);
        bitmapbg = MyBitMapManager.getBitmapMtlodingbg();
        paint = new Paint();
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setColor(Color.LTGRAY);
        paint.setTextSize(38);
        actor = Actor.getActor(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        RectF rectF = new RectF(width / 6, height / 6, width * 5 / 6, height * 5 / 6);
        if (currentIndex == 0) {
            alpha += 30;
            paint.setAlpha(alpha);

            canvas.drawBitmap(bitmapbg, null, rectF, paint);
            currentIndex = alpha > 200 ? 1 : 0;
            if (alpha > 200) {
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 1000);
            }
            if (actor.getMtceng() < 10) {
                canvas.drawText("" + (actor.getMtceng() + 1), width / 2 - 5, height / 2 + 20, paint);
            } else {
                canvas.drawText("" + (actor.getMtceng() + 1), width / 2 - 10, height / 2 + 20, paint);
            }
        } else if (currentIndex == 1) {
            canvas.drawBitmap(bitmapbg, null, rectF, paint);
            if (actor.getMtceng() < 10) {
                canvas.drawText("" + (actor.getMtceng() + 1), width / 2 - 5, height / 2 + 20, paint);
            } else {
                canvas.drawText("" + (actor.getMtceng() + 1), width / 2 - 10, height / 2 + 20, paint);
            }
        }
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (currentIndex == 0) {
                handler.postDelayed(runnable, 100);
            } else if (currentIndex == 1) {
                handler.removeCallbacks(runnable);
                Message message = handler.obtainMessage();
                message.arg1 = 88;
                handler.sendMessage(message);
            } else {
                handler.removeCallbacks(runnable);
            }
            postInvalidate();
        }
    };

}
