package org.jfrog.teamcity.server.project.maven;

import org.jfrog.teamcity.server.project.ReleaseManagementConfigModel;

/**
 * @author Noam Y. Tenne
 */
public class MavenReleaseManagementConfigModel extends ReleaseManagementConfigModel {

    @Override
    public String getDefaultReleaseBranch() {
        StringBuilder defaultTagUrlBuilder = new StringBuilder(getVcsBranchBaseUrlOrName());
        return defaultTagUrlBuilder.append(rootArtifactId).append("-").append(getReleaseVersion()).toString();
    }

    @Override
    public String getDefaultTagUrl() {
        StringBuilder defaultTagUrlBuilder = new StringBuilder(getVcsTagBaseUrlOrName());
        return defaultTagUrlBuilder.append(rootArtifactId).append("-").append(getReleaseVersion()).toString();
    }
}
