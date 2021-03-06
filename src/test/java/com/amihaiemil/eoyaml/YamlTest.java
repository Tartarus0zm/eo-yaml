/**
 * Copyright (c) 2016-2017, Mihai Emil Andronache
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 *  list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 * Neither the name of the copyright holder nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */
package com.amihaiemil.eoyaml;

import java.io.ByteArrayInputStream;
import java.io.File;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Unit tests for {@link Yaml}.
 * @author Mihai Andronache (amihaiemil@gmail.com)
 * @version $Id$
 * @since 1.0.0
 */
public final class YamlTest {

    /**
     * Yaml can create a YamlMappingBuilder.
     */
    @Test
    public void createsYamlMappingBuilder() {
        MatcherAssert.assertThat(
            Yaml.createYamlMappingBuilder(), Matchers.notNullValue()
        );
    }
    
    /**
     * Yaml can create a YamlSequenceBuilder.
     */
    @Test
    public void createsYamlSequenceBuilder() {
        MatcherAssert.assertThat(
            Yaml.createYamlSequenceBuilder(), Matchers.notNullValue()
        );
    }
    
    /**
     * Yaml can create a YamlInput from a File.
     * @throws Exception if something goes wrong
     */
    @Test
    public void createsYamlInputFromFile() throws Exception {
        MatcherAssert.assertThat(
            Yaml.createYamlInput(
                new File("src/test/resources/simpleMapping.yml")
            ),
            Matchers.notNullValue()
        );
    }

    /**
     * Yaml can create a YamlInput from an InputStream.
     */
    @Test
    public void createsYamlInputFromInputStream() {
        MatcherAssert.assertThat(
            Yaml.createYamlInput(
                new ByteArrayInputStream("yaml: test".getBytes())
            ),
            Matchers.notNullValue()
        );
    }
    
    /**
     * Yaml can create a YamlInput from a String.
     */
    @Test
    public void createsYamlInputFromString() {
        MatcherAssert.assertThat(
            Yaml.createYamlInput("yaml: test"), Matchers.notNullValue()
        );
    }
}
