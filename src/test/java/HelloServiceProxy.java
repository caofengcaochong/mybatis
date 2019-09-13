

import javafx.beans.binding.ObjectExpression;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class HelloServiceProxy implements InvocationHandler {

    private Object target;
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(java.lang.Object proxy, Method method, java.lang.Object[] args) throws Throwable {
        Object result = null;
        System.out.println("我来了"+proxy.getClass().getName());
        result = method.invoke(target,args);
        System.out.println("wo huilia"+result);
        return result;
    }
}
