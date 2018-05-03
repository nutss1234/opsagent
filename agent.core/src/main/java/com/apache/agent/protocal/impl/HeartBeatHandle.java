package com.apache.agent.protocal.impl;

import com.apache.agent.protocal.ProtoHandle;
import com.apache.agent.protocal.ProtocalType;

import io.netty.channel.Channel;

public class HeartBeatHandle implements ProtoHandle {

	@Override
	public void handle(Channel channel, Object object) {
		// TODO Auto-generated method stub

	}

	public byte protoType() {
		return ProtocalType.heartBeat;
	}

}
