# Springboot-Starter
前后端分离架构下 基于SpringBoot的后端接口快速开发脚手架

## 使用技术
1. Springboot 项目骨架
2. SpingJPA ORM数据框架，自动生成数据库表，包含数据库的简单CURD操作
3. Querydsl 增强JPA的功能 实现动态查询等复杂的数据库操作
4. hutool java工具类库 优化代码实现
5. jwt 实现前后端token验证

## 启动方式
打开项目等待maven依赖下载完毕，由于Querydsl的插件还没有生成Qentity查询类，会有很多报错，不用慌

此时右键项目->Maven->Generate source and update folder，会运行maven插件生成Querydsl需要的Qentity类

接下来配置项目

1. 修改 application-dev.yml 确认数据库的名称、用户名和密码正确 
2. 根据需要修改 application.yml 中的全局配置 例如端口号
3. 运行项目 系统会自动在配置的数据库下生成数据表
