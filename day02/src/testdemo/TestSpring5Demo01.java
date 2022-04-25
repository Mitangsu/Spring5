package testdemo;


import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.facbean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-03-30 22:24
 */
public class TestSpring5Demo01 {

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Stu stu = context.getBean("Stu", Stu.class);

        stu.test();

    }
    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

//      book.test();
        System.out.println(book1);
        System.out.println(book2);//book1==book2 地址相同 正常情况下 单实例对象
                                  //book1!=book2 地址不相同 xml文件加入scope="prototype" 就变成了多实例对象
                                  //singleton饿汉式 prototype懒汉式
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);

    }

    @Test
    public void testBean(){
//      ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");


        //手动让bean实例销毁
        context.close();

    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

    }
}
