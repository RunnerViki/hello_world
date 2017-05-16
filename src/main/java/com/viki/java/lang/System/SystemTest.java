package com.viki.java.lang.System;

import java.util.Date;

public class SystemTest {

	/**
	 * 1、nanoTime()只能用于计算高精度的时间间隔，而不能表示某个时间点。
	 * 因为它并不像时钟一样，有一个固定的时间起点并按这个时间开始计时。
	 * 有时候，可能它是从某一个未来的时间开始计时，所以会得到一个负值，而有时候可能是另外一个值；
	 * 可以肯定的是，在同一个虚拟机实例多次调用该方法时，设置的时间起点是完全相同的。
	 *
	 * currentTimeMillis()以1970年1月1日UTC时间为起点，计算已经过去的毫秒数，可以表示某一个时间点；
	 *
	 * 注：一秒等于十亿纳秒；一秒等于一千毫秒；
	 */
	public void printTime(){
		System.out.println(new Date() + "" + System.nanoTime());
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date() + "" + System.nanoTime());
	}

	/**
	 * 2、System.copyArray()可以很方便地复制数组的一部分;
	 * 该功能属于【浅度复制】，所以修改其中一方，将会导致另一方也受到影响;
	 * 需要注意复制的长度不要超出源数组和目的数组的边界，避免引起下标溢出;
	 *
	 * 还有另外三种数据复制功能：
	 * 	a) Arrays.copyOf()或者Arrays.copyOfRange()
	 *
	 *  b) object.clone()
	 */
	public void copyArrayTest(){
		String[] sourceStrArray = new String[]{"a","b","c","d","e","f","g"};
		String[] destStrArray = new String[8];
		System.arraycopy(sourceStrArray, 0, destStrArray, 0, 6);
		for(String str : destStrArray){
			System.out.println(str);
		}
		System.out.println(sourceStrArray[0] == destStrArray[0]);
	}

	public void cloneTest(){
		SystemTest st = new SystemTest();
		try {
			SystemTest st2 = (SystemTest) st.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args){
		SystemTest systemTest = new SystemTest();
		systemTest.copyArrayTest();
	}
}
