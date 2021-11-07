package com.hua.observer.childcry;

/**
 * 具体行为-醒来
 */
class WakeUpEvent extends Event<Child> {
	/**
	 * 醒来的时间
	 */
	long wakeTime;

	/**
	 * baby在的位置
	 */
	String location;

	Child source;

	public WakeUpEvent(long wakeTime, String location, Child source) {
		this.wakeTime = wakeTime;
		this.location = location;
		this.source = source;
	}

	@Override
	Child getSource() {
		return source;
	}
}