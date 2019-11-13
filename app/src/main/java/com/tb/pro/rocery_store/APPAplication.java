package com.tb.pro.rocery_store;

import android.app.Application;

import com.tbpower.tools.TBTools;


public class APPAplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		long start = System.currentTimeMillis();

		TBTools.init(this);
		TBTools.openToolsLog(true);

//		TaskDispatcher.init(this);
//		TaskDispatcher taskDispatcher = TaskDispatcher.createInstance();
//		taskDispatcher.addTask(new Task1())
//				.addTask(new Task2())
//				.addTask(new Task3())
//				.start();
//		taskDispatcher.await();



//		test1();
//		test2();
//		test3();
		long end =  System.currentTimeMillis()-start ;
		TBTools.log().i("TASK TEST","程序总启动时间>>>"+end);
	}

	public void test1(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <10000000 ; i++) {

				}
			}
		}).start();

	}
	public void test2(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <10000000 ; i++) {

				}
			}
		}).start();
	}
	public void test3(){
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <10000000 ; i++) {

				}
			}
		}).start();
	}


}
