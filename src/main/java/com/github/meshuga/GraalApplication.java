package com.github.meshuga;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class GraalApplication extends Application<GraalConfiguration> {

    public static void main(final String[] args) throws Exception {
        new GraalApplication().run("server", "config.yml");
    }

    @Override
    public String getName() {
        return "dropwizard-graal";
    }

    @Override
    public void initialize(final Bootstrap<GraalConfiguration> bootstrap) {
    }

    @Override
    public void run(final GraalConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HelloWorldResource());
    }

}
