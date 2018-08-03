# web2dubbo
把web项目拆分成dubbo+zookeeper项目
1.服务的接口和pojo以及公共类放入api项目中，其他项目通过maven引用
2.控制器和web文件放入消费者项目
3.服务类及dao放入提供者项目
