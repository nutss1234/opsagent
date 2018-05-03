package com.apache.agent.channel;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class CustomEncode extends MessageToByteEncoder {

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
		String body = msg.toString();
		byte[] bodyBytes = body.getBytes();
		out.writeBytes(bodyBytes);
	}

}
