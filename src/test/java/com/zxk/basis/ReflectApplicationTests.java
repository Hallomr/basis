package com.zxk.basis;

import com.zxk.basis.reflectvo.ReflectVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@SpringBootTest
public class ReflectApplicationTests {
    /*
    * 1.通过内置的class属性 类名.class
    2. 对象.getclass()
    3.调用Class类提供的静态方法forName（）Class.forName(“全限定名”)
    4.通过类加载器加载 getClassLoad（）再loadClass（“全限定名”）
    * */
    @Test
    public void test1()throws Exception{
        Class<?> c = Class.forName("com.zxk.basis.reflectvo.ReflectVo");
        System.out.println(c);
        Class<ReflectVo> c1 = ReflectVo.class;
        System.out.println(c1);
        ReflectVo vo = new ReflectVo();
        Class<? extends ReflectVo> c2 = vo.getClass();
        System.out.println(c2);
    }

    @Test
    public void test2() throws Exception{
        //使用反射创建对象
        Class<ReflectVo> c = ReflectVo.class;
        ReflectVo vo = c.newInstance();
        System.out.println(vo);
        //vo.getClass().getSuperclass();
        Constructor<ReflectVo> constructor = c.getConstructor(Integer.class, String.class,String.class);
        ReflectVo qwx = constructor.newInstance(1, "qwx","666");
        System.out.println(qwx);
    }

    @Test
    public void test3() throws Exception{
        ReflectVo reflectVo = new ReflectVo(1, "001","qwx");
        //利用反射获取和设置类公用成员变量的值
        Class<ReflectVo> c = (Class<ReflectVo>)Class.forName("com.zxk.basis.reflectvo.ReflectVo");
        //getfields仅能获取public属性成员包括父类
        Field[] fields = c.getFields();
        for (Field field : fields) {
            String name = field.getName();
            System.out.println(name);
            Object o = field.get(reflectVo);
            System.out.println(name+""+o);
        }
    }

    @Test
    public void test4() throws Exception{
        ReflectVo reflectVo = new ReflectVo(1, "001","qwx");
        //利用反射获取私有成员变量值
        Class<ReflectVo> c = (Class<ReflectVo>)Class.forName("com.zxk.basis.reflectvo.ReflectVo");
        //getDeclaredFields仅能获取类本身的成员属性包括私有、公共、保护
        // （获取父类的私有属性要通过getSuperclass方法获取父类的字节码文件对象再调用getDeclaredFields方法）
        Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            String name = f.getName();
            System.out.println(name);
            int modifiers = f.getModifiers();
            if(modifiers == Modifier.PRIVATE){
                //私有成员 通过暴力反射获取
                f.setAccessible(true);
            }
            Object o = f.get(reflectVo);
            System.out.println(name+":"+o);
        }
    }

    @Test
    public void test5() throws Exception{
        //利用反射获取类的方法
        //getMethods()获取所有公有方法包括父类; getDeclaredMethods()获取类本身所有方法不包括父类
        Class<ReflectVo> c = (Class<ReflectVo>)Class.forName("com.zxk.basis.reflectvo.ReflectVo");
        Method[] m = c.getDeclaredMethods();
        for (Method method : m) {
            String name = method.getName();
            System.out.println(name);
        }
    }

    @Test
    public void test6() throws Exception{
        ReflectVo reflectVo = new ReflectVo();
        //利用反射调用类的方法
        Class<ReflectVo> c = (Class<ReflectVo>)Class.forName("com.zxk.basis.reflectvo.ReflectVo");
        Method method = c.getMethod("setValue", String.class);
        method.invoke(reflectVo,"qwx");
        Method m = c.getMethod("getValue");
        Object value = m.invoke(reflectVo);
        System.out.println(value);
        //利用反射调用私有方法
        Method test = c.getDeclaredMethod("test", String.class);
        test.setAccessible(true);
        test.invoke(reflectVo, "this is test");
    }

    /**
     * Introspector 内省机制
     * */
    @Test
    public void test7() throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("value",ReflectVo.class);
        Method writeMethod = propertyDescriptor.getWriteMethod();
        ReflectVo vo = new ReflectVo();
        writeMethod.invoke(vo,"cbj");
        Method readMethod = propertyDescriptor.getReadMethod();
        Object value = readMethod.invoke(vo);
        System.out.println(value);
    }
}