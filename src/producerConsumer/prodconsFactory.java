package producerConsumer;

/**
 * \
 */
public class prodconsFactory {

    private Consumer consumer;
    private Producer producer;

    private prodconsFactory(){};

    public prodconsFactory build()
    {
        consumer = new ConsumerImpl();
        producer = new Producer();
        return this ;
    }

    public Consumer CreateConsumer()
    {
        return new ConsumerImpl();
    }

    public Producer CreateProducer()
    {
        return new Producer();
    }
    
}
