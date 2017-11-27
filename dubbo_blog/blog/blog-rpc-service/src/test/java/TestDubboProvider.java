import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动dubbo的rpc服务
 */
public class TestDubboProvider{
   public static void main(String[] args)  throws Exception  {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-dubbo-provider.xml");
      context.start();
      System.out.print(".........dubbo...........init.........start");
      System.in.read();
   }
}

