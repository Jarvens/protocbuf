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
}
