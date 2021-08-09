package com.company;
/*
1:集合(自己补齐)
   @Collection(单列集合):
       List (有序，可重复):
             ArrayList:
                 底层数据结构是数组，查询快，增删慢
                 线程不安全，效率高
             Vector:
                 底层数据结构是数组，查询快，增删慢
                 线程安全，效率低
             LinkedList:
                 底层数据结构是链表，查询慢，增删快
                 线程不安全，效率高
      Set(无序，唯一一):
          HashSet:
                 底层数据结构是哈希表
                 哈希表依赖两个方法:hashCode ()和eguals ()
                 执行顺序:
                    首先判断hashCode()值是否相同
                        是:继续执行eguals() ,看其返回值
                            是true:说明元素重复，不添加
                            是false:就直接添加到集合
                        否:就直接添加到集合
                 最终:
                    自动生成hashCode()和equals()即可
         LinkedHashSet:
                  底层数据结构由链表和哈希表组成。
                  由链表保证元素有序
                  由哈希表保证元素唯-.
         TreeSet:
               底层数据结构是红黑树 (是一种自平衡的二叉树)
               如何保证元素唯一性呢?
                    根据比较的返回值是否是0来决定
               如何保证元素的排序呢?
                   两种方式:
                       自然排序(元素具备比较性)
                           让元素所属的类实现Comparable接口
                       比较器排序(集合具备比较性)
                           让集合接收一个Comparator的实现类对象
     @Map(双列集合)
         A：Map集合的数据结构仅仅针对键有效，与值无关
         B:存储的是键值对形式的元素，键唯一，值可重复
          HashMap：
            底层数据结构是哈希表，线程不安全，效率高
            哈希表依赖两个方法: hashCode ()和equals()
            执行顺序:
              首先判断hashCode()值是否相同
                 是:继续执行eguals(),看其返回值
                    是true:说明元素重复，不添加
                    是false:就直接添加到集合
                 否:就直接添加到集合
              最终:
                 自动生成hashCode ()和eguals()县可
          Hashtable:
              底层结构是哈希表，线程安全，效率低
              哈希表依赖两个方法: hashCode ()和equals()
            执行顺序:
              首先判断hashCode()值是否相同
                 是:继续执行eguals(),看其返回值
                    是true:说明元素重复，不添加
                    是false:就直接添加到集合
                 否:就直接添加到集合
              最终:
                 自动生成hashCode ()和eguals()县可
          LinkedHashMap：
                 底层数据结构由链表和哈希表组成。
                 由链表保证元素有序
                 由哈希表保证元素唯一
          TreeMap：
                底层数据结构是红黑树 (是一种自平衡的二叉树)
               如何保证元素唯一性呢?
                    根据比较的返回值是否是0来决定
               如何保证元素的排序呢?
                   两种方式:
                       自然排序(元素具备比较性)
                           让元素所属的类实现Comparable接口
                       比较器排序(集合具备比较性)
                           让集合接收一个Comparator的实现类对象
2，到底使用哪种集合？
   看需求：（HashMap和ArrayList）
   是否是键值对象形式:
       是: Map
           键是否需要排序:
                      是: TreeMap
                      否: HashMap
          不知道，就使用HashMap.
       否: Collection
            元素是否唯:
                   是: Set
                         元素是否需要排序:
                                     是:TreeSet
                                     否:HashSet
                  不知道，就使用HashSet
                  否: List
                         要安全吗:
                               是: Vector (其实我们也不用它）
                               否: ArrayList或者 LinkedList
                                  增删多: LinkedList
                                  查询多: ArrayList
                                 不知道就使用ArrayList
                 不知道就使用ArrayList
3，集合的常见方法及遍历方式
   Collection :
             add()              boolean add（Object obj）添加一个元素
             remove ()          boolean remove(Object o)移除一个元素
             contains ()        boolean contains(Object o)判断集合中是否包含指定的元素
             iterator ()        获取功能：Iterator<E> iterator{ }
             size ()            int size()元素的个数
             遍历：
                增强for          遍历   Object[] toArray()把集合转成数组，可以实现集合的遍历
                迭代器             //集合专用的遍历方式：Iterator iterator()   、、Iterator 接口
                                  Iterator it=c.iterator();//实际返回的肯定是子类对象，这里是多态
                                  while(it.hasNext()){
                                  String s=(String)it.next();//我们要想使用字符串的方法，就必须把元素还原成字符串
                                 System.out.println(s); }
             |--List
                    get ()       获取：Object get(int index)获取指定位置的元素
                    编历:普通for
                                 for(int x=0;x<list.size();x++){
                                     String s=(String)list.get(x);
                                     System.out.println(s);}
            | --Set
   Map :
            put ()               V put(K key,V value) : 添加元索
                                 如果键是第一次存储。就直接存储元索,返回null
                                 如果键不是第一次存储,就用值把以前的值替换掉,返回以前的值

            remove ()            V remove (Object key) :根据键册除键值对元索,并把值返回
            containskey()，containsValue ()
                                 boolean containsKey (object key) :判断集合是否包含指定的键
                                 boolean containsValue (Object value) : 判断集合是否包含指定的值
            keySet ()            Set<K> keySet () :获职集合中所有键的集合
            get ()               V get (Object key) :根据键获取值
            value ()             Collection<V> values () :获取集合中所有值的集合
            entrySet ()          Set <Map.Entry<K, v>> entrySet () :返回的是键值对对象的集合
            size ( )             int size() :返回集合中的键值对的对数
            Map集合的遍历:
                根据键找值（丈夫找妻子）
                                    Map --夫妻对
                                       思路:
                                          A:把所有的丈夫给集中起来。
                                          B:遍历丈夫的集合，获职得到每-一个丈夫。
                                          C:让丈夫去找自己的妻子。
                                       转换:
                                          A:获取所有的键
                                          B:遍历键的集合,获取得到每-一个键
                                           C:根据键去找值

               根据键值对对象分别找键积值（通过结婚证分别找丈夫和妻子）：
                                    Map --夫妻对
                                      思路:
                                         A:获取所有结婚证的集合
                                         B:遍历结婚证的集合,得到每-一个结婚证
                                         C:根据结婚证获取丈夫和妻子
                                      转换:
                                         A:获取所有键值对对象的集合
                                         B:遍历键值对对象的集合,得到每-一个键值对对象
                                         C:根据键值对对象获职键和值
                                         这里面最麻烦的就是键值对对象如何表示呢?（entry实体）
                                         Set <Map.Entry<K, v>> entrySet () :返回的是键值对对象的集合
 */












public class 集合概述 {
}
