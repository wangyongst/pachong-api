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
address 地址 （主键）
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
name 渔场名称
id 渔场ID （主键）
owner 所有者（外键 -> user ） 
bind_status
bind_address 
sell_status 

方法
bind(address) 绑定游戏地址
unbind() 取消绑定
sell(start_price,stop_price,time) 出售
unsell() 取消出售

### market
字段
sell_id 出售ID
fishery_id 渔场ID
sell_status 出售状态
start_price 起始价格
stop_price 终止价格
sell_duration 售卖时长
sell_start_time 售卖开始时间
static_price 静态价格， 用于官方固定售价渔场的售卖
favor_count() 点赞数 

方法
buy() 购买渔场
favor() 赞

### opslog
字段
id 日志id
user 操作的用户
action 操作内容
txhash 
memo 备注
action_time 操作时间











