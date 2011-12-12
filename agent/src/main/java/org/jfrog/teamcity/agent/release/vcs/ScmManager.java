/*
 * Copyright (C) 2011 JFrog Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jfrog.teamcity.agent.release.vcs;

import java.io.File;
import java.io.IOException;

/**
 * An interface for SCM actions required in the release process.
 *
 * @author Yossi Shaul
 */
public interface ScmManager {

    String COMMENT_PREFIX = "[artifactory-release] ";

    void commitWorkingCopy(File workingCopy, String commitMessage) throws IOException, InterruptedException;

    void createTag(File workingCopy, String tagUrl, String commitMessage)
            throws IOException, InterruptedException;
}