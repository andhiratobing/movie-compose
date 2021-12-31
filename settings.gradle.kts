dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "MovieCompose"
include(
    ":app",
    ":libraries:themes",
    ":libraries:components",
    ":features:movie",
    ":features:tvshows"
)
