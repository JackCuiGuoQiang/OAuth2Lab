本工程是基于数据库的demo
《《《《认证服务》》》》

1. 获取授权码
http://127.0.0.1:8010/oauth/authorize?response_type=code&client_id=client

2. 获取令牌
通过 POST 请求利用授权码访问认证服务器获取令牌
端点：/oauth/token
http://client:secret@127.0.0.1:8010/oauth/token