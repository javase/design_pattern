package com.hua.state;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 需求描述：
 * 考虑一个在线投票系统的应用，要实现控制同一个用户只能投一票，
 * 如果一个用户反复投票，
 * 而且投票次数超过5次，则判定为恶意刷票，要取消该用户投票的资格，当然同时也要取消他所投的票；
 * 如果一个用户的投票次数超过8次，将进入黑名单，禁止再登录和使用系统。
 * 要使用状态模式实现，首先需要把投票过程的各种状态定义出来，根据以上描述大致分为四种状态：
 * 正常投票、反复投票、恶意刷票、进入黑名单。
 * 然后创建一个投票管理对象（相当于Context）。
 * </pre>
 * Created by lerry on 2018/2/26.
 * @author lerry
 */
public class VoteStateApplication {
	public static void main(String[] args) {
		VoteManager vm = new VoteManager();
		for (int i = 0; i < 9; i++) {
			System.out.print(String.format("第%d次投票:", i + 1));
			vm.vote("User01", "A");
		}
	}
}

interface VoteState {
	/**
	 * 处理状态对应的行为
	 * @param user 投票人
	 * @param voteItem 投票项
	 * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，可以回调上下文的数据
	 */
	void vote(String user, String voteItem, VoteManager voteManager);
}

// 正常投票
class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//正常投票，记录到投票记录中
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("恭喜投票成功");
	}

}

// 重复投票
class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//重复投票，暂时不做处理
		System.out.println("请不要重复投票");
	}

}

// 恶意刷票
class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		// 恶意投票，取消用户的投票资格，并取消投票记录
		String str = voteManager.getMapVote().get(user);
		if (str != null) {
			voteManager.getMapVote().remove(user);
		}
		System.out.println("你有恶意刷屏行为，取消投票资格");
	}

}

// 黑名单
class BlackVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//记录黑名单中，禁止登录系统
		System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

}

class VoteManager {
	//持有状体处理对象
	private VoteState state = null;

	//记录用户投票的结果，Map<String,String>对应Map<用户名称，投票的选项>
	private Map<String, String> mapVote = new HashMap<>();

	//记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票的次数>
	private Map<String, Integer> mapVoteCount = new HashMap<>();

	/**
	 * 获取用户投票结果的Map
	 */
	public Map<String, String> getMapVote() {
		return mapVote;
	}

	/**
	 * 投票
	 * @param user 投票人
	 * @param voteItem 投票的选项
	 */
	public void vote(String user, String voteItem) {
		//1.为该用户增加投票次数
		//从记录中取出该用户已有的投票次数
		Integer oldVoteCount = mapVoteCount.get(user);
		if (oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount += 1;
		mapVoteCount.put(user, oldVoteCount);

		//2.判断该用户的投票类型，就相当于判断对应的状态
		//到底是正常投票、重复投票、恶意投票还是上黑名单的状态
		if (oldVoteCount == 1) {
			state = new NormalVoteState();
		}
		else if (oldVoteCount > 1 && oldVoteCount < 5) {
			state = new RepeatVoteState();
		}
		else if (oldVoteCount >= 5 && oldVoteCount < 8) {
			state = new SpiteVoteState();
		}
		else if (oldVoteCount > 8) {
			state = new BlackVoteState();
		}
		//然后转调状态对象来进行相应的操作
		state.vote(user, voteItem, this);
	}
}


