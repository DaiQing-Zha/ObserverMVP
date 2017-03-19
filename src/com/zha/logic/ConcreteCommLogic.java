package com.zha.logic;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.zha.ui.CommUIView;
import com.zha.ui.IRideView;
import com.zha.ui.ISimpleOperatorView;
public class ConcreteCommLogic extends CommLogicPresenter implements IRidePresenter,ISimpleOperatorPresenter{
	/**
	 * 观察者列表
	 */
	private List<CommUIView> commUIViews= new ArrayList<CommUIView>();
	private ScheduledExecutorService service = Executors  
            .newSingleThreadScheduledExecutor();  
	private Runnable runnable = new Runnable() {  
        public void run() {  
            noticyRefreshTemperature();
        }  
    }; 
	@Override
	public void attach(CommUIView commUIView) {
		commUIViews.add(commUIView);
	}
	@Override
	public void detach(CommUIView commUIView) {
		commUIViews.remove(commUIView);
	}
	@Override
	public void noticyRefreshTemperature() {
		System.out.println("事件---获取温度");
		for (CommUIView commUIView : commUIViews) {
			commUIView.refreshUI_temperature();
		}
	}
	@Override
	public void clickLock() {
		System.out.println("事件---锁定");
		for (CommUIView commUI : commUIViews) {
			if (commUI instanceof IRideView) {
				((IRideView)commUI).refreshUI_lockStatus();
			}
		}
	}
	@Override
	public void clickChangeAssistantMode() {
		System.out.println("事件---切换助力模式");
		for (CommUIView commUI : commUIViews) {
			if (commUI instanceof ISimpleOperatorView) {
				((ISimpleOperatorView)commUI).changeAssistantMode();
			}
		}
	}
	@Override
	public void startTimer() {
		System.out.println("事件---启动定时器");
		// 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间  
	    service.scheduleAtFixedRate(runnable, 10, 8, TimeUnit.SECONDS);  	    	
	}
	@Override
	public void stopTimer() {
	}
}
