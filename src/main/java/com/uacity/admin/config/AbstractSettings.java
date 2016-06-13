package com.uacity.admin.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Created by Ted on 16/4/21.
 */
public class AbstractSettings {
    private static ObjectMapper mapper = new ObjectMapper();

    @Override
    public String toString() {
        try {
            return mapper.writeValueAsString(this);
        }catch (Exception e){
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
        }
    }
}
