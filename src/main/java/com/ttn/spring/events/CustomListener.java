package com.ttn.spring.events;

import org.springframework.context.ApplicationEvent;

public class CustomListener extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CustomListener(Object source) {
        super(source);
    }


}
