package com.company;
//定义正方形方法来求其面积
class Zhengfangxing {
    //浮点型数据长和宽
    float width, height;
//判断长和宽是否符合大于0
    void setZhengfangxing(float w, float h) {
        if (w > 0 && h > 0) {
            width = w;
            height = h;
        } else
            System.out.println("wrong number！");
    }
//构造获取面积的方法
    float getArea() {

        return (width * height);
    }
//无参构造
    public Zhengfangxing() {
    }
}
//实现类
class 正方形求面积 {
    public static void main(String[] args) {
        Zhengfangxing zfx = new Zhengfangxing();
        zfx.setZhengfangxing(9, 9);
        System.out.println("area is " + zfx.getArea());
    }
}
