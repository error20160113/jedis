### 慕课网上 Redis入门代码  
### http://www.imooc.com/learn/839  
### 用maven管理项目更方便些  
  
### Redis 命令    
String  

* set [ket] [value] 赋值
* get [key] 取值  
* incr [key] 该key自增1
* decr [key] 该key自减1
* incrby [key] [X] 该key增X
* decrby [key] [X] 该key减X
* append [key] [X] 该key后拼接X  

Hash  

* hset [hashname] [key] [value] 给hashname中存入单个key-value键值对  
* hmset [hashname] [key0] [value0] [key1] [vaule1] [key2] [value2]... 给hashname中存入多个key-value键值对  
* hget [hashname] [key] 获取hashname的key的值
* hmget [hashname] [key0] [key1] [key2]...获取hashname的多个key的值  
* hgetall [hashname] 获取hashname的所有属性  
* hdel [hashname] [key] 删除hashname的key的值
* del [hashname] 删除整个集合  
* hincrby [hashname] [key] X 给hashname的key增加5  
* hexists [hashname] [key] 判断hashname的key是否存在  
* hlen [hashname] 获取hashname的属性的个数  
* hkeys [hashname] 获取hashname所有的key  
* hvals [hashname] 获取hashname所有的value  

List  
  
* 