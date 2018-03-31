# fish-one-api

## 后端原型设计

### 模块
1. user 用户模块
2. fishery 渔场模块
3. market 集市模块
4. opslog 操作日志模块
5. refer 推荐模块

### user 
字段
address 地址
sign_message 签名信息
signed_message 签名后的信息
nick_name 昵称
avatar 头像
refer_code 推荐码

方法
registy(address, sign_message, signed_message） 注册， 提交签名信息，并在后端做验证
set_nick_name(new_nick_name） 设置昵称
set_avatar(avatar_image) 设置头像
get_refer_url() 获取推荐码

### fishery
字段



