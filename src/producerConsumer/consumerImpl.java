package producerConsumer;

import io.reactivex.subscribers.DefaultSubscriber;

public class ConsumerImpl extends DefaultSubscriber<payload> implements Consumer{


    @Override
    public void onNext(payload payload) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
