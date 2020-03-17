package com.eliteevince.datafilteroperation;

import java.util.List;

public class DataProxyList {

    private List<DataProxy> dataProxy;

    public DataProxyList(List<DataProxy> dataProxy) {
        this.dataProxy = dataProxy;
    }

    public DataProxyList() {
    }

    public List<DataProxy> getDataProxy() {
        return dataProxy;
    }

    public void setDataProxy(List<DataProxy> dataProxy) {
        this.dataProxy = dataProxy;
    }
}
