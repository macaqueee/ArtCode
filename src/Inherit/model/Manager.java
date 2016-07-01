package Inherit.model;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

/**
 * Created by macaque on 01.07.2016.
 */
public class Manager {

    private Worker[] workers;

    public void addWorker(Worker worker){

    }

    public void doTeamWork(Worker worker){
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }
}
