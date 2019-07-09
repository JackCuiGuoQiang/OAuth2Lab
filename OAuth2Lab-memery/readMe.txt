本工程是基于内存的demo



通过 GET 请求访问认证服务器获取授权码
端点：/oauth/authorize
访问：
http://127.0.0.1:8010/oauth/authorize?response_type=code&client_id=client&redirect_uri=http://www.baidu.com&scope=app
或者：
http://127.0.0.1:8010/oauth/authorize?response_type=code&client_id=client



通过 POST 请求利用授权码访问认证服务器获取令牌
端点：/oauth/token
http://client:secret@localhost:8010/oauth/token
请求方式: post
Content-Type: application/x-www-form-urlencoded
---
命令行请求方式：
curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'grant_type=authorization_code&code=EYnas6' "http://client:secret@localhost:8010/oauth/token"
 -H, --header LINE   Custom header to pass to server (H)
 -X POST 请求方式
 -d 需要向后端发送的数据
---
 响应{"access_token":"1a26c19c-5c57-40dc-a394-17a89b67a76a","token_type":"bearer","expires_in":41636,"scope":"app"}


