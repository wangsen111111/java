package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class List集合练习 {
    public static void main(String[] args) {
        /*
         一：集合的嵌套遍历
             需求：我们班有学生，每一个学生都是一个对象，所以我们可以使用一个集合表示我们班的学生，ArrayList<Student>
                   但是还有其它班级，每一个班级也是一个ArrayList<Student>
                   而现在有多个ArrayList<Student>,也要用集合存储--》
                   --》ArrayList<ArrayList<Student>>
         */
        //创建大集合
        ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();
        //创建第一个班级的学生集合
        ArrayList<Student> firstArrayList = new ArrayList<Student>();
        Student s1 = new Student("唐僧", 18);
        Student s2 = new Student("孙悟空", 16);
        //学生进班
        firstArrayList.add(s1);
        firstArrayList.add(s2);
        //把第一个班级存储到学生系统中
        bigArrayList.add(firstArrayList);

        //创建第二个班级的学生集合
        ArrayList<Student> secondArrayList = new ArrayList<Student>();
        Student ss1 = new Student("诸葛亮", 18);
        Student ss2 = new Student("周瑜", 16);
        //学生进班
        secondArrayList.add(ss1);
        secondArrayList.add(ss2);
        //把第二个班级存储到学生系统中
        bigArrayList.add(secondArrayList);

        //创建第三个班级的学生集合
        ArrayList<Student> thirdArrayList = new ArrayList<Student>();
        Student sss1 = new Student("鲁智深", 18);
        Student sss2 = new Student("宋江", 16);
        //学生进班
        thirdArrayList.add(sss1);
        thirdArrayList.add(sss2);
        //把第三个班级存储到学生系统中
        bigArrayList.add(thirdArrayList);

        //增强for遍历集合
        for (ArrayList<Student> array : bigArrayList) {
            for (Student s : array) {
                System.out.println(s.getName() + "----------" + s.getAge());
            }
        }
        /*
        获取10个1-20之间的随机数，要求不能重复
        用数组实现，但是数组的长度是固定的，长度不好确定
        所以用集合实现
        分析：
            A：创建产生随机数的对象
            B:创建一个产生随机数的集合
            C:定义一个统计变量，从0开始
            D:判断统计变量是否小于10
                小于10：先产生一个随机数，判断该随机数在集合是否存在，如果不存在，就添加，统计变量++，不存在，就不管了
                大于10：不管，退出循环
            F：遍历集合
         */
        System.out.println("++++++++++++++++++++++++++");
        //创建产生随机数的对象
        Random r = new Random();
        //创建一个存储随机数的对象
        ArrayList<Integer> array = new ArrayList<Integer>();
//定义一个统计变量，从0开始
        int count = 0;
        //判断统计遍历是否小于10
        while (count < 10) {
            //先产生一个随机数
            int number = r.nextInt(20) + 1;
            //判断该随机数在集合中是否存在
            if (!array.contains(number)) {
                //如果不存在，就添加，统计变量++
                array.add(number);
                count++;
            }
        }
        //遍历集合
        for (Integer number : array) {
            System.out.println(number);
        }
        /*
        键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
        分析：
            A:创建键盘录入数据对象
            B:键盘录入多个数据，由于不知道有多少个，所以用集合存储
            C:以0结束，只要键盘录入的数据收集0，就不录入数据了
            D:把集合转为数组
            E:对数组排序
            F:获取该数组中的最大索引的值
         */
        System.out.println("_________________________");
        //创建键盘录入数据=对象
        Scanner sc = new Scanner(System.in);
        //键盘录入多个数据，由于不知道有多少个，所以用集合存储
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        //以0结束，只要键盘录入的数据是0，就退出循环，不再录入数据
        while (true) {
            System.out.println("请输入数据：");
            int number = sc.nextInt();
            if (number != 0) {
                array1.add(number);
            } else {
                break;
            }
        }
        //把集合转为数组
        //public <T> T[] toArray(T[] a)
        Integer[] i = new Integer[array1.size()];
        array1.toArray(i);
        //对数组排序
        //public static void sort(Object[] a)
        Arrays.sort(i);
        //获取该数组中最大索引的值
        System.out.println("数组是：" + arrayToString(i) + "最大值是：" + i[i.length - 1]);
    }

    //写一个方法来将字符串数组进行拼接
    public static String arrayToString(Integer[] i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < i.length; x++) {
            if (x == i.length - 1) {
                sb.append(i[x]);
            } else {
                sb.append(i[x]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
