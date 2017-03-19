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
	 * �۲����б�
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
		System.out.println("�¼�---��ȡ�¶�");
		for (CommUIView commUIView : commUIViews) {
			commUIView.refreshUI_temperature();
		}
	}
	@Override
	public void clickLock() {
		System.out.println("�¼�---����");
		for (CommUIView commUI : commUIViews) {
			if (commUI instanceof IRideView) {
				((IRideView)commUI).refreshUI_lockStatus();
			}
		}
	}
	@Override
	public void clickChangeAssistantMode() {
		System.out.println("�¼�---�л�����ģʽ");
		for (CommUIView commUI : commUIViews) {
			if (commUI instanceof ISimpleOperatorView) {
				((ISimpleOperatorView)commUI).changeAssistantMode();
			}
		}
	}
	@Override
	public void startTimer() {
		System.out.println("�¼�---������ʱ��");
		// �ڶ�������Ϊ�״�ִ�е���ʱʱ�䣬����������Ϊ��ʱִ�еļ��ʱ��  
	    service.scheduleAtFixedRate(runnable, 10, 8, TimeUnit.SECONDS);  	    	
	}
	@Override
	public void stopTimer() {
	}
}
