package com.listenerapp.client.view;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

public class ButtonView extends Button {

    public ButtonView(final ClearListener clearListener) {
        setText("Clear");

        addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                clearListener.clear();
            }
        });
    }
}
