package DesignPatterns.Mediator.ArticleDialogBox;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandler() {
        for (var event : eventHandlers)
            event.handel();
    }

}
