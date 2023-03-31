Comparing Random and SplittableRandom for generating a lot of random ints from a single thread


### JMH output
```
# JMH version: 1.36
# VM version: JDK 19.0.2, OpenJDK 64-Bit Server VM, 19.0.2+7
# VM invoker: /home/roby/.sdkman/candidates/java/19.0.2-zulu/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.random

# Run progress: 0.00% complete, ETA 00:06:45
# Fork: 1 of 3
# Warmup Iteration   1: 88662.444 ops/s
# Warmup Iteration   2: 93647.582 ops/s
# Warmup Iteration   3: 101850.912 ops/s
# Warmup Iteration   4: 98346.368 ops/s
# Warmup Iteration   5: 99002.821 ops/s
Iteration   1: 100080.410 ops/s
Iteration   2: 99240.514 ops/s
Iteration   3: 99163.524 ops/s

# Run progress: 11.11% complete, ETA 00:06:01
# Fork: 2 of 3
# Warmup Iteration   1: 88477.736 ops/s
# Warmup Iteration   2: 87874.785 ops/s
# Warmup Iteration   3: 99555.126 ops/s
# Warmup Iteration   4: 99154.375 ops/s
# Warmup Iteration   5: 99162.340 ops/s
Iteration   1: 99221.080 ops/s
Iteration   2: 99221.409 ops/s
Iteration   3: 99216.457 ops/s

# Run progress: 22.22% complete, ETA 00:05:16
# Fork: 3 of 3
# Warmup Iteration   1: 88646.907 ops/s
# Warmup Iteration   2: 85937.228 ops/s
# Warmup Iteration   3: 99152.954 ops/s
# Warmup Iteration   4: 99098.070 ops/s
# Warmup Iteration   5: 98998.106 ops/s
Iteration   1: 99173.573 ops/s
Iteration   2: 98880.041 ops/s
Iteration   3: 99178.286 ops/s


Result "org.sample.MyBenchmark.random":
  99263.922 ±(99.9%) 546.476 ops/s [Average]
  (min, avg, max) = (98880.041, 99263.922, 100080.410), stdev = 325.199
  CI (99.9%): [98717.445, 99810.398] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 19.0.2, OpenJDK 64-Bit Server VM, 19.0.2+7
# VM invoker: /home/roby/.sdkman/candidates/java/19.0.2-zulu/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.randomCharacters

# Run progress: 33.33% complete, ETA 00:04:31
# Fork: 1 of 3
# Warmup Iteration   1: 679213.826 ops/s
# Warmup Iteration   2: 623067.646 ops/s
# Warmup Iteration   3: 622898.392 ops/s
# Warmup Iteration   4: 622809.186 ops/s
# Warmup Iteration   5: 617613.160 ops/s
Iteration   1: 621768.320 ops/s
Iteration   2: 621625.629 ops/s
Iteration   3: 627655.577 ops/s

# Run progress: 44.44% complete, ETA 00:03:45
# Fork: 2 of 3
# Warmup Iteration   1: 699983.449 ops/s
# Warmup Iteration   2: 624251.692 ops/s
# Warmup Iteration   3: 622589.337 ops/s
# Warmup Iteration   4: 618780.304 ops/s
# Warmup Iteration   5: 622830.895 ops/s
Iteration   1: 628653.097 ops/s
Iteration   2: 623674.674 ops/s
Iteration   3: 623263.904 ops/s

# Run progress: 55.56% complete, ETA 00:03:00
# Fork: 3 of 3
# Warmup Iteration   1: 679127.830 ops/s
# Warmup Iteration   2: 623742.531 ops/s
# Warmup Iteration   3: 624635.304 ops/s
# Warmup Iteration   4: 640533.164 ops/s
# Warmup Iteration   5: 640112.289 ops/s
Iteration   1: 638835.329 ops/s
Iteration   2: 627392.622 ops/s
Iteration   3: 634192.483 ops/s


Result "org.sample.MyBenchmark.randomCharacters":
  627451.293 ±(99.9%) 9844.558 ops/s [Average]
  (min, avg, max) = (621625.629, 627451.293, 638835.329), stdev = 5858.339
  CI (99.9%): [617606.735, 637295.851] (assumes normal distribution)


# JMH version: 1.36
# VM version: JDK 19.0.2, OpenJDK 64-Bit Server VM, 19.0.2+7
# VM invoker: /home/roby/.sdkman/candidates/java/19.0.2-zulu/bin/java
# VM options: <none>
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 3 s each
# Measurement: 3 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.sample.MyBenchmark.splitableRandom

# Run progress: 66.67% complete, ETA 00:02:15
# Fork: 1 of 3
# Warmup Iteration   1: 241309.257 ops/s
# Warmup Iteration   2: 217192.573 ops/s
# Warmup Iteration   3: 292618.958 ops/s
# Warmup Iteration   4: 293878.966 ops/s
# Warmup Iteration   5: 288540.555 ops/s
Iteration   1: 288660.921 ops/s
Iteration   2: 293138.188 ops/s
Iteration   3: 290993.414 ops/s

# Run progress: 77.78% complete, ETA 00:01:30
# Fork: 2 of 3
# Warmup Iteration   1: 237255.063 ops/s
# Warmup Iteration   2: 224852.009 ops/s
# Warmup Iteration   3: 283301.126 ops/s
# Warmup Iteration   4: 298065.640 ops/s
# Warmup Iteration   5: 295786.616 ops/s
Iteration   1: 291113.452 ops/s
Iteration   2: 296409.591 ops/s
Iteration   3: 310065.610 ops/s

# Run progress: 88.89% complete, ETA 00:00:45
# Fork: 3 of 3
# Warmup Iteration   1: 242798.294 ops/s
# Warmup Iteration   2: 237406.801 ops/s
# Warmup Iteration   3: 296468.072 ops/s
# Warmup Iteration   4: 290702.715 ops/s
# Warmup Iteration   5: 296269.002 ops/s
Iteration   1: 295712.590 ops/s
Iteration   2: 295192.826 ops/s
Iteration   3: 304146.866 ops/s


Result "org.sample.MyBenchmark.splitableRandom":
  296159.273 ±(99.9%) 11518.686 ops/s [Average]
  (min, avg, max) = (288660.921, 296159.273, 310065.610), stdev = 6854.585
  CI (99.9%): [284640.587, 307677.959] (assumes normal distribution)


# Run complete. Total time: 00:06:46

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                      Mode  Cnt       Score       Error  Units
MyBenchmark.random            thrpt    9   99263.922 ±   546.476  ops/s
MyBenchmark.randomCharacters  thrpt    9  627451.293 ±  9844.558  ops/s
MyBenchmark.splitableRandom   thrpt    9  296159.273 ± 11518.686  ops/s
```

### Flame Graphs

#### java.util.Random

![](random-forward.png)
![](random-reverse.png)

#### java.util.SplittableRandom

![](splittable-forward.png)
![](splittable-reverse.png)
