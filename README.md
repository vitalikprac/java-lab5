# Лабораторна робота - 5
Прачов Віталій ТМ-82. Варіант - 16.

# Start
Using Maven you can provide execution arguments for running specific task
Available tasks: `task5`,`task13`,`task25`,`task31`

To running `task5`:
```bash
$ mvn package exec:java --quiet -DskipTests -Dexec.args=task5
```

To running `task13`:
```bash
$ mvn package exec:java --quiet -DskipTests -Dexec.args=task13
```

To running `task25`:
```bash
$ mvn package exec:java --quiet -DskipTests -Dexec.args=task25
```

To running `task31`:
```bash
$ mvn package exec:java --quiet -DskipTests -Dexec.args=task31
```

# Tests
```bash
$ mvn test
```