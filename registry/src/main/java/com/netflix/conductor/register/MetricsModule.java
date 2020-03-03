package com.netflix.conductor.register;

import com.google.inject.AbstractModule;
import com.netflix.spectator.api.CompositeRegistry;
import com.netflix.spectator.api.DefaultRegistry;
import com.netflix.spectator.api.Registry;
import com.netflix.spectator.api.Spectator;

public class MetricsModule extends AbstractModule {

//    private static CompositeRegistry globalRegistry = Spectator.globalRegistry();

    public MetricsModule() { }

    @Override
    public void configure() {
//        bind(MyNewEntity.class).to(MyCustomNewEntityImpl.class);
        bind(Registry.class).to(DefaultRegistry.class);
//        DefaultRegistry registry = new DefaultRegistry();
//        globalRegistry.add(registry);
    }
}