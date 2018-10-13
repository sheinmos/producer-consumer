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
        testConsumer(new payload());
    }

    private static void testConsumer(payload ...  data)
    {

        //producer
        Observable<payload> observable = Observable.fromArray(data);
        Observable<String> observable2 = Observable.just("how2", "to2", "do2", "in2", "java2");
        //consumerImpl
        Consumer<? super String> consumer = System.out::println;

        //Attaching producer to consumerImpl
        observable.subscribe((Consumer<? super payload>) consumer);

    }
}
