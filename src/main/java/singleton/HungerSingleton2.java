package singleton;

public class HungerSingleton2 {

    //私有化
    private static volatile HungerSingleton2 instants;
    //静态代码块方式
    static {
        instants = new HungerSingleton2();
    }

    //私有化构造方法
    private HungerSingleton2() {
    }

    //获取途径
    public static HungerSingleton2 getInstants() {
        return instants;
    }

}
