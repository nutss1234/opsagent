package com.apache.agent.channel;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class CustomDecode extends LengthFieldBasedFrameDecoder {

	public CustomDecode(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength) {
		super(maxFrameLength, lengthFieldOffset, lengthFieldLength);
	}

	@Override
	protected Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception {
		ByteBuf bf = (ByteBuf) super.decode(ctx, in);
		int length = bf.readInt();
		byte type = bf.readByte();
		System.out.println("length=" + length + ";type=" + type);
		byte[] req = new byte[bf.readableBytes()];
		String body = new String(req, "UTF-8");
		return body;
	}

}
