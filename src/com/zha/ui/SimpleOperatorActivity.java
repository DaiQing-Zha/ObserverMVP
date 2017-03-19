package com.zha.ui;

public class SimpleOperatorActivity extends CommUIView implements ISimpleOperatorView{
	@Override
	public void refreshUI_temperature() {
		System.out.println("更新UI---简便操作*更新温度---");
	}
	@Override
	public void changeAssistantMode() {
		System.out.println("更新UI---简便操作*切换助力模式---");
	}
}
