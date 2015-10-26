package com.listenerapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.listenerapp.client.view.ButtonView;
import com.listenerapp.client.view.ClearListener;
import com.listenerapp.client.view.TextBoxView;

public class ListenerApp implements EntryPoint {
    private ButtonView buttonView;
    private TextBoxView textBoxView;

    @Override
    public void onModuleLoad() {
        textBoxView = new TextBoxView();

        buttonView = new ButtonView(new ClearListener() {
            @Override
            public void clear() {
                textBoxView.clear();
            }
        });

        RootPanel.get().add(buttonView);
        RootPanel.get().add(textBoxView);
    }
}
