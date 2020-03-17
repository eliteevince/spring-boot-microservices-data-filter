package com.eliteevince.datafilterservice;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")
public class DataFilterServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = {"/", "/{word}"})
    public String viewPage(@PathVariable Optional<String> word, Map<String, Object> model) {
        if (word.isPresent()) {
            System.out.println("Hello I m called");
            DataProxyList forObject = restTemplate.getForObject("http://localhost:8080/data-filter-operation/get-filter-data-proxy/" + word.get(), DataProxyList.class);
            model.put("list", null != forObject ? forObject.getDataProxy() : Collections.EMPTY_LIST);
            return "viewPage";
        }
        DataProxyList forObject = restTemplate.getForObject("http://localhost:8080/data-filter-operation/get-all-data-proxy", DataProxyList.class);
        model.put("list", null != forObject ? forObject.getDataProxy() : Collections.EMPTY_LIST);
        return "viewPage";
    }

}
