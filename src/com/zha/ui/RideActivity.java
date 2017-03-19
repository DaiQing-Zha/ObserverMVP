package com.zha.ui;

public class RideActivity extends CommUIView implements IRideView{
	@Override
	public void refreshUI_temperature() {
		System.out.println("更新UI---骑行*更新温度---");
	}
	@Override
	public void refreshUI_lockStatus() {
		System.out.println("更新UI---骑行*更新锁定---");
	}

}
