package com.towdog.binarywang.demo.wx.mp.handler;

import com.towdog.binarywang.demo.wx.mp.utils.JsonUtils;
import com.towdog.binarywang.demo.wx.mp.utils.WechatMessageUtil;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
public class MsgHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService wxMpService,
                                    WxSessionManager sessionManager) {
        return WechatMessageUtil.keywordReplyMsg("回复文本消息:" + wxMessage.getContent(), wxMessage.getMsgType(), wxMpService, wxMessage);

    }


}
