/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.Random;
import java.util.SplittableRandom;

public class MyBenchmark {

    @State(Scope.Thread)
    public static class BenchmarkState {
        final Random random = new Random(0L);
        final SplittableRandom splittableRandom = new SplittableRandom(0L);
        final CharacterRandom characterRandom = new CharacterRandom("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdef");
        final byte[] payload = new byte[1024];

    }

    @Benchmark
    public void random(BenchmarkState state) {
        for (int j = 0; j < state.payload.length; ++j) {
            state.payload[j] = (byte) (state.random.nextInt(26) + 65);
        }
    }

    @Benchmark
    public void splitableRandom(BenchmarkState state) {
        for (int j = 0; j < state.payload.length; ++j) {
            state.payload[j] = (byte) (state.splittableRandom.nextInt(26) + 65);
        }
    }

    @Benchmark
    public void randomCharacters(BenchmarkState state) {
        state.characterRandom.nextBytes(state.payload);
    }

}
