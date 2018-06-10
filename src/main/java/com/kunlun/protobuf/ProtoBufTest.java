package com.kunlun.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * TODO:
 *
 * @author wangbinbin
 * @version 1.0.0
 * @date 2018/6/10 下午5:42
 */
public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        //构造对象
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setAge(10).setAddress("杭州").build();

        //转换字节码数组
        byte[] student2ByteArray = student.toByteArray();

        //反序列化
        DataInfo.Student student2 = DataInfo.Student.parseFrom(student2ByteArray);
        System.out.println(student2);

        System.out.println(student2.getName());
        System.out.println(student2.getAddress());
        System.out.println(student2.getAge());
    }
}
