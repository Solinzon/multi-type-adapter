package com.baurine.multitypeadaptertutorial.item;

import com.baurine.multitypeadaptertutorial.R;
import com.baurine.multitypeadaptertutorial.adapter.MulitTypeAdapter;

import java.util.Date;

/**
 * Created by baurine on 1/14/17.
 */

public class TextItem implements MulitTypeAdapter.IItem {
    @Override
    public int getType() {
        return R.layout.item_text;
    }

    ///////////////////////////////////////////
    public final String content;

    public TextItem() {
        content = new Date().toString();
    }
}
