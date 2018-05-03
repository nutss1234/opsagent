package com;

import com.apache.agent.protocal.protobuf.PersonEntity;
import com.apache.agent.protocal.protobuf.PersonEntity.Person;
import com.google.protobuf.InvalidProtocolBufferException;

public class ProtobufTest {

	public static void main(String[] args) throws InvalidProtocolBufferException {

		PersonEntity.Person.Builder builder = PersonEntity.Person.newBuilder();
		builder.setId(1);
		builder.setName("ant");
		builder.setEmail("ghb@soecode.com");
		PersonEntity.Person person = builder.build();
		System.out.println("before :" + person.toString());

		System.out.println("===========Person Byte==========");
		for (byte b : person.toByteArray()) {
			System.out.println(b);
		}
		System.out.println();
		System.out.println(person.toByteString());
		System.out.println("================================");

		// 模拟接收Byte[]，反序列化成Person类
		byte[] byteArray = person.toByteArray();
		Person p2 = Person.parseFrom(byteArray);
		System.out.println("after :" + p2.toString());
	}

}
