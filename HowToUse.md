
## 准备条件
1. java运行环境，要求jre版本为8，其它版本不保证运行稳定
2. mysql数据库，并按项目代码中sql文件建立数据库

### 启动前配置
本程序所有配置均在application.yml
在打包前application.yml文件在项目目录的src/main/resources下
打包为jar包后，application.yml文件在压缩包目录的BOOT-INF/classes目录下
可使用解压包工具打开程序包，找到相应文件编辑后保存即可
### 以下为必须配置
1. mysql数据库配置
在application.yml中找到spring.datasource.url配置项，并按实际环境进行配置数据库名称
在application.yml中找到spring.datasource.username配置项，并按实际环境进行配置数据库用户名
在application.yml中找到spring.datasource.password配置项，并按实际环境进行配置数据库密码

### 启动程序
linux环境下使用如下命令
nohup java -jar XXXXXX-1.0-SNAPSHOT.jar &

### 查看日志
linux环境下使用如下命令
tail -f nohup.out

### 其它说明
程序启动后自动使用9527端口，如9527端口被占用或要修改为其它端口，只需修改application.yml文件并重新启动程序即可
