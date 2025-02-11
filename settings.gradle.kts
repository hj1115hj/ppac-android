pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PPAC"
include(":app")
include(":core:data")
include(":core:domain")
include(":core:designsystem")
include(":core:common:android")
include(":core:common:kotlin")
include(":core:remote")
include(":feature:sample")
include(":core:navigator")
