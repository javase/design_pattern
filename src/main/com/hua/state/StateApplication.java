package com.hua.state;

/**
 * Created by lerry on 2018/2/26.
 * @author lerry
 */
public class StateApplication {
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(String.format("切换开始状态后的context:%s", context.getState()));

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(String.format("切换关闭状态后的context:%s", context.getState()));

	}
}

interface State {

	void doAction(Context context);
}

class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State";
	}
}

class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
	}

	@Override
	public String toString() {
		return "Stop State";
	}
}

class Context {
	private State state;

	public Context() {
		this.state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
