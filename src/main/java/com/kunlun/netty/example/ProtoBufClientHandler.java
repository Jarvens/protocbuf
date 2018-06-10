package com.kunlun.netty.example;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * TODO:
 *
 * @author wangbinbin
 * @version 1.0.0
 * @date 2018/6/10 下午6:22
 */
public class ProtoBufClientHandler extends SimpleChannelInboundHandler<MyDataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.Student msg) throws Exception {

    }

    /**
     * 连接处于活动状态  向服务端发送数据
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        MyDataInfo.Student student = MyDataInfo.Student.newBuilder().setName("李四").setAge(10).setAddress("杭州").build();
        ctx.writeAndFlush(student);
        super.channelActive(ctx);
    }
}
