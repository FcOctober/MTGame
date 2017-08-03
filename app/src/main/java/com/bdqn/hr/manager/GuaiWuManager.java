package com.bdqn.hr.manager;

import android.content.Context;

import com.bdqn.hr.entity.GuaiWu;

public class GuaiWuManager {

	public static GuaiWu getGuaiWu(int imgindex) {
		GuaiWu guaiWu = new GuaiWu();
		int index = imgindex / 4;
		switch (index) {
			case 0:
				guaiWu.initGuaiWu("小骷髅", 300, 50, 20,50,30, index);
				break;
			case 1:
				guaiWu.initGuaiWu("刀盾骷髅", 800, 80, 30,80,40, index);
				break;
			case 2:
				guaiWu.initGuaiWu("狂暴骷髅", 77, 6, 8,5,8, index);
				break;
			case 3:
				guaiWu.initGuaiWu("钢甲骷髅", 100, 6, 8,5,8, index);
				break;
			case 4:
				guaiWu.initGuaiWu("小蝙蝠", 150, 15, 3,10,15, index);
				break;
			case 5:
				guaiWu.initGuaiWu("大蝙蝠", 1000, 90, 70,120,70, index);
				break;
			case 6:
				guaiWu.initGuaiWu("烈焰蝙蝠", 2000, 200, 180,200,150, index);
				break;
			case 7:
				guaiWu.initGuaiWu("黑袍法师", 100, 6, 8,5,8, index);
				break;
			case 8:
				guaiWu.initGuaiWu("青泡泡", 150, 25, 2,20,15, index);
				break;
			case 9:
				guaiWu.initGuaiWu("红泡泡", 100, 15, 2,10,10, index);
				break;
			case 10:
				guaiWu.initGuaiWu("黑泡泡", 200, 15, 3,30,10, index);
				break;
			case 11:
				guaiWu.initGuaiWu("大脸鸟", 100, 6, 8,5,8, index);
				break;
			case 12:
				guaiWu.initGuaiWu("蓝袍巫师", 500, 20, 5,30,20, index);
				break;
			case 13:
				guaiWu.initGuaiWu("红袍巫师", 100, 6, 8,5,8, index);
				break;
			case 14:
				guaiWu.initGuaiWu("灰法师", 100, 6, 8,5,8, index);
				break;
			case 15:
				guaiWu.initGuaiWu("红法师", 100, 6, 8,5,8, index);
				break;
			case 16:
				guaiWu.initGuaiWu("兽人", 500, 50, 50,100,50, index);
				break;
			case 17:
				guaiWu.initGuaiWu("刀盾兽人", 100, 6, 8,5,8, index);
				break;
			case 18:
				guaiWu.initGuaiWu("石像头", 2500, 180, 150,120,100, index);
				break;
			case 19:
				guaiWu.initGuaiWu("鼻涕人", 100, 6, 8,5,8, index);
				break;
			case 20:
				guaiWu.initGuaiWu("石头人", 1000, 80, 60,100,50, index);
				break;
			case 21:
				guaiWu.initGuaiWu("蓝甲石人", 100, 6, 8,5,8, index);
				break;
			case 22:
				guaiWu.initGuaiWu("红甲石人", 100, 6, 8,5,8, index);
				break;
			case 23:
				guaiWu.initGuaiWu("盗贼", 100, 6, 8,5,8, index);
				break;
			case 24:
				guaiWu.initGuaiWu("魔王", 5000, 300, 220,88,88, index);
				break;
			case 25:
				guaiWu.initGuaiWu("红眼狼头", 100, 6, 8,5,8, index);
				break;
			case 26:
				guaiWu.initGuaiWu("狐狸精", 100, 6, 8,5,8, index);
				break;
			case 27:
				guaiWu.initGuaiWu("蝙蝠精", 2500, 190, 160,150,100, index);
				break;
			case 28:
				guaiWu.initGuaiWu("小超人", 100, 6, 8,5,8, index);
				break;
			case 29:
				guaiWu.initGuaiWu("巨蝠超人", 3000, 200, 200,300,200, index);
				break;
			case 30:
				guaiWu.initGuaiWu("剑盾超人", 100, 6, 8,5,8, index);
				break;
			case 31:
				guaiWu.initGuaiWu("超人教官", 100, 6, 8,5,8, index);
				break;
			case 32:
				guaiWu.initGuaiWu("红甲卫士", 100, 6, 8,5,8, index);
				break;
			case 33:
				guaiWu.initGuaiWu("邪恶刀客", 100, 6, 8,5,8, index);
				break;
			case 34:
				guaiWu.initGuaiWu("邪恶大法师", 100, 6, 8,5,8, index);
				break;
			case 35:
				guaiWu.initGuaiWu("猫头精", 100, 6, 8,5,8, index);
				break;
			case 36:
				guaiWu.initGuaiWu("骷髅大法师", 100, 6, 8,5,8, index);
				break;
			case 37:
				guaiWu.initGuaiWu("金甲守卫", 1000, 56, 8,5,8, index);
				break;
			case 38:
				guaiWu.initGuaiWu("土豪骷髅", 100, 6, 8,5,8, index);
				break;
			case 39:
				guaiWu.initGuaiWu("刀盾猪", 3000, 200, 180,200,150, index);
				break;
			case 40:
				guaiWu.initGuaiWu("红眼黄泡泡", 100, 6, 8,5,8, index);
				break;
			case 41:
				guaiWu.initGuaiWu("紫甲骷髅", 100, 6, 8,5,8, index);
				break;
			case 42:
				guaiWu.initGuaiWu("蝙蝠王", 100, 6, 8,5,8, index);
				break;
			case 43:
				guaiWu.initGuaiWu("黑石像头", 100, 6, 8,5,8, index);
				break;
			case 44:
				guaiWu.initGuaiWu("黑甲守卫", 100, 6, 8,5,8, index);
				break;
			case 45:
				guaiWu.initGuaiWu("黄甲守卫", 100, 6, 8,5,8, index);
				break;
			case 46:
				guaiWu.initGuaiWu("青甲守卫", 100, 6, 8,5,8, index);
				break;
			case 47:
				guaiWu.initGuaiWu("蓝甲将军", 100, 6, 8,5,8, index);
				break;
			case 48:
				guaiWu.initGuaiWu("巫师王", 100, 6, 8,5,8, index);
				break;
			case 49:
				guaiWu.initGuaiWu("红衣盗贼", 100, 6, 8,5,8, index);
				break;
			case 50:
				guaiWu.initGuaiWu("白鼻涕人", 100, 6, 8,5,8, index);
				break;
			case 51:
				guaiWu.initGuaiWu("毒兽人", 100, 6, 8,5,8, index);
				break;
			case 52:
				guaiWu.initGuaiWu("红甲守卫", 100, 6, 8,5,8, index);
				break;
			case 53:
				guaiWu.initGuaiWu("蓝甲守卫", 100, 6, 8,5,8, index);
				break;
			case 54:
				guaiWu.initGuaiWu("邪恶教皇", 100, 6, 8,5,8, index);
				break;
			case 55:
				guaiWu.initGuaiWu("白色泡泡", 60, 12, 8,5,8, index);
				break;
			case 56:
				guaiWu.initGuaiWu("十字军", 100, 6, 8,5,8, index);
				break;
			case 57:
				guaiWu.initGuaiWu("大地守卫", 100, 6, 8,5,8, index);
				break;
			case 58:
				guaiWu.initGuaiWu("火焰守卫", 100, 6, 8,5,8, index);
				break;
			case 59:
				guaiWu.initGuaiWu("邪恶傀儡", 100, 6, 8,5,8, index);
				break;
		}
		return guaiWu;
	}
}
