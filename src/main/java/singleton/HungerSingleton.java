package singleton;

public class HungerSingleton {

    //私有化
    private static HungerSingleton instants = new HungerSingleton();

    //私有化构造方法
    private HungerSingleton() {
    }

    //获取途径
    public static HungerSingleton getInstants() {
        return instants;
    }

}
