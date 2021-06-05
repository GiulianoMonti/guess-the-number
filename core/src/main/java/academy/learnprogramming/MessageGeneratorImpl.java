package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {
    // == fields ==
    @Autowired
    private Game game;

    private int GuessCount = 10;

    // == init ==
    @PostConstruct
    public void init(){
        log.info("game = {}", game);
    }
    private String mainMessage;
    private String resultMessage;

    // == constants ==
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // == public methods ==
    @Override
    public String getMainMessage() {
        return "getMainMessage() called";
    }

    @Override
    public String getResultMessage() {
        return "getResultMessage() called";
    }
}
    /*In MessageGeneratorImpl
    add a logger.
        add a field of type Game and autowire it
        add a field guessCount (int) and initialize it to 10 for now (we will change this later).
        add a @PostConstruct method and log value of game to confirm it was autowired e.g. not null.*/
