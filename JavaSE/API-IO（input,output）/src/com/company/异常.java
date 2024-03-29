package com.company;
/*
异常:程序出现了不正常的情况。
举例:今天天气很好,班长出去旅游。骑着自行车,去山里面呼吸新鲜空气。
    问题1 :山路塌陷了,班长及时停住了,但是过不去了。严重的问题。
    问题2 :班长出门推自行车，发现气没了,把气吹起来。出发前就应该检查的问题。(编译器问题)
    问题3 :班长骑着车在山路上愜意的行驶著,山路两边是有小石子的,中间是平坦的水泥路。（运行期问题）
          -直在平坦的水泥路上行驶是没有任何问题的，但是呢,他偏偏喜欢骑到小石子上,结果爆胎了。旅游的过程中出现的问题。
程序的异常: Throwable,
    严重问题: Error我们不处理。这种问题一般都是很严重的,比如说内存溢出。
    问题: Exception
          编译期问题:不是RuntimeException的异常必须进行处理的，因为你不处理,编译就不能通过。
          运行期问题: RuntimeException这种问题我们也不处理,因为是你的问题,而且这个问题出现肯定是我们的代码不够严谨,需要修正代码的。
如果程序出现了问题，我们没有做任何处理，最终jvm会做出默认的处理
把异常的名称，原因，及出现的问题等信息输出在控制台
同时会结束程序
我们自己如何处理异常呢?
     A:try. . .catch. . . finally
     B: throws抛出
try.. .catch. . . finally的处理格式:
try {
可能出现问题的代码;
}catch (异常名变量) {
针对问题的处理;
} finally {
释放资源;
}
-----------------------------------
变形格式:
try {
可能出现问题的代码;
}catch (异常名 变量) {
针对问题的处理;
}
注意：A:try里面的代码越少越好
     B：catch里面必须由内容，哪怕只给出一个简单的提示
二个异常的处理：
a:每一个写一个try.. .catch
b:写一个try,多个catch
try {
}catch (异常类名 变量名) {
}
catch (异常类名 变量名) {
}
注意事项:
    1 :能明确的尽量明确,不要用大的来处理。
    2 :平级关系的异常谁前谁后无所谓,如果出现了子父关系,父必须在后面。
注意:
一旦try里面出了问题,就会在这里把问题给抛出去,然后和catch里面的问题进行匹配,
一旦有匹配的，就执行catch里面的处理,然后结束了try.. . catch
继续执行后面的语句。
JDK7出现了一个新的异常处理方案:
try{
}catch (异常名1 |异常名2 |变量) {
}
注意:这个方法虽然简洁,但是也不够好：
    A:处理方式是一致的。(实际开发中,好多时候可能就是针对同类型的问题,给出同一个处理)
    B:多个异常间必须是平级关系。
编译时异常和运行时异常的区别：
    编译期异常: Java程序必须显示处理,否则程序就会发生错误,无法通过编译
    运行期异常:无需显示处理,也可以和编译时异常一样处理
@在try里面发现问题后, jvm会帮我们生成一个异常对象,然后把这个对象抛出,和catch里面的类进行匹配。
如果该对象是某个类型的,就会执行该catch里面的处理信息。
try {
Date d = sdf.parse(s); // 创建了一个ParseException（格式异常）对象,然后抛出去,和catch里面进行匹配
System. out.println(d) ;
} catch (ParseException e) { // ParseException e = new ParseException() ;
 //ParseException
 e.printStackTrace () ;
 }
异常中要了解的几个方法:
public String getMessage () : 异常的消息字符串
public String toString() :返回异常的简单信息描述
       此对象的类的name (全路径名)
       ": "(冒号和一个空格)
       调用此对象getLocalizedMessage()方法的结果(默认返回的是getMessage ()的内容)
printStackTrace()获取异常类名和异常信息,以及异常出现在程序中的位置。返回值void。把信息输出在控制台，后面的语句还能执行(*)
@有些时候,我们是可以对异常进行处理的,但是又有些时候,我们根本就没有权限去处理某个异常。
或者说，我处理不了,我就不处理了。
为了解决出错问题, Java针对这种情况，就提供了另一种处理方案:抛出。
格式:     throws异常类名
注意:这个格式必须跟在方法的括号后面。（在方法声明上抛出，是为了告诉调用者，你注意了，我有问题）
@throw和throws：
  throw：如果出现了异常情况，我们可以把该异常抛出，这个时候的抛出的应该是异常的对象
         在功能方法内部出现了某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出
@throws和throw的区别(面试题)：
   throws:
         用在方法声明后面,跟的是异常类名
         可以跟多个异常类名,用逗号隔开
         表示抛出异常,由该方法的调用者来处理
         throws表示出现异常的-种可能性,并不一定会发生这些异常
   throw:
         用在方法体内,跟的是异常对象名
         只能抛出一个异常对象名
         表示抛出异常,由方法体内的语句处理
         throw则是抛出了异常,执行throw则一定抛出了某种异常
throws可以单独使用，但throw不能，throw要么和try-catch-finally语句配套使用，要么与throws配套使用。
但throws可以单独使用，然后再由处理异常的方法捕获
@我们到底该如何处理异常呢：
   ●原则:如果该功能内部可以将问题处理，用try,如
     果处理不了，交由调用者处理，这是用throws
   ●区别:
        后续程序需要继续运行就try
        后续程序不需要继续运行就throws，抛给JVM
   ●举例:
        ●感冒了就自己吃点药就好了,try
        ●吃了好几天药都没好结果得了H7N9,那就的得throws到医院
        ●如果医院没有特效药就变成Error了
@finally
finally特点：被finally控制的语句体一定会执行
格式：try 。。。catch。。。finally
注意：如果在执行到finally之前jvm退出了，就不能执行了（比如说：System。exit(0);）
作用：用于释放资源，在IO流操作和数据库操作中会见到
面试题:
   1: final, finally和finalize的区别
     final :最终的意思，可以修饰类,成员变量，成员方法
            修饰类,类不能被继承
            修饰变量,变量是常量
            修饰方法,方法不能被重写
      finally:是异常处理的-部分,用于释放资源。
              -般来说,代码肯定会执行,特殊情况:在执行到finally之前jvm退出了

       finalize:Object类的一个方法,用于垃圾回收
    2 :如果catch里面有return语句,请问finally里面的代码还会执行吗?
       如果会，请问是在return前,还是return后。
         会。前。（准确的说,应该是在中间。）
       （ return a在程序执行到这一一步的时候,这里不是return a而是return 30; 这个返回路径就形成了。
        但是呢,它发现后面还有finally,所以继续执行finally的内容，a=40
        再次回到以前的返回路径,继续走return 30;）
@自定义异常类：
   java不可能对所有的情况都考虑到,所以,在实际的开发中,我们可能需要自己定义异常。
   而我们自己随意的写一个类,是不能作为异常类来看的，要想你的类是-一个异常类,就必须继承自Exception或者RuntimeException
   两种方式:
        A:继承Exception
        B :继承RuntimeException
              public class MYException extends Exception{
              }
异常注意事项:
A:子类重写父类方法时,子类的方法必须抛出相同的异常或父类异常的子类。(父亲坏了 ,儿子不能比父亲更坏)
B :如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常
C:如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws




 */

