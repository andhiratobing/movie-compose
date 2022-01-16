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
    ":libraries:abstraction",
    ":features:movie",
    ":features:tvshows",
)
