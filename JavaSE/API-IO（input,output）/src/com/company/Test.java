package com.company;
/*
import java.io.*;

class Father {
    public void father_function() throws IOException {
        new File("a.txt");
    }
}

class Son extends Father {
    @Override
    public void father_function() throws Exception {
        new File("b.txt");
    }
}

class Test {
    public static void main(String[] args) {
        Father fs = new Son();
        try {
            fs.father_function();
        }catch (IOException ie) {
            System.out.println("发生了异常");
        }
    }
}

 */
/*
子类不能抛出父类没有的异常?
原因分析：

1、在java多态机制中，对象引用fs在编译时期是属于父类类型也即Father类型，但是在运行时fs属于子类类型，也就是Son类型

2、也就是说在编译的时候，编译器发现catch中的IOException完全能将父类方法中抛出的异常捕获，因此编译通过，
但是在运行时期，由于fs变成了子类类型，子类重写的方法抛出的异常是Exception，显然IOException不能捕获这个比它更大的异常，因此在运行时期也就出现失败

总结：这个示例也就演示了一个道理，在java中，子类重写父类的方法时，子类如果选择抛出异常，那么抛出的异常类型不能大于父类的异常类型(多态)
 */
