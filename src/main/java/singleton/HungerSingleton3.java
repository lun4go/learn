package singleton;

public class HungerSingleton3 {
    //静态内部类方式
    static class StaticInnerClassHungerSingleton {
        //私有化
        private static HungerSingleton3 instants = new HungerSingleton3();
    }

    //私有化构造方法
    private HungerSingleton3() {
    }

    //获取途径
    public static HungerSingleton3 getInstants() {
        return StaticInnerClassHungerSingleton.instants;
    }

}
