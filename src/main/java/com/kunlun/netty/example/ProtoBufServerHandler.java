package com.kunlun.netty.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * TODO:
 *
 * @author wangbinbin
 * @version 1.0.0
 * @date 2018/6/10 下午6:11
 */
public class ProtoBufServerHandler extends SimpleChannelInboundHandler<MyDataInfo.Student> {

    /**
     * 处理消息的读取
     *
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.Student msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getAge());
        System.out.println(msg.getAddress());

    }


}
