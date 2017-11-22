package chapter3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

/**
 * @author yjq14
 */
public class LoggerDemo {
    public  Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     *
     * @param logger
     * @param message
     */
    public static void info(Logger logger, Supplier<String> message){
        if (logger.isInfoEnabled()){
            logger.info(message.get());
        }
    }
    public  void LoggerInfo(){
//        String message = "";
//
//        info((logger, )->{
//
//        });
    }

    public static void main(String[] args) {
    }
}
