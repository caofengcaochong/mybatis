import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test002 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
       HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
       HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) helloServiceProxy.bind(helloService);
        System.out.println(proxy.getClass().getName());
        proxy.sayHello("caofeng");

    }
/**
 *description:
 * create by: mmzs
 * description: TODO
 * create time: 2019/8/21 0021 下午 5:13
 * 
 
 * @return 
 */
    public int m1(int i,int j){return 1;}

    public void m(){}

/**
        * @Description: 
        * @Param:  * @param ： null
        * @return: 
        * @Author: Mr.Wang
        * @Date: 2019/8/21 0021
 */ 
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }
}
