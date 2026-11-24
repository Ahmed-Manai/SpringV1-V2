# SpringV1-V2

A small exercise in Spring Framework dependency injection, moving from XML bean definitions (V1) to annotations (V2) with a vehicle example.

## What it shows

- `Vehicle` is an interface implemented by `Car` and `Bus`.
- `Car` depends on a `Tyre`, injected with `@Autowired`.
- `spring.xml` turns on component scanning (`<context:component-scan>`), so the `@Component` classes become beans. The commented-out `<bean>` entries show the XML way of declaring them and setting a property or constructor argument, kept for comparison.
- `App` starts a `ClassPathXmlApplicationContext`, prints the `Tyre` bean and calls `drive()` on the `Car`.

## Run it

Requires Java and Maven.

```bash
mvn compile exec:java -Dexec.mainClass=com.sp.springv1.App
```

See also [SpringAnnotation](https://github.com/Ahmed-Manai/SpringAnnotation), which drops XML entirely and uses Java configuration with `@Qualifier`.
