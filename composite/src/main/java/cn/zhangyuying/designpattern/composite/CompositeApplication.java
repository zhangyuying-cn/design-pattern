package cn.zhangyuying.designpattern.composite;

import cn.zhangyuying.designpattern.composite.safety.AbstractSafetyOrganization;
import cn.zhangyuying.designpattern.composite.transparent.AbstractOrganization;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication {
    /** logger */
    private static Logger logger = LoggerFactory.getLogger(CompositeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CompositeApplication.class, args);
        logger.info("transparent");
        AbstractOrganization organization = OrganContext.getOrganizationTree();
        logger.info(JSONObject.toJSONString(organization, SerializerFeature.PrettyFormat));
        logger.info("safety");
        AbstractSafetyOrganization safeOrganization = OrganContext.getSafetyOrganizationTree();
        logger.info(JSONObject.toJSONString(safeOrganization, SerializerFeature.PrettyFormat));

    }
}
