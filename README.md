# Java

在Java中，变量分为两种：基本类型的变量和引用类型的变量。

int x = 1;

基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：

* 整数类型：byte，short，int，long

* 浮点数类型：float，double

* 字符类型：char

* 布尔类型：boolean

Java里字符串是引用类型。

```java
public class Dog extends Person{};
private static final long version = 1L;
private Map<String, Object> map = new HashMap<~>();
private String msg = "";
private Integer page;
```

```java
public class DangerAction extends GenericAction{
	private int page;
	private int pageSize;
	private String optName;
	private String segName;
	private Long optId;
	private String startStation;
	private String nextStation;
	private String jsonMsg = "";
	private String starTimeFrom;

	simpleDateFromat ymdAll = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
```

```java
public class DistrictAction extends GenericAction{
	private List<District> list;

	public String query(){
		
	}
}
```