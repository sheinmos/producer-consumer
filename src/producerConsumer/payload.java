package producerConsumer;

import java.io.Serializable;

/**
 * a payload POJO for data payload between  the
 *  Consumer and Producer
 */
public class payload implements Serializable{

    public String data;
    public String eventType;
    public String Date;
}
