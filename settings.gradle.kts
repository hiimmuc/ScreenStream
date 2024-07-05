pluginManagement {
    repositories.google()
    repositories.mavenCentral()
    repositories.gradlePluginPortal()
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories.google()
    repositories.mavenCentral()
}

rootProject.name = "ScreenStream"

include(":common")
include(":mjpeg")
include(":app")