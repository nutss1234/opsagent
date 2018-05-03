package com.apache.agent.protocal;

import java.util.HashMap;
import java.util.Map;

import com.apache.agent.protocal.impl.HeartBeatHandle;

public class ProtoHandleMap {

	static Map<Byte, ProtoHandle> ProtoHandleMap = new HashMap<Byte, ProtoHandle>();

	public static void init() {
		HeartBeatHandle heartBeatHandle = new HeartBeatHandle();
		ProtoHandleMap.put(heartBeatHandle.protoType(), heartBeatHandle);
	}

	public ProtoHandle returnProtoHandle(Byte type) {
		return ProtoHandleMap.get(type);
	}

}
