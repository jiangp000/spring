import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
//        获取spring的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        我们的对象已经在spring的管理中了，需要去拿出来
        Hello hello =(Hello)context.getBean("hello");
//        hello 是spring创建的
        System.out.println(hello.toString());

//
    }
}
