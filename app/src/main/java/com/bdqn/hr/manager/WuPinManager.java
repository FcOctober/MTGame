package com.bdqn.hr.manager;

import com.bdqn.hr.entity.WuPin;

public class WuPinManager {
	public static final String TIEGAO="铁镐";
	public static final String SHIZIJIA="十字架";
	public static final String LJXZ="六角星阵";
	public static WuPin getWuPin(int wpIndex){
		WuPin wuPin=WuPin.getWuPin();
		switch(wpIndex){
			case 13:
				wuPin.initWuPin("红宝石", 3, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 1:
				wuPin.initWuPin("蓝宝石", 0, 3, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 2:
				wuPin.initWuPin("绿宝石", 6, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 3:
				wuPin.initWuPin("黄宝石", 0, 6, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 4:
				wuPin.initWuPin("小营养液", 0, 0, 200, 0, 0, 0, 0,0, 0, false);
				break;
			case 5:
				wuPin.initWuPin("中营养液", 0, 0, 500, 0, 0, 0, 0, 0,0, false);
				break;
			case 6:
				wuPin.initWuPin("大营养液", 0, 0, 800, 0, 0, 0, 0, 0,0, false);
				break;
			case 7:
				wuPin.initWuPin("超大营养液", 0, 0, 1500, 0, 0, 0, 0, 0,0, false);
				break;
			case 14:
				wuPin.initWuPin("智慧水壶", 0, 0, 0, 0, 0, 0, 0, 100,0, false);
				break;
			case 15:
				wuPin.initWuPin("大智慧水壶", 0, 0, 0, 0, 0, 0, 0, 200,0, false);
				break;
			case 16:
				wuPin.initWuPin("黄钥匙", 0, 0, 0, 1, 0, 0, 0, 0,0, false);
				break;
			case 17:
				wuPin.initWuPin("蓝钥匙", 0, 0, 0, 0, 1, 0, 0, 0,0, false);
				break;
			case 18:
				wuPin.initWuPin("红钥匙", 0, 0, 0, 0, 0, 1, 0, 0,0, false);
				break;
			case 22:
				wuPin.initWuPin("钥匙盒", 0, 0, 0, 1, 1, 1, 0, 0,0, false);
				break;
			case 28:
				wuPin.initWuPin("智慧之书", 0, 0, 0, 0, 0, 0, 0, 300,0, false);
				break;
			case 30:
				wuPin.initWuPin(LJXZ, 0, 0, 0, 0, 0, 0, 0, 0,0, true);
				break;
			case 31:
				wuPin.initWuPin("笑脸币", 0, 0, 0, 0, 0, 0, 100, 0,0, false);
				break;
			case 33:
				wuPin.initWuPin(TIEGAO, 0, 0, 0, 0, 0, 0, 0, 0,0, true);
				break;
			case 36:
				wuPin.initWuPin("飞行翼", 0, 0, 0, 0, 0, 0, 0, 0,1, false);
				break;
			case 38:
				wuPin.initWuPin("大飞行翼", 0, 0, 0, 0, 0, 0, 0, 0,3, false);
				break;
			case 39:
				wuPin.initWuPin(SHIZIJIA, 0, 0, 0, 0, 0, 0, 0, 0,0, true);
				break;
			case 45:
				wuPin.initWuPin("新年福袋", 20, 0, 2000, 0, 0, 0, 0, 0,0, false);
				break;
			case 48:
				wuPin.initWuPin("铁剑", 5, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 49:
				wuPin.initWuPin("钢剑", 15, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 50:
				wuPin.initWuPin("大铁剑", 30, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 51:
				wuPin.initWuPin("大钢剑", 50, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 52:
				wuPin.initWuPin("宇哥剑", 100, 0, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 56:
				wuPin.initWuPin("皮盾", 0, 5, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 57:
				wuPin.initWuPin("钢盾", 0, 12, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 58:
				wuPin.initWuPin("坚木盾", 0, 25, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 59:
				wuPin.initWuPin("宝石盾", 0, 50, 0, 0, 0, 0, 0, 0,0, false);
				break;
			case 60:
				wuPin.initWuPin("宇哥盾", 0, 100, 0, 0, 0, 0, 0, 0,0, false);
				break;
		}
		return wuPin;
	}
}
