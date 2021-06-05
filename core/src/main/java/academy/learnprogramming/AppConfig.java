package academy.learnprogramming;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
public class AppConfig {

    // == bean methods ==
    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }

    @Bean
    public NumberGenerator numberGenerator() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game() {
        return new GameImpl();

    }
}
