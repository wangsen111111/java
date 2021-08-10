package com.company;


import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class Generics {
    public void test1(Map<String,User> map, List<User> list){
        System.out.println("test1");
    }
    public Map<String,User> test2(){
        System.out.println("test2");
        return null;
    }
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Generics.class.getMethod("test1", Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();//获得泛型参数类型
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("泛型参数类型-->"+genericParameterType);
            //ParameterizedType参数化类型
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();//获得真实参数信息
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println("真实参数信息-->"+actualTypeArgument);
                }
            }
        }
        System.out.println("----------test2----------");
        method = Generics.class.getMethod("test2", null);
        //方法返回值类型
        Type genericReturnType = method.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();//获得真实参数信息
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println("返回值类型-->"+actualTypeArgument);
            }
        }
    }
}
