package com.zha.ui;

public class SimpleOperatorActivity extends CommUIView implements ISimpleOperatorView{
	@Override
	public void refreshUI_temperature() {
		System.out.println("����UI---������*�����¶�---");
	}
	@Override
	public void changeAssistantMode() {
		System.out.println("����UI---������*�л�����ģʽ---");
	}
}
