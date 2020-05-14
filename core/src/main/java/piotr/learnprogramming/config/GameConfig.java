package piotr.learnprogramming.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import piotr.learnprogramming.GuessCount;
import piotr.learnprogramming.MaxNumber;
import piotr.learnprogramming.MinNumber;

@Configuration
@ComponentScan(basePackages = "piotr.learnprogramming")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.minNumber:5}")
    private int minNumber;
    @Value("${game.maxNumber:20}")
    private int maxNumber;
    @Value("${game.guessCount:5}")
    private int guessCount;


    // == bean methods ==
    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }
    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }
}