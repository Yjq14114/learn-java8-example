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

# 第三章、使用lambda编程

## 3.1 延迟执行

​	本章学习的目的是通过创建你自己的库来使用lambda编程

`lambda表达式的特点`  只有在需要的时候才运行代码

```java
/**
     *
     * @param logger
     * @param message
     */
    public static void info(Logger logger, Supplier<String> message){
        if (logger.isInfoEnabled()){
            logger.info(message.get());
        }
    }
```

## 3.2 lambda 表达式的参数

```java


import java.util.function.IntConsumer;

/**
 * @author yjq14
 */
public class RepeatDemo {
    /**
     * 重复执行代码n次
     * 为什么要使用 IntConsumer 而不是runnable
     * 需要用到用户提供的参数
     * @param n
     * @param action
     */
    public static void repeat(int n, IntConsumer action){
        for (int i = 0; i <n ; i++) {
            action.accept(i);
        }
    }

    /**
     * 无参数的版本
     * @param n
     * @param run
     */
    public static void repeat2(int n, Runnable run){
        for (int i = 0; i < n; i++) {
            run.run();
        }
    }

    public static void main(String[] args) {
        RepeatDemo.repeat(10, i-> System.out.println("countDown: " + (9-i)));
        RepeatDemo.repeat2(10, () -> System.out.println("hello,world!"));
    }
}
```

## 3.3 选择一个函数式接口

不同的类型选择不同的接口

## 3.4 返回函数

