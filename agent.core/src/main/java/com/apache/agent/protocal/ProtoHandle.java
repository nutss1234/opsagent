package com.apache.agent.protocal;

import io.netty.channel.Channel;

public interface ProtoHandle {

	public void handle(Channel channel, Object object);

	public byte protoType();

}
