


ObjectMapper：把自定义的Java类，或者一个Jackson指定的树形结构生成为JSON文件。
Jackson JsonGenerator：每次只生成一组JSON数据。


Jackson包含一个core JAR，和两个依赖core JAR的JAR：
Jackson Core
Jackson Annotations
Jackson Databind









/**
 * 1.对象(集合)转换成json    jackson
 * 2.map转换成json          jackson               --推荐
 * 3.json转成对象           jackson
 * 4.json转成对象(集合)     jackson
 * 5.json转成map(集合)      jackson/alibaba        --推荐
 */