package com.peterlock;

/**
 * Created by macbookpro on 7/2/2017 AD.
 */
public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface  OnClickListener{
        public void onClick(String title);
    }
}
