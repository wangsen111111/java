package com.company;

//类加载器
public class ClassLoaderFunction {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器   $AppClassLoader
        ClassLoader systemClassLoader=ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器-->扩展类加载器   $ExtClassLoader
        ClassLoader parent=systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器的父类加载器-->根加载器<c/c++>
        ClassLoader parent1=parent.getParent();
        System.out.println(parent1);
        //测试当前类是哪个加载器加载的
        ClassLoader classLoader=Class.forName("com.company.ClassLoaderFunction").getClassLoader();
        System.out.println(classLoader);
        //测试JDK内置的类是谁加载的
        classLoader= Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);
        //双亲委派机制  检测安全性 你写的类和跟加载器一样,不会用你写的类
        //java.lang.String -->往上推

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /**
         * C:\Users\王森\jdk1.8.0_121\jre\lib\charsets.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\deploy.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\access-bridge-64.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\cldrdata.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\dnsns.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\jaccess.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\jfxrt.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\localedata.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\nashorn.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\sunec.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\sunjce_provider.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\sunmscapi.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\sunpkcs11.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\ext\zipfs.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\javaws.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\jce.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\jfr.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\jfxswt.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\jsse.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\management-agent.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\plugin.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\resources.jar;
         * C:\Users\王森\jdk1.8.0_121\jre\lib\rt.jar;
         * C:\Users\王森\IdeaProjects\注解和反射\out\production\注解和反射;
         * C:\Program Files\JetBrains\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar
         */
    }
}