package com.company;
/*
File类：java提供对我们硬盘上的文件和文件夹进行表示的类
我们要实现IO的操作，就必须知道硬盘上的文件的表现形式
java就提供了一个类File供我们使用
File:文件和目录（文件夹）路径名的抽象表现形式
构造方法:
       File (String pathname) :根据一个路径得到File对象
       File (String parent，String child) :根据-一个目录和-一个子文件/目录得到File对象
       File (File parent, String child) :根据-一个父File对象和一个子文件/目录得到File对象
// File (String pathname) :根据一个路径得到File对象
//把e: \\demo\\a. txt封装成-一个File对象
      File file = new File("E: \\demo\\a. txt") ;
// File(String parent， String child) :根据-一个目录和-一个子文件/目录得到File对象
      File file2 = new File("E: \\demo", "a. txt") ;
// File (File parent, String child) :根据一个父File对象和-一个子文件/目录得到File对象
      File file3 = new File("e: \ \demo") ;
      File file4 = new File(file3, "a.txt") ;
//以上三种方式其实效果-样
成员方法：
   A：创建功能:
            public boolean createNewFile () :创建文件如果存在这样的文件,就不创建了
            public boolean mkdir () :创建文件夹如果存在这样的文件夹,就不创建了
            public boolean mkdirs () :创建文件夹,如果父文件夹不存在,会帮你创建出来
      注意：你到底要创建文件还是文件夹，方法不要调错
   B:删除功能:public boolean delete ()
      注意:
          A:如果你创建文件或者文件夹忘了写盘符路径,那么,默认在项目路径下。
          B: Java中的册除不走回收站。
          C :要删除一一个文件夹,请注意该文件夹内不能包含文件或者文件夹
，  C:重命名功能:public boolean renameTo(File dest)
          如果路径名相同,就是改名。
          如果路径名不同,就是改名并剪切。
             路径以盘符开始:绝对路径     C: \\a.txt
             路径不以盘符开始:相对路径    a. txt
    D:判断功能:
           public boolean isDirectory() :判断是否是目录（文件夹）
           public boolean isFile () :判断是否是文件
           public boolean exists () :判断是否存在
           public boolean canRead() :判断是否可读
           public boolean canWrite () :判断是否可写
           public boolean isHidden () :判断是否隐藏
    E:获取功能：
          基本获取功能:
           public String getAbsolutePath() :获职绝对路径
           public String getPath() :获取相对路径
           public String getName () :获取名称
           public long length() :获取长度。字节数
           public long lastModified() :获取最后一次的修改时间,亳秒值
                  // 1416471971031
                    Date d = new Date (1416471971031L) ;
                    SimpleDateFormat sdf= new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss") ;
                    String s = sdf. format (d) ;
                    System. out.println(s) ;
           高级获取功能;
            public String[] list () :获取指定目录下的所有文件或者文件夹的名称数组
            public File[] listFiles () :获取指定目录下的所有文件或者文件夹的File数组,反的是File对象，它可以拿绝对路径，相对路径
接口（文件名称过滤器）:
   public String[] list(FilenameFilter filter)
   public File[] listFiles(FilenameFilter filter)





 */

import java.io.File;
import java.io.FilenameFilter;

public class File类 {
    /*
    判断C盘目录下是否有后缀名为.jpg的文件，如果有就输出此文件名称
    分析：
         A:封装C盘目录
         B：获取该目录下所有的文件或文件夹的File数组
         C:遍历该File数组，得到每一个File对象，然后判断
         D:是否是文件
                  是：继续判断是否以.jpg结尾
                     是：就输出该文件名称
                     否：不搭理它
                  否：不搭理它
     */
    public static void main(String[] args) {
        //封装C盘目录
        File file = new File("c:\\");
        //获取该目录下所有的文件或者文件夹的File数组
        File[] fileArray = file.listFiles();
        //遍历该File数组，得到每一个File对象，然后判断
        for (File f : fileArray) {
            //是否是文件
            if (f.isFile()) {
                //继续判断是否以.jpg结尾
                if (f.getName().endsWith(".jpg")) {
                    //就输出该文件名
                    System.out.println(f.getName());
                }
            }
        }
    /*
    方法二：
    A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出
    B:获取的时候就已经是满足条件的了，然后输出即可
      接口（文件名称过滤器）:
              public String[] list(FilenameFilter filter)
              public File[] listFiles(FilenameFilter filter)
     */
        //封装E盘目录
        File file1 = new File("e:\\");
        //获取该目录下所欲文件或者文件夹的String数组
        // public String[] list(FilenameFilter)
        String[] strArray = file1.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {

                return new File(dir, name).isFile() && name.endsWith(".jpg");
            }
        });
        //遍历
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}