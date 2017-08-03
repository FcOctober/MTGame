package com.bdqn.hr.manager;

import com.bdqn.hr.activity.LoginActivity;
import com.bdqn.hr.activity.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

public class MyBitMapManager extends View {
	private static Bitmap bitmapHC = null;	//缓冲图
	private static Bitmap bitmapHC2 = null;	//缓冲图2
	private static Bitmap bitmapImgall = null;	//大图、背景
	private static Bitmap bitmapWupin = null;	//物品图
	private static Bitmap bitmapWupinbg = null;	//消息视图背景
	private static Bitmap bitmapMtfontimg = null;	//键盘下背景
	private static Bitmap bitmapDoor = null;	//门
	private static Bitmap bitmapEnemy = null;	//怪物
	private static Bitmap bitmapMyoto = null;	//坡哥头像
	private static Bitmap bitmapMtlodingbg = null;	//换层视图背景图
	private static Bitmap bitmapZhandoubg = null;	//战斗视图背景图
	private static Bitmap bitmapWinimg = null;	//战斗胜利图
	private static Bitmap bitmapShibaiimg = null;	//战斗失败图
	private static Bitmap bitmapMyactor = null;	//角色图
	private static Bitmap bitmapNpcimg = null;	//NPC
	private static Bitmap bitmapShopimgbg = null;	//NPC

	public MyBitMapManager(Context context) {
		super(context);
	}

	public void initBitMap() {
		if(bitmapHC==null || bitmapImgall==null || bitmapShibaiimg==null){
			System.out.println("load Image begin........");
			bitmapHC = Bitmap.createBitmap(480, 800, Config.ARGB_8888);
			bitmapHC2= Bitmap.createBitmap(LoginActivity.width, LoginActivity.height, Config.ARGB_8888);
			bitmapImgall = ((BitmapDrawable) getResources().getDrawable(R.drawable.imgall)).getBitmap();
			bitmapWupin = ((BitmapDrawable) getResources().getDrawable(R.drawable.wupin)).getBitmap();
			bitmapMtfontimg = ((BitmapDrawable) getResources().getDrawable(R.drawable.mtfontimg)).getBitmap();
			bitmapDoor = ((BitmapDrawable) getResources().getDrawable(R.drawable.door)).getBitmap();
			bitmapEnemy = ((BitmapDrawable) getResources().getDrawable(R.drawable.enemy)).getBitmap();
			bitmapMyoto = ((BitmapDrawable) getResources().getDrawable(R.drawable.myoto)).getBitmap();
			bitmapMtlodingbg = ((BitmapDrawable) getResources().getDrawable(R.drawable.mtlodingbg)).getBitmap();
			bitmapZhandoubg = ((BitmapDrawable) getResources().getDrawable(R.drawable.zhandoubg)).getBitmap();
			bitmapWinimg = ((BitmapDrawable) getResources().getDrawable(R.drawable.winimg)).getBitmap();
			bitmapShibaiimg = ((BitmapDrawable) getResources().getDrawable(R.drawable.shibaiimg)).getBitmap();
			bitmapWupinbg = ((BitmapDrawable) getResources().getDrawable(R.drawable.wupinbg)).getBitmap();
			bitmapMyactor= ((BitmapDrawable) getResources().getDrawable(R.drawable.myactor)).getBitmap();
			bitmapNpcimg= ((BitmapDrawable) getResources().getDrawable(R.drawable.npcimg)).getBitmap();
			System.out.println("load Image end........");
		}
	}

	/**缓冲图*/
	public static Bitmap getBitmapHC() {
		return bitmapHC;
	}
	/**大图、背景*/
	public static Bitmap getBitmapImgall() {
		return bitmapImgall;
	}
	/**物品图*/
	public static Bitmap getBitmapWupin() {
		return bitmapWupin;
	}
	/**键盘下背景*/
	public static Bitmap getBitmapMtfontimg() {
		return bitmapMtfontimg;
	}
	/**门*/
	public static Bitmap getBitmapDoor() {
		return bitmapDoor;
	}
	/**怪物*/
	public static Bitmap getBitmapEnemy() {
		return bitmapEnemy;
	}
	/**坡哥头像*/
	public static Bitmap getBitmapMyoto() {
		return bitmapMyoto;
	}
	/**换层视图背景图*/
	public static Bitmap getBitmapMtlodingbg() {
		return bitmapMtlodingbg;
	}
	/**战斗视图背景图*/
	public static Bitmap getBitmapZhandoubg() {
		return bitmapZhandoubg;
	}
	/**战斗胜利图*/
	public static Bitmap getBitmapWinimg() {
		return bitmapWinimg;
	}
	/**战斗失败图*/
	public static Bitmap getBitmapShibaiimg() {
		return bitmapShibaiimg;
	}
	/**消息视图背景*/
	public static Bitmap getBitmapWupinbg() {
		return bitmapWupinbg;
	}
	/**角色图*/
	public static Bitmap getBitmapMyactor() {
		return bitmapMyactor;
	}
	/**NPC图*/
	public static Bitmap getBitmapNpcimg() {
		return bitmapNpcimg;
	}

	public static Bitmap getBitmapShopimgbg() {
		return bitmapShopimgbg;
	}

	public static Bitmap getBitmapHC2() {
		return bitmapHC2;
	}
}
