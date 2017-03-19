package com.zha.logic;
import com.zha.ui.CommUIView;
public abstract class CommLogicPresenter {
	/**
	 * ��ӹ۲���
	 * @param commUIView
	 */
	public abstract void attach(CommUIView commUIView);
	/**
	 * �Ƴ��۲���
	 * @param commUIView
	 */
	public abstract void detach(CommUIView commUIView);
	/**
	 * ˢ���¶�
	 */
	public abstract void noticyRefreshTemperature();
	/**
	 * ������ʱ��
	 */
	public abstract void startTimer();
	/**
	 * ֹͣ��ʱ��
	 */
	public abstract void stopTimer();
}
