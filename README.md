# tron4j

Tron4j is a clone of Tronj, which is no longer supported.

Tronj is a lightweight SDK that includes libraries for working with TRON system contracts and smart contracts.

Tronj makes it easy to build TRON applications with java.

Tronj document: https://tronjdocument.readthedocs.io/en/latest/

## How to use

### Gradle Setting

Then add required packages as dependencies.

```groovy
dependencies {
    // protobuf & grpc
    implementation 'com.google.protobuf:protobuf-java:3.21.3'

    implementation 'com.github.comrada.tron4j:abi:1.0.2'
    implementation 'com.github.comrada.tron4j:client:1.0.2'
    implementation 'com.github.comrada.tron4j:utils:1.0.2'

    implementation 'com.google.guava:guava:31.1-jre'
}
```

### Maven Settings

```xml
<dependency>
  <groupId>com.github.comrada.tron4j</groupId>
  <artifactId>abi</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
<dependency>
  <groupId>com.github.comrada.tron4j</groupId>
  <artifactId>utils</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
<dependency>
  <groupId>com.github.comrada.tron4j</groupId>
  <artifactId>client</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
```
