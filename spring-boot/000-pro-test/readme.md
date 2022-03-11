##学习说明
### jdk1.8 不能通过  @PropertySource 来加载对应的YML文件
### yml加载姿势
- 使用@Value注解进行加载属性(使用获取配置文件少量 无规律参数)
- 使用 **Environment**来进行加载配置文件属性  注入后  通过 **getProperty**进行获取
- 通过@PropertySource 来实现yml文件加载  实现原理 通过重写**DefaultPropertySourceFactory**类的 **createPropertySource**方法 利用**YamlPropertySourceLoader.load**方法实现
- 详解博文 [@PropertySource 注解实现读取 yml 文件](https://www.codercto.com/a/56233.html)

### properties 加载姿势
- 同上述yml   不同的是  jdk1.8 的@PropertySource可以读取文件.
- 重写 **DefaultPropertySourceFactory** 类的 **createPropertySource**方法 利用 **PropertiesPropertySourceLoader.load** 方法进行加载
