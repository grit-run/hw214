import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == beanTwo);
        System.out.println(bean);
        System.out.println(beanTwo);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        Cat beanTwoCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat == beanTwoCat);
    }
}