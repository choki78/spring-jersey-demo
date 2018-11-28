package net.ion.jerseydemo.api;

import net.ion.jerseydemo.api.resource.SampleResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by choki78@gmail.com on 2018-11-28
 * Github : https://github.com/choki78
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(SampleResource.class);
    }
}
