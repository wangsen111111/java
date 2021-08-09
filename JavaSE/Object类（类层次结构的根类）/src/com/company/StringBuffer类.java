package com.company;

public class StringBuffer类 {
    public static void main(String[] args) {
        /*
        构造方法：  public StringBuffer（）无参构造方法
                    public StringBuffer（int Capacity）指定容量的字符串缓冲区对象
                    public StringBuffer（String str）指定字符串内容的字符串缓冲区对象
         StringBuffer中的方法：
                     public int Capacity（）；返回当前容量（理论值）
                     public int length（）；（实际值）
         */
        //public StringBuffer（）无参构造方法
        //StringBuffer sb=new StringBufferr();创建字符串缓冲区对象
         StringBuffer sb=new StringBuffer();
         System.out.println(sb);
         System.out.println(sb.capacity());//理论值
        System.out.println(sb.length());//实际值
       // public StringBuffer（int Capacity）指定容量的字符串缓冲区对象
        StringBuffer sb1=new StringBuffer(50);
        System.out.println(sb1);
        System.out.println(sb1.capacity());//理论值
        System.out.println(sb1.length());//实际值
        // public StringBuffer（String str）指定字符串内容的字符串缓冲区对象
         StringBuffer sb2=new StringBuffer("hello");
        System.out.println(sb2);
        System.out.println(sb2.capacity());//理论值
        System.out.println(sb2.length());//实际值
        System.out.println("StringBuffer中的添加功能：");
        /*
        StringBuffer的添加功能： public StringBuffer append（String  str）
                                 可以把任意类型的数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
                                 public StringBuffer insert（int offset，String atr）
                                 在指定位置把任意类型的数据插入到字符串缓冲区里面，
         */
        //一步一步添加数据
        sb.append("hello");
        sb.append("word");
        sb.append(520);
        System.out.println("------------");
        sb.insert(5,"你好");
        System.out.println(sb);
        /*
        StringBuffer中的删除功能：
                    public StringBuffer delectCharAt（int index）删除指定位置的字符，并返回本身
                    public stringBuffer delect(int start,int end,String str)包左不包右
         */
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(1,3);//包左不包右
        System.out.println(sb);
        /*
        替换功能：
                public StringBuffer replace（int start， int end，String str）
         */
        sb.replace(2,4,"节日快乐！");
        System.out.println(sb);
        /*
        反转功能：
                public StringBuffer reverse（）反的是本身
         */
        System.out.println("反转后的为：");
        sb.reverse();
        System.out.println(sb);
        /*
        截取功能：有点特殊
               public String substring（int startt）
               public String substring (int start,int end)
               返回值类型：String
         */
        String s=sb.substring(5);
        System.out.println(s);
        System.out.println(sb);//本身不变
        System.out.println("--------------");
        String ssb="helloword";
        String s1=ssb.substring(5,9);
        System.out.println(s1);

    }
}
