Comparing Random and SplittableRandom for generating a lot of random ints from a single thread


### JMH output
```
java -jar target/benchmarks.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/home/roby/development/redhat-managed-kafka/perf-rand/target/benchmarks.jar) to method java.io.Console.encoding()
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.36
# VM version: JDK 11.0.18, OpenJDK 64-Bit Server VM, 11.0.18+10-LTS
# VM invoker: /home/roby/.sdkman/candidates/java/11.0.18-amzn/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.positiveBounded

# Run progress: 0.00% complete, ETA 00:25:00
# Fork: 1 of 5
# Warmup Iteration   1: 432639.520 ops/s
# Warmup Iteration   2: 427469.006 ops/s
# Warmup Iteration   3: 433185.736 ops/s
# Warmup Iteration   4: 433306.540 ops/s
# Warmup Iteration   5: 427766.369 ops/s
Iteration   1: 430334.564 ops/s
Iteration   2: 433168.778 ops/s
Iteration   3: 432449.165 ops/s
Iteration   4: 430031.488 ops/s
Iteration   5: 434234.523 ops/s

# Run progress: 6.67% complete, ETA 00:23:23
# Fork: 2 of 5
# Warmup Iteration   1: 421982.349 ops/s
# Warmup Iteration   2: 422643.606 ops/s
# Warmup Iteration   3: 432905.571 ops/s
# Warmup Iteration   4: 433490.729 ops/s
# Warmup Iteration   5: 433863.388 ops/s
Iteration   1: 433819.238 ops/s
Iteration   2: 433160.744 ops/s
Iteration   3: 431813.879 ops/s
Iteration   4: 433063.220 ops/s
Iteration   5: 433724.866 ops/s

# Run progress: 13.33% complete, ETA 00:21:43
# Fork: 3 of 5
# Warmup Iteration   1: 424401.879 ops/s
# Warmup Iteration   2: 425752.697 ops/s
# Warmup Iteration   3: 432091.520 ops/s
# Warmup Iteration   4: 433325.597 ops/s
# Warmup Iteration   5: 434169.337 ops/s
Iteration   1: 433573.353 ops/s
Iteration   2: 432981.866 ops/s
Iteration   3: 433880.682 ops/s
Iteration   4: 432961.760 ops/s
Iteration   5: 433500.050 ops/s

# Run progress: 20.00% complete, ETA 00:20:02
# Fork: 4 of 5
# Warmup Iteration   1: 422539.183 ops/s
# Warmup Iteration   2: 427615.177 ops/s
# Warmup Iteration   3: 433045.067 ops/s
# Warmup Iteration   4: 432976.041 ops/s
# Warmup Iteration   5: 432910.194 ops/s
Iteration   1: 432835.952 ops/s
Iteration   2: 432408.958 ops/s
Iteration   3: 433101.789 ops/s
Iteration   4: 432719.646 ops/s
Iteration   5: 432239.807 ops/s

# Run progress: 26.67% complete, ETA 00:18:22
# Fork: 5 of 5
# Warmup Iteration   1: 424873.284 ops/s
# Warmup Iteration   2: 420880.200 ops/s
# Warmup Iteration   3: 431049.476 ops/s
# Warmup Iteration   4: 433024.577 ops/s
# Warmup Iteration   5: 432045.188 ops/s
Iteration   1: 431429.640 ops/s
Iteration   2: 430585.595 ops/s
Iteration   3: 433756.730 ops/s
Iteration   4: 433755.213 ops/s
Iteration   5: 433708.380 ops/s


Result "org.sample.MyBenchmark.positiveBounded":
  432769.595 ±(99.9%) 857.063 ops/s [Average]
  (min, avg, max) = (430031.488, 432769.595, 434234.523), stdev = 1144.155
  CI (99.9%): [431912.532, 433626.658] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 11.0.18, OpenJDK 64-Bit Server VM, 11.0.18+10-LTS
# VM invoker: /home/roby/.sdkman/candidates/java/11.0.18-amzn/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.random

# Run progress: 33.33% complete, ETA 00:16:42
# Fork: 1 of 5
# Warmup Iteration   1: 98815.202 ops/s
# Warmup Iteration   2: 99007.992 ops/s
# Warmup Iteration   3: 98709.045 ops/s
# Warmup Iteration   4: 98993.674 ops/s
# Warmup Iteration   5: 99139.331 ops/s
Iteration   1: 99151.022 ops/s
Iteration   2: 99180.271 ops/s
Iteration   3: 99152.629 ops/s
Iteration   4: 99031.449 ops/s
Iteration   5: 99192.173 ops/s

# Run progress: 40.00% complete, ETA 00:15:02
# Fork: 2 of 5
# Warmup Iteration   1: 98722.025 ops/s
# Warmup Iteration   2: 98916.571 ops/s
# Warmup Iteration   3: 99286.438 ops/s
# Warmup Iteration   4: 99186.232 ops/s
# Warmup Iteration   5: 99240.538 ops/s
Iteration   1: 99296.182 ops/s
Iteration   2: 99264.860 ops/s
Iteration   3: 99321.545 ops/s
Iteration   4: 99307.407 ops/s
Iteration   5: 99252.260 ops/s

# Run progress: 46.67% complete, ETA 00:13:21
# Fork: 3 of 5
# Warmup Iteration   1: 98799.071 ops/s
# Warmup Iteration   2: 99133.912 ops/s
# Warmup Iteration   3: 99273.986 ops/s
# Warmup Iteration   4: 99282.521 ops/s
# Warmup Iteration   5: 99294.373 ops/s
Iteration   1: 99279.537 ops/s
Iteration   2: 99216.760 ops/s
Iteration   3: 99271.767 ops/s
Iteration   4: 99249.817 ops/s
Iteration   5: 99363.904 ops/s

# Run progress: 53.33% complete, ETA 00:11:41
# Fork: 4 of 5
# Warmup Iteration   1: 98732.368 ops/s
# Warmup Iteration   2: 99082.509 ops/s
# Warmup Iteration   3: 99044.692 ops/s
# Warmup Iteration   4: 99069.428 ops/s
# Warmup Iteration   5: 98930.434 ops/s
Iteration   1: 99061.184 ops/s
Iteration   2: 99190.115 ops/s
Iteration   3: 99186.343 ops/s
Iteration   4: 99289.066 ops/s
Iteration   5: 99180.649 ops/s

# Run progress: 60.00% complete, ETA 00:10:01
# Fork: 5 of 5
# Warmup Iteration   1: 98994.479 ops/s
# Warmup Iteration   2: 98781.214 ops/s
# Warmup Iteration   3: 98930.944 ops/s
# Warmup Iteration   4: 98215.626 ops/s
# Warmup Iteration   5: 98034.701 ops/s
Iteration   1: 97154.605 ops/s
Iteration   2: 98477.739 ops/s
Iteration   3: 98841.260 ops/s
Iteration   4: 98870.389 ops/s
Iteration   5: 98739.551 ops/s


Result "org.sample.MyBenchmark.random":
  99060.899 ±(99.9%) 335.553 ops/s [Average]
  (min, avg, max) = (97154.605, 99060.899, 99363.904), stdev = 447.953
  CI (99.9%): [98725.347, 99396.452] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 11.0.18, OpenJDK 64-Bit Server VM, 11.0.18+10-LTS
# VM invoker: /home/roby/.sdkman/candidates/java/11.0.18-amzn/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.splitableRandom

# Run progress: 66.67% complete, ETA 00:08:21
# Fork: 1 of 5
# Warmup Iteration   1: 354442.539 ops/s
# Warmup Iteration   2: 358014.844 ops/s
# Warmup Iteration   3: 352035.077 ops/s
# Warmup Iteration   4: 352737.283 ops/s
# Warmup Iteration   5: 348026.731 ops/s
Iteration   1: 351209.514 ops/s
Iteration   2: 351820.429 ops/s
Iteration   3: 353330.193 ops/s
Iteration   4: 352493.142 ops/s
Iteration   5: 354252.159 ops/s

# Run progress: 73.33% complete, ETA 00:06:40
# Fork: 2 of 5
# Warmup Iteration   1: 355608.080 ops/s
# Warmup Iteration   2: 357638.942 ops/s
# Warmup Iteration   3: 352451.966 ops/s
# Warmup Iteration   4: 353481.288 ops/s
# Warmup Iteration   5: 354151.173 ops/s
Iteration   1: 354349.284 ops/s
Iteration   2: 353530.560 ops/s
Iteration   3: 349924.779 ops/s
Iteration   4: 348801.036 ops/s
Iteration   5: 349873.488 ops/s

# Run progress: 80.00% complete, ETA 00:05:00
# Fork: 3 of 5
# Warmup Iteration   1: 353573.738 ops/s
# Warmup Iteration   2: cat  /proc/sys/kernel/kptr_restrict
354554.291 ops/s
# Warmup Iteration   3: 352376.514 ops/s
# Warmup Iteration   4: 347945.094 ops/s
# Warmup Iteration   5: 351992.122 ops/s
Iteration   1: 352239.836 ops/s
Iteration   2: 352150.592 ops/s
Iteration   3: 352232.863 ops/s
Iteration   4: 350266.656 ops/s
Iteration   5: 350152.778 ops/s

# Run progress: 86.67% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: 354393.131 ops/s
# Warmup Iteration   2: 355924.279 ops/s
# Warmup Iteration   3: 351537.936 ops/s
# Warmup Iteration   4: 351937.559 ops/s
# Warmup Iteration   5: 352140.750 ops/s
Iteration   1: 351377.289 ops/s
Iteration   2: 350261.420 ops/s
Iteration   3: 351898.938 ops/s
Iteration   4: 351828.143 ops/s
Iteration   5: 351636.473 ops/s

# Run progress: 93.33% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 348798.249 ops/s
# Warmup Iteration   2: 350257.779 ops/s
# Warmup Iteration   3: 346573.879 ops/s
# Warmup Iteration   4: 350156.565 ops/s
# Warmup Iteration   5: 352686.269 ops/s
Iteration   1: 352622.479 ops/s
Iteration   2: 349934.404 ops/s
Iteration   3: 350670.500 ops/s
Iteration   4: 352632.550 ops/s
Iteration   5: 353387.971 ops/s


Result "org.sample.MyBenchmark.splitableRandom":
  351715.099 ±(99.9%) 1097.496 ops/s [Average]
  (min, avg, max) = (348801.036, 351715.099, 354349.284), stdev = 1465.126
  CI (99.9%): [350617.603, 352812.595] (assumes normal distribution)


# Run complete. Total time: 00:25:03

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                     Mode  Cnt       Score      Error  Units
MyBenchmark.positiveBounded  thrpt   25  432769.595 ±  857.063  ops/s
MyBenchmark.random           thrpt   25   99060.899 ±  335.553  ops/s
MyBenchmark.splitableRandom  thrpt   25  351715.099 ± 1097.496  ops/s
```

### Flame Graphs

#### java.util.Random

![](random-forward.png)
![](random-reverse.png)

#### java.util.SplittableRandom

![](splittable-forward.png)
![](splittable-reverse.png)
