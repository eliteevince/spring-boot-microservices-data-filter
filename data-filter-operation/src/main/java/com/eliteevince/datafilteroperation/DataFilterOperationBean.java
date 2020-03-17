package com.eliteevince.datafilteroperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class DataFilterOperationBean {

    private List<DataProxy> dataProxys = Arrays.asList(
            new DataProxy(01, "Meet", "Full Stack Developer"),
            new DataProxy(02, "Jigar", "Java Developer"),
            new DataProxy(03, "Divyang", "Java Developer"),
            new DataProxy(04, "Shivam", "Sr Java Developer"),
            new DataProxy(05, "Nirav", "Jr Java Developer")
    );

    public DataProxyList getAllDataProxy() {
        return new DataProxyList(dataProxys);
    }

    public DataProxyList getFilteredDataProxyById(String id) {
        if (null != id) {
            return new DataProxyList(dataProxys.stream().filter(dp -> {
                if (dp.getId().equals(id)) {
                    return true;
                } else {
                    return dp.getName().toLowerCase().contains(id.toLowerCase());
                }
            }).collect(Collectors.toList()));
        }
        return null;
    }
}
