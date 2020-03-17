package com.eliteevince.datafilteroperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DataFilterOperationController {
    @Autowired
    private DataFilterOperationBean filterOperationBean;

    @RequestMapping("/get-all-data-proxy")
    public DataProxyList getAllDataProxy() {
        return filterOperationBean.getAllDataProxy();
    }

    @RequestMapping("/get-filter-data-proxy/{id}")
    public DataProxyList getFilterDataProxy(@PathVariable String id) {
        return filterOperationBean.getFilteredDataProxyById(id);
    }

}
