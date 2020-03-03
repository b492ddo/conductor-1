import com.google.inject.AbstractModule;

public class MetricsModule extends AbstractModule {

    private static Registry globalRegistry = Spectator.globalRegistry();

    private MetricsModule() { }

    @Override
    public void configure() {
//        bind(MyNewEntity.class).to(MyCustomNewEntityImpl.class);
        Registry registry = new DefaultRegistry();
        ((CompositeRegistry) globalRegistry).add(registry)
    }
}