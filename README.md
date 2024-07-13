# Pit RV

Research focussed mutation operators for pitest.

Note, these operators were built into pitest until release 1.7.5. From 1.7.5 onwards, this plugin is required if we wish to use the rv operators.

## Usage

To use the plugin it must be placed on the classpath of the pitest tool (**not** on the classpath of the project being mutated).

### Maven

```xml
    <plugins>
      <plugin>
        <groupId>org.pitest</groupId>
        <artifactId>pitest-maven</artifactId>
        <version>1.7.5</version>
        <dependencies>
          <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-rv-plugin</artifactId>
            <version>0.1</version>
          </dependency>
        </dependencies>
      </plugin>
   </plugins>
```
For Pitest configuration options, have a look at http://pitest.org/quickstart/maven/.

