# 微信公众号服务
```yml
wx:
  mp:
    configs:
      - appId: 公众号的appid
        secret: 公众号的appsecret
        token: 接口配置里的Token值
        aesKey: 接口配置里的EncodingAESKey值
      - appId: 另一个公众号的appid，以下同上）
        secret: 
        token: 
        aesKey: 
1. 运行Java程序：`WxMpDemoApplication`；
2. 配置微信公众号中的接口地址：http://公网可访问域名/wx/portal/xxxxx （注意，xxxxx为对应公众号的appid值）；
3. 根据业务逻辑，修改具体的handler的实现，目前没啥逻辑。
```
