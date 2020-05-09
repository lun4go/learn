package singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    /**
     * 字节码层面
     * 1.分配空间
     * 2.初始化
     * 3.引用赋值
     * 因为2，3有可能被 cpu||JIT 指令重排，会导致空指针，故加java关键字 volatile 防止重排序 避免这种情况
     */
    private volatile static LazySingleton instants;
    //反射创建实例只是不检查私有化，依然会调用构造函数，故可以在构造函数里做判断保证单例
    //私有化构造方法
    //序列化对象可能会导致对象不一致所以可查看Serializable文档解决办法，枚举则不需要
    //类中加入这个方法可以解决对象不一致问题
//    还需要static final long serialVersionUID = 42L;//版本号来兼容
    private LazySingleton() {
        if(instants!= null){
            throw new RuntimeException("单例模式不允许多例");
        }

    }
    static final long serialVersionUID = 42L;
    Object readResolve(){
        return instants;
    }
    //获取途径
    public static LazySingleton getInstants() {
        if (instants == null) {
            //同步代码块避免线程问题，只有第一次会进入
            synchronized (LazySingleton.class) {
                //避免进入后出问题
                if (instants == null) {

                    instants = new LazySingleton();
                    try {
                        Thread.sleep(2000L);//这是为了测试多线程
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return LazySingleton.instants;
    }

}
