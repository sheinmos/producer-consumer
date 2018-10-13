package producerConsumer;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jeka on 24/11/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        testConsumer();
    }

    private static void testConsumer()
    {

        //Producer

        Observable<String> observable = Observable.just("how2", "to2", "do2", "in2", "java2");
        //ConsumerImpl
        Consumer<? super String> consumer = System.out::println;

        //Attaching Producer to ConsumerImpl
        observable.subscribe((Consumer<? super String>) consumer);

    }
}
