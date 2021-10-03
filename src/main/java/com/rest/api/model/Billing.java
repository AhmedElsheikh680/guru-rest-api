package com.rest.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;


public class Billing implements Serializable {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6577338081290507077L;

}
