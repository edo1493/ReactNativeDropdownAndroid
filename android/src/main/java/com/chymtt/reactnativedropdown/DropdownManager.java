package com.chymtt.reactnativedropdown;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.bridge.ReadableArray;

public class DropdownManager extends SimpleViewManager<Dropdown> {
    public static final String REACT_CLASS = "DropdownAndroid";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected Dropdown createViewInstance(ThemedReactContext context) {
        return new Dropdown(context);
    }

<<<<<<< HEAD
    @UIProp(UIProp.Type.ARRAY)
    public static final String PROP_VALUES = "values";

    @UIProp(UIProp.Type.STRING)
    public static final String PROP_SELECTED = "selected";

    @Override
    public void updateView(Dropdown view, CatalystStylesDiffMap props) {
        super.updateView(view, props);

        if (props.hasKey(PROP_VALUES)) {
            view.setValues(props.getArray(PROP_VALUES));
        }

        if (props.hasKey(PROP_SELECTED)) {
            view.setSelected(props.getString(PROP_SELECTED));
        }
=======
    @ReactProp(name = "values")
    public void setValues(Dropdown view, ReadableArray values) {
    view.setValues(values);
    }

    @ReactProp(name = "selected")
    public void setSelected(Dropdown view, int selected) {
    view.setSelected(selected);
>>>>>>> upstream/master
    }
}
