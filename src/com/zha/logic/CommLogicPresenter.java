package com.zha.logic;
import com.zha.ui.CommUIView;
public abstract class CommLogicPresenter {
	/**
	 * 添加观察者
	 * @param commUIView
	 */
	public abstract void attach(CommUIView commUIView);
	/**
	 * 移除观察者
	 * @param commUIView
	 */
	public abstract void detach(CommUIView commUIView);
	/**
	 * 刷新温度
	 */
	public abstract void noticyRefreshTemperature();
	/**
	 * 启动定时器
	 */
	public abstract void startTimer();
	/**
	 * 停止定时器
	 */
	public abstract void stopTimer();
}
