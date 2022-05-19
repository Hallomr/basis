#### JAVAEE

### 一，HTML

```
结构、表现、行为相分离：
html：用于展示网页的基本信息-结构；
css：用于渲染美化页面-表现；
js：动态交互，表单验证-行为
```

#### 1.HTML基本语法

1.基本结构

​	根 html    头 head   体  body

2.html的标签（块级标签：p、h1~h6 占一行且自动换行，行内标签：一个标签不会占一行）

```
文本标签
	标题：h1~h6  属性：align：（left、center、right）
	段落：p        字体：font 属性：color、size
	br 换行  hr 水平线  b加粗  i 斜体
```

```
列表标签：
	无序列表：ul 每一项是平级关系没有先后顺序
	有序列表：ol 例如：编程语言的排行榜
	li 用于在ul或ol中定义列表项
```

```
图片超链接标签
	<img> 属性 src：图片路径  title：当光标移入显示图片说明 
	alt：图片加载失败显示说明信息 width、height/设置图片宽高 
	border：设置图片边框
```

```
超链接 
	<a>属性：href 超链接的目标地址  
	target 属性值：_self 在当前窗口打开，会覆盖当前窗口 _blank 在新窗口打开
```

```
锚链接
	1.可以在同一页面跳转到指定的位置
	2.在不同页面中，通过一个页面跳转到指定页面的指定位置
	如何实现：
		1.设置锚点 通常给一个标签添加一个id
		2.通过a标签实现跳转
		<a href="#id"></a>  <a href="页面名称.html#id"></a>
```

```
表格
	table 属性：border 边框、  width 表格的宽度、 bgColor 背景颜色、
    align 设置表格对齐方式、 cellpadding 设置内容和单元格的间距
    cellspacing 设置单元格和单元格的间距
    tr 用于定义行  属性：bgcolor align
    td 用于定义单元格 属性：colspan、rowspan
    th 用于定义表头
    caption 用于定义表的说明，出现在表格的上方
```

```
表单
	表单域:form 属性:action method
    表单控件: 
    input 属性:type(text/文本输入框 password/密码框 radio/单选框 checkbox/多选框（checked属性）   	  file/文件上传 hidden/隐藏 submit/提交 image/图片按钮 button/普通按钮 reset/重置)
    textarea 文本域
    select option 下拉列表（option属性selected设置选中）
```

```
表单的数据提交：
	一：设置提交按钮<input type="submit" value="注册" />
	二：设置form表单域的action属性
	三：每个表单空间添加name属性，给无法输出的表单空间设置value默认值
```

#### 2.CSS

1. ```
   html引入css代码方式：（内联样式优先级>外部样式）
               方式一: 
               内联样式(行内样式)
               直接在html的标签中. 通过添加style属性. 在该属性中,添加css 代码. 
               方式二: 
               内部样式表. 
               在html的head标签中,定义一个标签 style . 在该标签内,定义css的代码. 
               <head> <style> css代码;  </style> </head>
               	也不太推荐.(复用性) 表现和结构分离不够彻底
               方式三: 
                   外部样式表. 
                   1. 将css 代码定义在外部的css 文件中. 后缀名修改为.css 即可. 
                   2. 在html 页面中,通过link 标签,引入外部样式表. 
                   如何引入: 
                   <link href="xxx.css" rel="stylesheet" type="text/css"> 
   css选择器（id选择器>类选择器>标签选择器）：
   		  1. 通配符选择器 *{css属性名：css属性值}
             2. 标签选择器 标签名{css属性名：css属性值}
             3. 类选择器 .类名{css属性名：css属性值}
             4. id选择器 #id名{css属性名：css属性值}
             5. 属性选择器 标签名[属性名]{css属性名：css属性值}
             6. 关系选择器 祖先标签 后代标签{css属性名：css属性值}
             7. 其他的... 
   块级标签和行级标签：
   			1.块级标签：p、div、h1~h6
   			2.行级标签：span、a
   			块级标签：浮动属性 float：right、left，
   			设置浮动后要清除浮动：通过添加一个空div设置其属性为clear：both
   div盒子模型
   ```


#### 3.JS

```
js的三种引入方式：行内脚本、内部脚本(<script type="text/javascript">)、
外部脚本（<script src=""></script>）
js变量声明：var 变量名=变量值
js五种数据类型：number、string、boolean、null、undefine
js数据类型转换：number转string toString（）、string转number parseInt（）parseFloat（）
var boolean = new Boolean（var string）/new Boolean(var number) 空字符串为false非空字符串为true，零为false非零为true
js中==与===运算符：==比较数值大小、===比较数值大小和类型
js的for循环和for in循环
js的函数声明：1、function 函数名（参数）{函数体} 2、function（参数）{函数体} 
js中常见的事件：onclick（）、onmouseover（）、onmouseout（）onchange、onload
```

```
Browser对象：Navigator对象、history对象、window对象、location对象
window对象的三种弹框：警告框alert()、确认框confirm()返回值为boolean、输入框prompt()返回值为输入内容
window对象的两种定时器：1、setTimeout(参数1-执行的任务：匿名函数function（）{},参数2-执行该任务的时间间隔)；2、setInterval（参数1-执行的任务：匿名函数function（）{},参数2-执行该任务的时间间隔）有返回值，取消该定时器的循环调用clearInterval（参数：setInterval的返回id值）
location对象：location.href(url)
轮播图的实现：通过setInterval（function（）{修改img标签的src值}，time），可以将图片地址放入一个定义好的数组中，从数组中获取
document.getElementById(id)通过id获取标签对象，通过innerHTML设置标签体的内容（注意innerHTML和innerText的区别）
```

```
js的dom树分三部分：标签、属性、文本，通过document获取并操作dom树的标签、属性、文本
获取标签：document.getElementById(id)
根据标签名获取所有的标签：document.getElementsByTagName(tagname),返回值是数组
根据标签name属性找到标签：document.getElementsByName(name)
获取标签的属性值：标签对象.getAttribute(属性名)
设置标签的属性：标签对象.setAttribute(属性名,属性值)
判断标签是否有子节点：hasChildNodes（）
移除子标签：父标签对象.removeChild(子标签对象)，标签对象.remove()
替换子标签：父标签对象.replaceChild(替换子标签对象，被替换子标签对象)
创建标签：document.createElement（标签名）
添加标签：父标签对象.appendChild(标签对象)
多选框反选功能实现：方案一：获取多选框对象遍历出每个子选框的选中状态取非值；方案二：获取多选框对象遍历出每个子选框对象调用click()方法
js的内置对象：string对象(charAt、indexof、split、substring、substr)、数组对象、date对象（gettime）、Math对象（ceil、floor、abs、round、max）
省市联动案例实现
```

#### 4.jQuery

```
为了区分jQuery对象和js对象通常给jQuery对象命名的时候加$符号；所有的jQuery对象都是一个数组，数组中的元素是js对象（通过jQuery选择器找到的对象都是jQuery对象，其他对象都是js对象，this是js对象）
jQuery的三种选择器（获取标签对象）：id选择器：var $idObject = $("#idName")；class选择器：
var $classObject = $(".className")；标签选择器：var $tagObject = $("标签名")
jQuery文档加载完毕事件：$(function(){加载完毕后要做的内容})，window.onload窗体加载事件只能执行一次，文档加载事件可以执行多次并且比窗体加载完毕事件先执行
jQuery获取表单项的value属性通过标签对象.val()方法
jQuery与js对象的转换：遍历jQuery对象数组元素可获取js对象，js对象转jQuery对象通过$(js对象)
jQuery的事件：$("#idName").mouseover(function(){})、.mouseout(function(){})
jQuery对象通过.css()方法设置css样式
jQuery绑定多个事件：.bind({click：function（）{}，mouseover：function（）{}})
jQuery的效果函数：.show()、.hide（）、.toggle() 效果函数的入参可以是回调函数
jQuery的其他选择器：
层级选择器：- $("A B"),找到A元素下面的所有B元素
		   - $("A>B"),找到A元素下面的所有子B元素
		   - $("A+B"),找到和A同级的第一个B元素
 	 	   - $("A~B"),找到和A同级的所有B元素
基本过滤选择器：- $(标签元素:first)
				- $(标签元素:last)
				- $(标签元素:even)
				- $(标签元素:odd)
				- $(标签元素:eq(index))
				- $(标签元素:gt(index))
属性选择器、表单选择器、表单属性选择器
jQuery的属性操作：
1、操作html属性（直接写在html标签上的属性）：
	val()方法只能获取和设置表单项标签的value属性；
	attr()方法可以获取或者设置任意属性，但是不适用于属性值类型为boolean类型的属性；
	prop()方法只能获取和设置标签内置属性，并且适合用于属性值类型为boolean类型的属性
2、操作css属性（写在style里面的属性）：css()方法适用于设置css属性
jQuery事件：hover()方法，相当于mouseover和mouseout事件的结合
jQuery操作对象的值：
	val()，应用在获取和设置表单中的标签的value属性；
	html()，应用在获取和设置非空标签的标签体中的html内容
	text(),应用在获取和设置非空标签的标签体中的文本内容
jQuery遍历：
	- $(".class").each(function(i,o){})
	- $.each(数组，function(i,o){})
 	 	- i表示遍历到的各个对象的下标
  		- o表示遍历到的各个对象
jQuery文档操作：
	- A.append(B):将B插入到A标签的内部的后面
	- A.prepend(B):将B插入到A标签内部的前面
	- A.appendTo(B):将A插入B标签的内部的后面
	- A.prependTo(B):将A插入B标签内部的前面
	- A.insertBefore(B):将A添加到B的前面
	- A.insertAfter(B):将A添加到B的后面
	
jQuery validate做表单校验
frameset标签
```

#### 5.BootStrap

```
BootStrap开发响应式页面，实现在PC端，Pad端，和手机端页面正常浏览
BootStrap布局容器：.container .container-fluid
BootStrap的栅格系统：
    * 设备的分辨率大于 1200 使用lg样式
    * 设备的分辨率大于 992 < 1200 使用md样式
    * 设备的分辨率大于768 < 992 使用sm样式
    * 设备的分辨率小于 768 使用xs样式
	将页面一行分成12列，定义div元素 样式的和为12 即可（每个div都再可分为12列）.

```

#### 6.Ajax

```
通过创建xmlhttprequest对象异步发送请求，可以不用重新加载页面
```

#### 7.easyUI

### 二，JAVAWEB

#### 1.HTTP&Tomcat

```
http常见响应状态码:200-请求成功、302-重定向、400-请求语法错误、403-拒绝访问、404-资源未找到、500-服务器异常
get请求：请求行、请求头 响应：响应行、响应头、响应体
post请求：请求行、请求头、请求体 
c/s架构：客户端/服务端架构 b/s架构：浏览器端/服务端架构
web资源：放在服务器上的资源 
静态资源：无论什么情况，只要访问路径一样，显示的内容不变
动态资源：根据访问用户、访问时间、访问条件显示动态资源
服务器：数据库服务器（存储数据）、应用服务器（发布应用）：tomcat
tomcat安装：解压配置java_home、catalina_home环境变量
tomcat项目路径配置两种方式
解决端口被占用问题 netstat -ano|findstr "端口" taskkill /pid "端口" /f
url和uri的区别
```

#### 2.mysql

```
建库语句：create database 数据库名 character set 字符集 collate 校对规则
查看数据库：show databases
删除数据库：drop database 数据库名
进入数据库：use 数据库名

创建表：create table 表名（字段名 数据类型 约束，...）
修改表：
      修改表的字段：alter table 表名 add 字段 数据类型 约束，
       alter table 表名 modify 字段 数据类型 约束
       alter table 表名 change 旧字段 新字段 数据类型 约束
       alter table 表名 drop 字段
       修改表名：rename table 旧表名 to 新表名
删除表：drop table 表名
查看表：show tables
数据类型：
		数值类型：boolean、int、bigint（对应java中的long）、float、double等
		文本类型：char（固定长度：一般传入数据字符串长度固定使用）、
		varchar（可变长度）等
		日期类型：date（年月日）、datetime（年月日时分秒）、timestamp
约束种类：not null（非空）、unique（唯一）、primary key（主键：非空+唯一，一般id字段使用）、auto_increment(自增长，一定配合主键使用)

表数据操作：
insert into 表名(字段1，字段2，字段3...)values(值1，值2，值3...)指定字段插入数据
insert into 表名 values（值1，值2，值3...）
update 表名 set 字段名=值，字段名=值...where 条件
delete from 表名 where 条件/truncate table 表名 删除所有数据并创建一张一模一样的新表
select查询：
		distinct和group by用法：一般distinct用来查询不重复记录的条数，如果要查询不重复的记录，有时			候可以用group by  https://www.cnblogs.com/shiluoliming/p/6604407.html
        运算查询(+,-,*,/等)    （注意：只是展示出来的时候做了运算，实际表中的数据没变）
        条件查询：between ..and ..,in(值1，值2，值3..),like(模糊查询，与%和_通配符一起使用，
        %表示0-n位，_表示1位)、and、or、not
        排序查询：order by 字段名 asc/desc,字段名 asc/desc.. 排序放在查询语句最后
        聚合函数：count（*）/count(字段名)、sum（字段名）、max(字段名)、min()、avg() 
        注意：聚合函数不能用于where条件中
        分组查询：group by 字段名(分组查询一般用于统计每组的个数、总价、最值等等，一般结合聚合函数使			用：聚合函数前写得字段名必须是用于分组的字段名) 
        where和having的区别
		- 1.having是在分组后对数据进行过滤.where是在分组前对数据进行过滤
		- 2.having后面可以使用聚合函数，where后面不可以使用聚合函数
		- 3.having后面的条件中只能出现前面select后出现过的字段名或者是与分组有关的聚合函数

了解mysql拆表：https://www.cnblogs.com/sns007/p/5790838.html
表与表之间的关系:外键约束维护数据的完整和一致性（注意:外键一定指向主键，外键的数据类型和主键一致）
- 添加外键的语句:alter table 表 add [CONSTRAINT 外键约束名] foreign key(字段) references 表(字段);
- 删除外键的语句:alter table 表名 drop foreign key 外键约束名
多表之间的关系：一对多--多的一方的表添加外键约束指向一的一方的主键
			  多对多--表之间存在多对多关系：创建一张第三方表，这张表除了自身主键外至少包含两个字段作为				  外键分别指向各自的主键
			  一对一--先当做一对多，在外键字段添加唯一约束。
多表查询:
		隐式内连接查询:select * from a, b where 连接条件(只查询出满足条件的数据)
		显式内连接查询:select * from a [inner] join b on 连接条件 where 其它条件(显式内连接与隐式内			连接查询效果一样)
		外连接查询：显示主表的所有数据，从表只显示符合条件的数据，从表中不符合条件的数据显示为null
		左外连接查询:以join左边的表为主表 select *from a表 left [outer] join b表 on 条件
		右外连接查询:以join右边的表为主表 select *from a表 right[outer] join b表 on 条件
		子查询：子查询就是嵌套查询，即一个select语句中包含另一个完整的select语句
		联合查询:
		- UNION：用于合并两个或多个 SELECT 语句的结果集，并消去表中任何重复行。UNION 内部的 SELECT 语		 句必须拥有相同数量的列，列也必须拥有相似的数据类型。
 		- UNION ALL：不去除重复记录，其它的和union一样
 分页查询:
 		- limit a,b;       
		- a:从哪个下标开始查(从0开始计数的) 
		- b:查询多少个数据，前端入参一页显示数据的数量    
  		a = (curPage-1)*b；// 前端入参curPage当前页数，b表示每页显示的数据条数

```

#### 3.JDBC

```
JDBC:sun公司为了简化和统一java连接数据库,定义的一套规范(API)
不同数据库的数据库驱动(jar包)不同，JDBC与数据库驱动的关系：接口（JDBC）与实现类(数据库驱动)的关系
JDBC编程:
public static void main (string[] args)throws sqlexception{
  //注册驱动
  //DriverManager.registerDriver(new Driver());//不建议
  //由于Driver类中的静态代码块存在DriverManager.registerDriver(new Driver())，所以驱动注册了两次
  Class.forName("com.mysql.jdbc.Driver");
  //com.mysql.jdbc.Driver:Driver类的全限定名，class.forName：获取字节码文件对象，作用是要求JVM查找并	//加载指定的类，也就是说JVM会执行该类的静态代码块
  //获取数据库连接对象
  String url = "jdbc:mysql://localhost:3306/crm";（jdbc:mysql表示协议 localhost本机虚拟域名/ip      	3306端口号/进程 crm访问资源地址）
  String userName = "root";
  String passWord = "123";
  Connection connection = DriverManager.getConnection(url,userName,passWord);
  //创建sql执行对象  preparedStatement对象可以对参数化的sql进行预编译（确定sql语句的结构），
  参数化sql指入参使用?占位符代替
  //Statement statement = connection.createStatement();存在sql注入问题
   String sql = "select * from sys_user where user_name= ? and user_password = ? ";
   PreparedStatement preparedStatement = connection.prepareStatement(sql);
  //执行sql
  preparedStatement.setString(1,username);
  preparedStatement.setString(2,password);
  ResultSet resultSet = preparedStatement.executeQuery();
  //String sql = "select * from book";
  //ResultSet resultSet = statement.executeQuery(sql);//executeQuery查询方法，
  //executeUpdate增删改方法
  //获取结果集内容
  while(resultSet.next){
    resultSet.getObject(1);
    resultSet.getObject(2);
  }
  //关闭资源
  if(resultSet != null){
		resultSet.close();
  }
  if(statement  != null){
		statement .close();
  }
  if(connection != null){
		connection.close();
  }
}

Junit单元测试：了解http://www.cnblogs.com/qiyexue/p/6822791.html
断言：了解https://www.cnblogs.com/hujingwei/p/5147236.html
System.out.println()打印一个对象，如果对象没有重写toString方法则会打印Object类中的toString方法

注意：非静态成员变量是属于对象的属性，静态方法是类的方法，类的生命周期和对象的生命周期不一样，所以静态方法只能访问静态成员变量。了解：https://blog.csdn.net/yanliguoyifang/article/details/80964237
静态代码块的执行：静态代码块随着类的加载而执行，且只执行一次。了解：https://www.cnblogs.com/ibelieve618/p/6403573.html
构造代码块：直接在类中定义且没有加static关键字的代码块{}称为构造代码块。构造代码块在创建对象时被调用，每次创建对象都会被调用，并且构造代码块的执行次序优先于类构造函数。

硬编码：将字符串等等需要使用的常量定义在类中，可以使用配置文件来解决硬编码问题，
配置文件：xml和properties文件 
使用java代码读取配置文件：
public static void main(String[] args)  {
        java.util.Properties properties = new java.util.Properties();
        try {
            InputStream inputStream = new FileInputStream("src/demo.properties");
            //方案二：通过类加载器将资源文件转化成流InputStream inputStream = //Properties.class.getClassLoader().getResourceAsStream("demo.properties");
            //方案三:使用java.util.ResourceBundle
            //ResourceBundle bundle = ResourceBundle.getBundle("demo");
            //String username = bundle.getString("username");
            properties.load(inputStream);
            String username = properties.getProperty("username");
            System.out.println(username);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
springboot读取配置文件数据：https://blog.csdn.net/dkbnull/article/details/81953190
面向对象的设计原则：了解https://www.cnblogs.com/lipeineng/p/5916345.html
```

#### 4.连接池

```
为什么要使用连接池：- Connection对象在JDBC使用的时候就会去创建一个对象,使用结束以后就会将这个对象给销毁了.每次创建和销毁对象都是耗时操作.需要使用连接池对其进行优化.程序初始化的时候，初始化多个连接,将多个连接放入到池(集合)中.每次获取的时候,都可以直接从连接池中进行获取.使用结束以后,将连接归还到池中.

连接池原理：在静态代码块中创建connection连接对象，将一定数量的连接对象存入LinkedList集合中，Dao层获取数据库连接从连接池获取，调用linkedlist.removeFirst()从集合头部取连接，使用完连接后调用linkedlist.addLast()从集合尾部放回（当集合中连接对象不存在时等待连接对象放回再取，等待超时则创建新的连接对象返回）

装饰者模式（包装模式）：了解https://www.cnblogs.com/aspirant/p/9457090.html
目的：改写已存在类的某些方法
条件：包装类和被包装类要实现同一个接口；包装类通过被包装类的引用实现被包装类的功能
步骤：编写一个包装类实现被包装类相同的接口，定义一个被包装类的引用，通过重载包装类的构造方法给引用赋值，对于不需要改写的方法通过引用调用被包装类的原有方法，对于需要改写的方法自己写代码。

Java为数据库连接池提供了公共的接口：javax.sql.DataSource，各个厂商需要让自己的连接池实现这个接口。

常见的连接池：Druid、C3P0、DBCP
以Druid连接池为例：
	硬编码
		//创建一个DruidDataSource()对象
		DruidDataSource dataSource = new DruidDataSource();
		//设置用户名
		dataSource.setUsername("root");
		//设置密码
		dataSource.setPassword("123");
		//设置驱动类名
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		//设置初始化连接数
		dataSource.setInitialSize(10);
		//获得连接
		Connection connection = dataSource.getConnection();
	加载配置文件：
		Properties properties = new Properties();
		//加载配置文件
		properties.load(new FileInputStream("src/druidconfig.properties"));
		//创建使用连接池工厂创建连接池
		DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
		//获得连接
		Connection connection = dataSource.getConnection();
		
DBUtils就是JDBC的简化开发工具包
```

#### 5.XML&反射

```
xml文件作用：配置文件，数据传输
xml语法：有且仅有一个根标签；标签不能以数字开头且区分大小写；标签必须闭合；标签中的属性必须使用引号
<![CDATA[数据内容]]> CDATA里面的数据内容原样展示
xml约束：dtd约束、schema约束
dom4j是一个Java的XML API，用来读写XML文件的。


反射的作用：
- 在运行时判断任意一个对象所属的类（判断connection对象，所属的类）
- 在运行时构造任意一个类的对象(不用new，直接使用字节码文件对象就能给你创建对象)
- 在运行时判断任意一个类所具有的成员变量和方法
- 在运行时调用任意一个对象的方法。通过暴力反射甚至可以调用到private方法。
- 生成动态代理(代理模式中的一种)

获取字节码文件对象的三种方式：对象.getClass()、类名.class、Class.forName("全限定名")
反射创建对象：
			通过无参构造创建：字节码文件对象.newInstance();
			通过有参构造创建：字节码文件对象.getConstructor(参数类型的Class对象)获取constructor对象，
			constructor对象调用newInstance(参数)生成对象
通过class对象操作成员变量：
			public Field[] getFields() - 返回此 Class对象所表示的实体的所有公共属性。 
			字节码文件对象.getFields()得到Field[]数组 forEach遍历Field[]数组获取Field对象，
			field.get(实例对象)获取该对象的属性值，field.set(实例对象，value)设置该对象的属性值
			
使用反射操作私有成员变量：
			字节码文件对象.getDeclaredFields()获取Field[]数组，forEach遍历Field[]数组获取Field对				象，field.getMOdifiers()获取当前变量的权限修饰符，判断该修饰符是否为private，私有变量采用			  暴力反射field.setAccessible(true),再调用get、set方法操作成员变量
使用反射调用方法：
			字节码文件对象.getMethod(方法名，方法参数类型的class对象)获取method对象
			method.invoke(Object o,Object... args)
			- o是调用该方法的对象,args是调用该方法时传入的参数
			
内省机制：通过反射的方式操作JavaBean的属性，jdk提供了PropertyDescription类来操作访问JavaBean的属性
```

#### 6.Servlet

```
Servlet是运行在服务端的Java小程序，是sun公司提供的一套用于处理客户端请求以及响应给浏览器(客户端)动态资源的规范(接口)。
Servlet编程：实现Servlet接口 
Servlet的作用：获取客户端的请求、处理请求、响应客户端、请求重定向和转发
Servlet的实现：
是在web.xml文件中找到要访问资源类的全限定名（<servlet-class>com.zwx.servlet.ServletDemo</servlet-class>）通过反射调用init、service、destory方法

init()方法中，可以做一些全局参数的初始化。
service()方法中，可以接收和处理请求，及对请求做出响应。
destroy()方法中，可以做一些资源的回收和释放。做数据的保存

Servlet的生命周期：
Servlet创建(初始化):第一次有请求到达这个Servlet的时候初始化，调用init方法
Servlet什么时候销毁:服务器关闭或者项目移除的时候就销毁，调用destory方法
Servlet初始化可以在服务器运行的时候进行初始化：
添加配置<load-on-startup>3</load-on-startup>数字越小，启动时机就越早，一般建议从3开始写

通常针对http协议可以继承HttpServlet方法，运行流程：
客户端访问http://loclahost:8080/CommonServlet/demo，
服务器端：1. 必然会找到ServletDemo02类
		2. 执行service方法，但是很抱歉，这个类没有这个方法。
		3. 执行父类的servcie方法  service(ServletRequest  , ServletResponse)
		4. 在父类的service方法中，对请求方式进行判定， 如果是Get方式，调用doGet ， 如果是post方式，那么调用doPost
		5. HttpServlet 里面定义有doGet 和 doPost ,  但是我们的子类也复写了这两个方法。 所以在service里调用的doGet 和 doPost ，其实走的是子类的方法。（两个方法的入参为HttpServletRequest、HttpServletResponse，通过HttpServletRequest.getParameter获取请求传入的参数，通过HttpServletResponse.getWriter()获取PrintWriter输出流响应请求）

多态执行：了解https://blog.csdn.net/foreverhuylee/article/details/21278311

tomcat中也存在web.xml文件说明tomcat也是一个web项目，查看如下配置：
	<servlet>
        <servlet-name>default</servlet-name>
        <servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
        <init-param>
            <param-name>debug</param-name>
            <param-value>0</param-value>
        </init-param>
        <init-param>
            <param-name>listings</param-name>
            <param-value>false</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>default</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
   注意查看DefaultServlet类，这个类给web应用做资源请求服务的，用于静态资源html展示，当提交一个请求时，DefaultServlet接受到请求，根据请求资源路径找到html资源文件通过输出流的形式到客户端展示，所以DefaultServlet的初始化优先级最高 <load-on-startup>1</load-on-startup>
   
Servlet映射配置 url-pattern的三种方式：
1.以全路径匹配方式  以 / 打头  /demo
2.以目录匹配方式  以 / 打头， 以 * 结尾 /demo/*
3.以后缀名方式  以 * 打头 *.avi
```

#### 7.ServletContext&Response&Request

```
ServletContext官方叫servlet上下文。服务器会为每一个工程创建一个对象，这个对象就是ServletContext对象。这个对象全局唯一，而且工程内部的所有servlet都共享这个对象。所以叫全局应用程序共享对象。 
servletContext作用：1、获取全局初始化参数；2、作为域对象存值/取值；3、获取项目路径
4、读取资源文件

response.getoutputstream()获取字节输出流，用于输出字符串、二进制文件等
response.getwrite()获取字符输出流，用于输出字符串
response解决中文乱码问题：
response.setContentType("text/html;charset=utf-8");

request作为域对象存值/取值,在服务器端使用请求转发实现request域对象的数据共享
```

#### 8.Cookie&Session

```
cookie:用于存放在客户端的数据；应用场景：记住用户名、密码登录
cookie的默认有效期是一次会话，浏览器关闭会话结束

session:
HttpSession session = req.getSession()原理：判断请求中是否有一个名为“JSESSIONID”的cookie，如果没有，则新创建一个cookie并且将Session的id作为cookie存放到客户端。如果请求中有这个名为“JSESSIONID”的cookie，就直接根据这个id找到已有的session对象。
生命周期：会话超时(默认闲置30分钟),服务器关闭,调用invalidate()方法
```

#### 9.数据库事物

```
ThreadLocal:在同一个线程中，一个ThreadLocal对象只能存放一个value。ThreadLocal类中维护了一个map，并且该map的key固定为当前线程
事故四大特性：原子性、隔离性、持久性、一致性
不考虑事物隔离性会导致：脏读、不可重复读、虚读
数据库隔离级别：read uncommitted、read committed（oracle默认隔离级别）、repeatable read（mysql默认隔离级别）、serializable
```

#### 10.Listener

```
javaweb的监听器：监听servletcontext、httpsession、servletrequest三个域对象状态变化
一类：监听三个域对象的创建和销毁
servletcontextlistener:监听servletcontext创建和销毁的监听器
httpsessionlistener：监听session对象创建和销毁的监听器
servletrequestlistener：监听request对象创建和销毁的监听器
二类：监听三个域对象的属性变更的监听器
servletcontextattributelistener、servletrequestattributelistener、httpsessionattributelistener
三类：监听httpsession对象中的javabean的状态的改变
httpsessionbindinglistener、httpsessionactivationlistener
```

#### 11.邮件协议

```
SMTP协议－发邮件协议  - 端口号：25.
- 全称为Simple Mail Transfer Protocol（简单邮件传输协议），它定义了邮件客户端软件与SMTP服务器之间、以及两台SMTP服务器之间的通讯规则。

POP3协议－收邮件协议 - 端口号：110.
- 全称为Post Office Protocol（邮局协议），它定义了邮件客户端软件与POP3服务器的通讯规则。
```

#### 12.Filter

```
Filter：一个实现了特殊接口(Filter)的Java类.实现对请求资源(jsp,servlet,html,)的过滤的功能.
过滤器是一个运行在服务器中的程序,优先于Servlet和jsp之前执行. 过滤器是javaweb技术中最为实用的技术之一.
应用场景：放行或拦截前做附加操作；自动登录,使用装饰者模式统一解决网站乱码,过滤敏感字符...   
生命周期描述:
	在服务器启动的时候,服务器创建filter的对象,调用init方法实现初始化操作
	每当请求来的该Filter的时候时候,执行dofilter方法,实现过滤的逻辑
	当服务器移除项目的时候或者服务器正常关闭的时候,服务器销毁Filter调用filter的destroy()方法
FilterChain过滤器链作用：当一个filter收到请求的时候,调用chain.doFilter才可以访问下一个匹配的filter,若当前的filter是最后一个filter,调用chain.doFilter才能访问目标资源
```

#### 14.自定义注解

```
元注解：@Target 定义该注解作用范围；@Retention:定义该注解保留到代码的哪个阶段
注解解析：使用反射
java.lang.reflect.AnnotatedElement
- T getAnnotation(Class<T>annotationType):得到指定类型的注解引用(对象)。没有返回null。
- Annotation[] getAnnotations()：得到所有的注解，包含从父类继承下来的。
- Annotation[] getDeclaredAnnotations()：得到所有注解不包含父类继承过来的。
- boolean isAnnotationPresent(Class<?extends Annotation> annotationType)：判断指定的注解有没有。
  Class、Method、Field、Constructor等实现了AnnotatedElement接口.
```

#### 14.类加载器

```
Bootstrapclassloader：它用来加载 Java 的核心类（加载jdk中的类），是用原生代码来实现的，并不继承自 java.lang.ClassLoader（负责加载$JAVA_HOME中jre/lib/rt.jar里所有的class，由C++实现，不是ClassLoader子类）
extensionsclassloader：它负责加载JRE的扩展目录，lib/ext或者由java.ext.dirs系统属性指定的目录中的JAR包的类（项目导入jar包的类）。由Java语言实现，父类加载器为null
appclassloader：被称为系统（也称为应用）类加载器，它负责在JVM启动时加载来自Java命令的-classpath选项、java.class.path系统属性，或者CLASSPATH换将变量所指定的JAR包和类路径。程序可以通过ClassLoader的静态方法getSystemClassLoader()来获取系统类加载器。如果没有特别指定，则用户自定义的类加载器都以此类加载器作为父加载器。由Java语言实现，父类加载器为ExtensionsClassLoader。

JVM的类加载机制主要有如下3种：
全盘负责：所谓全盘负责，就是当一个类加载器负责加载某个Class时，该Class所依赖和引用其他Class也将由该类加载器负责载入，除非显示使用另外一个类加载器来载入。
双亲委派：所谓的双亲委派，则是先让父类加载器试图加载该Class，只有在父类加载器无法加载该类时才尝试从自己的类路径中加载该类。通俗的讲，就是某个特定的类加载器在接到加载类的请求时，首先将加载任务委托给父加载器，依次递归，如果父加载器可以完成类加载任务，就成功返回；只有父加载器无法完成此加载任务时，才自己去加载。
缓存机制：缓存机制将会保证所有加载过的Class都会被缓存，当程序中需要使用某个Class时，类加载器先从缓存区中搜寻该Class，只有当缓存区中不存在该Class对象时，系统才会读取该类对应的二进制数据，并将其转换成Class对象，存入缓冲区中。这就是为什么修改了Class后，必须重新启动JVM，程序所做的修改才会生效的原因。

```

#### 15.linux

``` 
切换目录命令cd(change directory)：
	cd app	切换到app目录
	cd ..         切换到上一层目录
	cd /          切换到系统根目录
	cd ~    	 切换到用户主目录(回到超级管理员的家)
	cd -           切换到上一个所在目录(上一个操作的)
列出文件列表的命令 ls ll dir：
	ls		展示当前目录下资源（不包含隐藏的文件）
	ls -a		显示当前目录的所有文件或目录（包含隐藏的文件）, 文件带点的是隐藏文件
	ls -l  	展示所有文件(不包含隐藏文件)的详细信息,  可以简写成 ll
	ll -h		在ll的基础上友好显示文件大小()
	ls -al	展示文件的详细信息（包含隐藏的文件）,可以简写成"ll -a"
	ll -ah       展示文件的详细信息（包含隐藏的文件）,并友好显示文件大小
创建目录和移除目录mkdir rmdir：
	mkdir app 在当前目录下创建app目录
	mkdir –p app2/test  创建一个目录app2并且在app2目录中再创建一个test目录
	rmdir app   删除app目录
pwd:打印当前工作的目录
文件浏览(cat、more、less、 tai)：
	cat install.log    查看install.log的内容	
	more install.log 分页查看。最开始是显示一页内容，然后按空格键显示下一页。回车显示下一行内容(逐行查	  看)。按 q 或者(Control+c)键退出查看。
	less install.log  - 用法和more类似，不同的是less可以通过PgUp、PgDn键来控制上下翻页。按q就退出查看
	tail -n 文件名:查看文件的末尾几行； tail -f 文件名**:滚动的查看文件. 查看tomcat的日志
touch 文件名 创建空文件
cp -r 目录 新目录:递归复制目录
mv 文件 目录/文件名:移动到指定目录且重命名
rm -f 文件 不询问，直接删除；rm -r 目录 删除目录(递归删除)；rm -rf 目录; 不询问递归删除

vi编辑器
- 打开文件：vi file  ,处在命令模式
- 命令模式下，不能编辑文件，要切换到编辑模式才能编辑
  - 按i,可以从命令模式进入编辑模式
  - 命令模式常用的快捷键
    - yy:复制当前行
    - p:粘贴
    - dd:删除当前行
-在编辑模式下，只能编辑，不能保存和退出。要切换到"底行模式"才能保存和退出
	- 1.不能从编辑模式直接进入底行模式，只能从命令模式进入底行模式，所以在编辑模式下要先按"Esc"键进入命	令模式。
	- 2.在命令模式下，按"shift+:"进入底行模式
-在底行模式下，有如下命令行
	- 1.wq    保存并退出(一般情况下都是使用这个)
	- 2.q        退出
	- 3.q!       强制退出(出异常了就可以使用强制退出)

打包：
	tar包：tar -cvf demo.tar *.txt；zip包：tar -zcvf all.zip a.txt b.txt；
解包：
	tar -xvf 文件包 -C 目录   解tar包到指定目录; tar -zxvf 文件包 -C 目录   解zip包到指定目录;


ifconfig:查看当前网卡信息；
ping:检查网络是否通畅；telnet 域名 端口号；
ps -ef|grep  ps -ef:查看所有进程，|:管道 前面的输出作为后面的输入，就是从|之前的命令查询到的结果中筛选出符合|之后的条件的内容，grep:查找指定的内容
kill -9 进程号(pid):杀死指定的进程


通过ll之后会展示出文件的详细信息: root
	第1位:文件类型   - 文件,d 文件夹
	2,3,4:当前用户操作权限                  
	5,6,7:当前组中其他成员的操作权限  
	8,9,10:其他用户的操作权限
chmod命令后面接上三个数字分别表示设置当前用户、当前组的其它成员、其它用户的权限
	0表示没有任何权限
	1表示有"执行"的权限------->x
	2表示有"写"的权限--------->w
	4表示有"读"的权限-------->r
	chmod 777 文件:让所有的用户对该文件可读可写可执行

```

#### 16.Redis

```
Jedis介绍
	redis不仅可以通过命令行来操作,现在主流的语言(Java,C#...)基本都有客户端的支持.所以我们要通过java来操作Redis.
企业里用的最多的是Jedis. jedis只是java操作Redis的客户端,相当于jdbc

Redis的存储数据结构：
	redis中存储的数据是以key-value的形式存在的.其中value支持5种数据类型  
	字符串(String)、哈希(hash)、字符串列表(list)、字符串集合(set)、有序的字符串集合(sortedset或者叫zset)

```

```
面向接口编程
- 目的:实现定义(规范、约束)和实现的分离。
- 理解:在系统分析和架构中，分清层次和依赖关系，每个层次不是直接向其上层提供服务（即不是直接实例化在上层中）,而是通过定义一组接口，仅向上层暴露其接口功能，上层对于下层仅仅是接口依赖，而不依赖具体类。这样做的好处是显而易见的，首先对系统灵活性大有好处。当下层需要改变时，只要接口及接口功能不变，则上层不用做任何修改。甚至可以在不改动上层代码时将下层整个替换掉

```

### 三、Spring

#### 1.IOC和DI

```
IOC:控制反转，所有类的创建、销毁都交给spring容器完成；
DI：依赖注入，spring通过反射实现对象属性的注入；
spring工厂类：BeanFactory、ApplicationContext；
bean的生命周期、bean实例化的三种方式
spring属性注入的方式
```

```
日志技术：slf4j+log4j、commons-logging+log4j
log4j三个主要部件：
				记录器：loggers（采用哪些输出源及日志级别）
				输出源：appenders（日志输出位置）
				布局：layouts（控制日志输出格式）

```

```
spring ioc注解开发：
	引入注解约束，配置组件扫描
	类上的注解： @Component @Controller @Service @Repository
	普通属性的注解   @value
	对象属性的注解   @Resource   @Autowired  @Qualifier
	Bean生命周期：初始化与销毁: @PostConstruct @PreDestroy
	Bean作用范围：@Scope("prototype") ， 默认是singleton
```

#### 2.AOP

```
CGLIB代理（面向接口和类）MethodInterceptor、JDK代理（面向接口）InvocationHandler
AOP开发相关术语：
		Target-目标对象
		joinpoint：连接点，可以被拦截到的点（目标对象可以被拦截的方法）
		Aspect:切面，通知和切入点的集合（代理类）
		pointcut：切入点，真正被拦截到的点（真正被拦截的目标对象的方法）
		Advice：通知，对被拦截到的点的相关操作（方法层面的增强：前置、后置、异常、最终、环绕通知）
		Weaving:织入，通过目标对象创建代理对象的过程
		Introduction：引入，动态的创建字段和方法（类层面的增强）
		
切入点表达式的语法整理如下：
execution(<访问修饰符>?<返回类型>空格<方法名>(<参数>)<异常>?)
例如： 
execution(* cn.itcast.spring.a_jdkproxy.CustomerServiceImpl.*(..)) 增强bean对象所有方法
execution(* cn.itcast.spring..*.*(..)) 增强spring包和子包所有bean所有方法

bean(bean Id/bean name) 
例如 bean(customerService) 增强spring容器中定义id属性/name属性为customerService的bean中所有方法 
例如bean(*Service):查找spring容器中的bean，对应bean中的id属性，*Service表示找到所有以Service结尾的id的名称
within(包.类) 
例如： within(cn.itcast.spring..*) 增强spring包和子包所有bean“所有方法 ”

this(完整类型)/target(完整类型)
this对某一个类-（对代理对象有效），target对代理对象无效(只对目标对象有效) 
例如： this(cn.itcast.spring.demo.CustomerServiceImpl) 增强类型所有方法（对代理对象有效）
target(cn.itcast.spring.demo.CustomerServiceImpl)增强类型所有方法（对目标对象有效）
注意：我们一般都对目标对象进行拦截，很少对代理对象进行拦截

【AspectJ类型匹配的通配符】
*：匹配任何数量字符；
..：匹配任何数量字符的重复，如在类型模式中匹配任何数量子包字符名称；而在方法参数模式中匹配任何数量参数名称。

aop注解通知：
@Aspect
public class AspectAnno {
	@Before("execution(* com.aop.demo.DaoImpl.find(..))")
	public void before(){
		System.out.println("前置增强==========");
	}
	......
	@Around(value="execution(* com.aop.demo.DaoImpl.update(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前增强========");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后增强========");
		return obj;
	}
}
```

#### 3.spring事物

```
Isolation隔离级别：DEFAULT,READ_UNCOMMITTED,READ_COMMITTED,REPEATABLE_READ,SERIALIZABLE;
Propagation传播行为：REQUIRED,SUPPORTS,MANDATORY,REQUIRES_NEW,NOT_SUPPORTED,NEVER,
NESTED（嵌套事务回滚特性：主事务和嵌套事务属于同一个事务，嵌套事务出错回滚不会影响到主事务，主事务回滚会将嵌套事务一起回滚了）;
spring事物管理：编程式事物管理、声明式事物管理（声明式事务管理建立在AOP之上的。其本质是对方法前后进行拦截，然后在目标方法开始之前创建或者加入一个事务，在执行完目标方法之后根据执行情况提交或者回滚事务。）
Spring事务注解@Transactional是个典型的Spring AOP的注解，在方法上面加上注解就有了事务的能力
```

```
SVN资源仓库中有三个非常重要的目录，trunk（主干）、branches（分支）、tags（标签），
trunk：一般的项目都是基于主干开发的。
branches：分支，一般用于有某些开发功能时，需要基于主干开分支，开发完成后要合并到主干。
tags：标签，项目开发完成后，发布上线时，需要将主干的代码打标签到tags中，一般情况下，tags的内容是只读的。
```

#### 4.spring的缓存技术

```
spring缓存注解@Cacheable是基于aop的注解
```

### 四、maven

```
maven：管理java项目的工具，
maven仓库：本地仓库： 本机的一个文件夹；
		   远程仓库: 私服：存放在局域网上的仓库/中央仓库：maven团队维护的仓库
maven project目录结构：
		src --源码和配置文件
			main   -- 主体代码
				java	-- java源码
				resources   -- 配置信息
			test  -- 测试代码
				java		
				resources
		target --编译打包后的资源文件
		pom.xml --maven核心配置文件：jar包依赖及插件

maven的常用命令
		clean :清理命令，清理项目中target文件夹，编译后的文件清理
		compile:编译，会编译java文件，生成的class文件存放到target目录中
		test:测试命令，会执行test源码包中的 @Test 标注的方法（测试类尽可能以Test后缀结尾）
		package:打包命令：java项目打成jar包，web项目打成的是war包，打包到target目录下
		install :安装命令，讲项目打成的jar或者war安装到本地仓库
		deploy ：发布，讲项目打成的jar或者war安装到私服

pom文件依赖传递冲突：A依赖C ，B依赖C ， 引入两个C会产生冲突
maven依赖调优原则：第一声明者优先、路径近者优先
pom文件中DepencyManagement标签：只能用于指定版本不能用于引入jar包；
Dependencies标签：引入jar包，并默认被所有的子项目继承
properties标签：提取公共属性值

```

```
Nexus搭建私服，私服仓库分类：
		宿主仓库：第三方的jar包，本公司的正式和测试jar包
		代理仓库： 中央仓库的jar包 ，apache的测试jar包
		组仓库： 宿主仓库和代理仓库
		虚拟仓库：maven1的jar包
		
上传jar包到私服
1、在settings.xml中配置账号和密码
<!-- nexus 的账号和密码 -->
	<server>
      <id>releases</id>
      <username>admin</username>
      <password>admin123</password>
    </server>
	<server>
      <id>snapshots</id>
      <username>admin</username>
      <password>admin123</password>
    </server>
2、在项目的pom.xml 给配置上传的位置
<distributionManagement>
  	<repository>
  		<id>releases</id>
		<url>http://localhost:8081/nexus/content/repositories/releases/</url>
  	</repository> 
  	<snapshotRepository>
  		<id>snapshots</id>
		<url>http://localhost:8081/nexus/content/repositories/snapshots/</url>
  	</snapshotRepository> 
  </distributionManagement>
```

```
从私服下载jar包
1、在settings.xml文件中指定下载地址
<profile>   
	<!--profile的id-->
   <id>dev</id>   
    <repositories>   
      <repository>  
		<!--仓库id，repositories可以配置多个仓库，保证id不重复-->
        <id>nexus</id>   
		<!--仓库地址，即nexus仓库组的地址-->
        <url>http://localhost:8081/nexus/content/groups/public/</url>   
		<!--是否下载releases构件-->
        <releases>   
          <enabled>true</enabled>   
        </releases>   
		<!--是否下载snapshots构件-->
        <snapshots>   
          <enabled>true</enabled>   
        </snapshots>   
      </repository>   
    </repositories>  
	 <pluginRepositories>  
    	<!-- 插件仓库，maven的运行依赖插件，也需要从私服下载插件 -->
        <pluginRepository>  
        	<!-- 插件仓库的id不允许重复，如果重复后边配置会覆盖前边 -->
            <id>public</id>  
            <name>Public Repositories</name>  
            <url>http://localhost:8081/nexus/content/groups/public/</url>  
        </pluginRepository>  
    </pluginRepositories>  
  </profile> 
2、在settings.xml文件中激活下载地址
   <!---激活下载的地址-->
  <activeProfiles>
    <activeProfile>dev</activeProfile>
  </activeProfiles>
```

### 五、oracle

```
dual:是一张虚表，为了完善查询的语法结构
sql语法：连接符号：||   
	函数：nvl(eExpression1, eExpression2)
	upper: 转换为大写 lower ：转换为小写
     concat
     length
     substr(str, p1 ,p2): str:截取的字符串 ，p1：开始的索引 ，p2：截取的长度
     replace(str ,p1,p2) : str：要替换的字符串 p1：被替换的 p2：替换成的
     trim() 去除两侧的空白
     ......
	排序：order by column asc nulls first/order by column desc nulls last
	decode(条件,值1,返回值1,值2,返回值2,…值n,返回值n,缺省值)/case when then else end
	exists 存在运算符(效率较in条件查询高): 只会返回两个值：true ，false
	
分页查询：需要生成带行号的临时表，再根据行号进行条件筛选分页
	伪列：   
    --rowid 行编号： 在添加记录时生成，存储的内存地址
    -- rownum : 行号，每加载一条记录生成一个行号，行号是从1 开始，依次递增，每次递增一个
    使用row_number() over(条件语句) 注意：在使用over等开窗函数时，over里头的分组及排序的执行晚于		where，group by，order by的执行
    
递归查询(单表)
    -- 语法：
       select * from 表
       start with 条件(设置起始位置)
       connect by 条件(关联条件和查询方向);
```

```
/*
表空间创建语法
  create tablespace 表空间名称
  datafile '文件路径'
  size 200M -- 指定文件的大小
  autoextend on -- 开启自动扩展 ， off
  next 20M;  -- 每次扩展20M;
*/
-- 表空间的删除的语法
  --drop tablespace 表空间名称(不能删除数据文件)
   --drop tablespace 表空间名称 including contents and datafiles;（删除数据文件）
```

```
用户权限：
/*
     语法:
      create user 用户名 identified by 密码
      default tablespace 表空间名称;
   */
   
   --- 常见权限列表
    -- connect : 基本权限：create session
    -- resource :开发人员权限，
    -- dba ：管理员权限
    -- 赋予权限的语法
       -- grant  权限列表 to 用户;
    -- 回收权限
       -- revoke 权限列表 from 用户;
```

```
-- 数据类型:
    -- 字符串类型
       -- char（10）:固定长度字符串 ,最大长度：4000
       -- varchar（10）：可变长度字符串
       -- varchar2(10):可变长度字符串,由oracle公司定义，承诺向后兼容
       -- long : 存储量是 2G ，用clob取代
    -- 数值类型
       number: 整数 
       number(m,n)：浮点数类型， m是总的位数,n 是小数点后的位数
    -- 日期类型
       -- date :相当于mysql中的datetime
       -- timestamp : 时间戳类型，精确到秒后的9位
    -- 大数据类型
    	-- blob: 存储量是4G，字节大数据类型,
       -- clob：存储量是4G, 字符大数据类型,
 
 --- 约束:保证数据的完整性
     -- 主键：唯一，非空
     --非空:
     -- 唯一
     -- 默认
     -- 检查 
 
--SQL语句的分类
      -- DDL： 数据库定义语言：create, drop , alter
      -- DML: 数据库操作语言： insert, update ,delete
      -- DCL: 数据库控制语言：grant ，revoke
      -- DQL: 数据库查询语言： select
   -- insert into 表名 values();
   -- insert into 表名(列名,...) values(值,...)
   -- update 表名 set 列= 值, 列=值 where 条件
   -- delete from 表 where 条件
   -- truncate table 表名; -- 删除所有的记录（效率极高），摧毁表结构，重新建
   
-- 事务的特性：原子性，一致性，隔离性，持久性
   -- 数据库的隔离级别
      -- read uncommited:读未提交
      -- read comminted :读已提交
      -- repeatable read ：重复读
      -- serializable : 串行化（序列化）
   -- mysql ：支持四个隔离级别,默认隔离级别：repeatable read
   -- oracle：支持三个隔离级别（read commited ,serializable ,read only）
               -- 默认的是：read commited  
               
-- 事务的保存点
   insert into table1 values();
   savepoint s1;
   insert into table2 values();
   savepoint s2;
   insert into table3 values();
   savepoint s3;
   rollback to s2;
   commit;
```

```
--- 视图: 是一张虚表, 不能存储记录，所有的记录都在基本表中 ,可以对视图进行增删改查
   -- 语句：
      -- create view 视图名 as DQL语句;
    -- 作用一：可以屏蔽敏感列
    -- 作用二：简化操作
    -- 作用三：可以定义只读的视图
    
```

```
--序列 完整的语法
     /*
     create sequence 序列名
     start with 1  起始值
     increment by 2  自增量
     maxvalue  9999 最大值  ,nomaxvalue
     minvalue 1 最小值 ，nominvalue
     cycle    开启循环
     cache 20 ; 缓存
     */

 -- 添加索引
    create index indexname on tablename(cloumn);
    
 -- 同义词: 作用一： 跨用户访问 ，作用二：缩短表名
 	--create synonym 同义词名称 for 用户.表;
```

```
plsql基本语法
/**
  过程化语言的基本结构
    declare
      -- 声明变量
      -- 声明普通的变量
     a number;
     -- 声明变量且赋初始值
     b number default 20;
     -- 引用类型：引用表字段的类型
     c table.column%type;
     -- 记录类型: 记录表一行的内容
     d_row table%rowtype;
      -- 声明异常
   	not_found exception;
    begin
      -- 过程化语言
      -- 抛出异常
      raise not_found;
    exception
      --异常的处理
      when not_found then  -- 捕获异常
    end;

*/

---- 分支语句 (if)
/*
if 条件 then
   sql语句;
end if;
*/
/*
if 条件 then
   sql语句;
else 
   sql语句
end if;
*/


---- 循环
-- for循环
/*
for 变量 in 游标|1..10 loop
  
end loop;
*/


/**
  loop循环
  
  loop
      循环体;
      退出条件;
      迭代部分
  end loop;
*/

/*
while 条件 loop
      循环体
      迭代
end loop;
*/
```

```
--  声明游标
    --语法： cursor 游标名 is DQL;
--  遍历游标
    /*
          open 游标名;
          loop
          fetch 游标名 into 变量名,...;
          exit when 游标名%notfound;
          end loop；
          close 游标名;
    */
```

```
----- 存储过程: 封装了一组sql语句，提前编译好，效率较高 ,存储在服务端
--- 语法
 /*
 create [or replace] procedure 存储过程名称(参数名  in|out 类型（例：游标类型sys_refcursor）,....)
 as | is 
    -- 声明变量
 begin
   -- 过程化语言
 end;    
 */
 
 --- 访问存储过程
 -- call  存储过程名(参数);  -- 只能访问只有输入参数（in）的存储过程，对于有返回参数(out)的存储过程需要在另一个存储过程中定义返回参数并调用该存储过程接收返回值
```

```
---- 存储函数:封装了一组sql语句，提前编译好，效率较高 ,存储在服务端
     --- 存储函数必须有一个返回值，存储函数可以用select语句中
   /**
   create or replace function 函数名(参数名  in|out 类型,....)
   return type返回值类型
   as | is
   begin
      return 值;
   end;
   
   */
```

```
----- 触发器(监听器):监听表中的数据是否发生了改变
      -- 增删改 操作
/*
create or replace trigger 触发器名
after | before 在改变之前还是之后执行触发器
insert | delete | update  监听表的哪个操作
on 表  对哪张表的监听
for each row 行级触发器，默认是表级触发器
（触发器的级别:表级触发器， 行级触发器
      表级触发器不能使用old，new
      行级触发器：可以使用old，new） 
declare

begin
  
end;

*/
```

### 六、mybatis

```
mybatis开发传统模式：

// 创建SqlSessionFactoryBuilder对象
SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
// 查找配置文件创建输入流
InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
// 加载配置文件，创建SqlSessionFactory对象
SqlSessionFactory sqlSessionFactory = sfb.build(inputStream);
// 创建SqlSession对象
SqlSession sqlSession = sqlSessionFactory.openSession();
// 执行查询，参数一：要查询的mapper.xml中的namespace.statementId ,参数二：sql语句入参
User user = sqlSession.selectOne("user.getUserById", 1);
// 释放资源
sqlSession.close();
```

```
动态代理模式：
1.Mapper.xml的namespace必需是mapper接口的全路径名
2.mapper接口的方法名必需与mapper.xml映射文件的sql id一致
3.接口的输入参数必需与映射文件的parameterType类型一致
4.接口的返回类型必须与映射文件的resultType类型一致

// 创建SqlSessionFactoryBuilder对象
SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
// 查找配置文件创建输入流
InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
// 加载配置文件，创建SqlSessionFactory对象
SqlSessionFactory sqlSessionFactory = sfb.build(inputStream);
// 创建SqlSession对象
SqlSession sqlSession = sqlSessionFactory.openSession();
// 获取代理对象
UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
// 查询数据
User user = userMapper.getUserById(30);
// 释放资源
sqlSession.close();


```

```
mybatis sql标签：
<!-- foreach循环标签 
		collection:要遍历的集合，来源入参 
		open:循环开始前的sql 
		separator:分隔符 
		close:循环结束拼接的sql
			-->

resultmap标签关联查询
<!-- association:配置一对一关联
	property:对应java实体的字段
	javaType:属性数据类型
		-->
		
<!-- collection:配置一对多关系
	property:对应java实体的字段
	ofType:集合属性的数据类型
		-->
```

```
spring整合mybatis
1、SqlSessionFactory对象应该放到spring容器中作为单例存在。
2、传统dao的开发方式中，应该从spring容器中获得sqlsession对象。
3、Mapper代理形式中，应该从spring容器中直接获得mapper的代理对象。
4、数据库的连接以及数据库连接池事务管理都交给spring容器来完成。

方式一：dao实现类继承SqlSessionDaoSupport
方式二：动态代理Dao开发：方案一：配置MapperFactoryBean
					   方案二：配置MapperScannerConfigurer（配置包扫描）
```

### 七、springmvc

```
拦截器：HandlerInterceptor方法执行顺序如下
 preHandle方法：//在Controller方法执行前被执行，登录拦截、权限认证等等
 postHandle方法：//在Controller方法执行后并且返回ModelAndView之前被执行，设置或者清理页面共用参数等等
 afterCompletion方法：//在preHandle方法返回true并且Controller方法完全执行完后被执行，用于
 处理异常、记录日志
```

