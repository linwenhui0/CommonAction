package com.hlibrary.action;


import com.hlibrary.action.listener.LocationListener;

/**
 * Created by linwenhui on 2015/10/1.
 */
public abstract class BaseLocationAction {

    protected boolean locationOnce = true;
    protected LocationListener locationListener;

    public boolean isLocationOnce() {
        return locationOnce;
    }

    /**
     * @param locationOnce true 定位一次
     */
    public void setLocationOnce(boolean locationOnce) {
        this.locationOnce = locationOnce;
    }

    public void setLocationListener(LocationListener locationListener) {
        this.locationListener = locationListener;
    }

    /**
     * @return 开始定位
     */
    public abstract void locationStart();

    /**
     * @return 停止定位
     */
    public abstract void locationStop();

    public abstract void onDestory();

}
