package de.triplet.gradle.play

class PlayPublisherPluginExtension {

    private String serviceAccountEmail

    // TODO: read application ID from merged manifest
    private String applicationId

    private File pk12File

    void setServiceAccountEmail(String email) {
        serviceAccountEmail = email
    }

    def getServiceAccountEmail() {
        return serviceAccountEmail
    }

    void setPk12File(File file) {
        pk12File = file
    }

    def getPk12File() {
        return pk12File
    }

    void setApplicationId(String appId) {
        applicationId = appId
    }

    def getApplicationId() {
        return applicationId
    }

}