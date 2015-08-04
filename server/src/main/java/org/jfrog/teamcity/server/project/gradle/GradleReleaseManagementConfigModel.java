package org.jfrog.teamcity.server.project.gradle;

import org.jfrog.teamcity.server.project.ReleaseManagementConfigModel;

/**
 * @author Noam Y. Tenne
 */
public class GradleReleaseManagementConfigModel extends ReleaseManagementConfigModel {

    @Override
    public String getDefaultTagUrl() {
        return new StringBuilder(getVcsTagBaseUrlOrName()).append(getReleaseVersion()).toString();
    }

    @Override
    public String getDefaultReleaseBranch() {
    	return new StringBuilder(getVcsBranchBaseUrlOrName()).append(getReleaseVersion()).toString();
    }
}
