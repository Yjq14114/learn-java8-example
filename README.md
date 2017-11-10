# learn-java8-example
&lt;写给大忙人看的java8>习题答案
### 最近在学习java8，整理了一些这本书的参考答案。
## stream
### 创建一个stream
```java
Stream<String> song = Stream.of("genlty", "down", "the");
```
### 创建一个空的stream
```java
Stream<String> slience = Stream.empty();
```
### 创建一个含有常量值的Stream
```java
Stream<String> echos = Stream.generate(()-> "Echo");
```
### 或者一个含有随机数字的Stream：
```java
Stream<Double> randoms = Stream.generate(Math::random);
```
### optional操作

```java
// 判断值是否存在如果存在就打印
optionalValue.ifPresent(System.out::println);
// 设置默认值，如果没有的话就返回空字符串
String result = optionalValue.orElse("");
// 调用代码计算默认值
String result = optionalValue.orElseGet(()->System.getPreperty("user.dir"));
// 在没有值的时候抛出一个异常
String result = optionalValue.orElseThrow(NOSushElementException::new);
// 创建可选值
Optinal.of(result);
Optionl.empty();
// if obj==null reutrn Optional.empty() else return Optional.of(obj)
Optional.ofNullable(obj);

```
### 聚合操作
