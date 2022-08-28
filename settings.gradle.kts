pluginManagement {
	repositories {
		maven { url = uri("https://repo.spring.io/release") }
		gradlePluginPortal()
	}
}

rootProject.name = "demo"

include("common")
include("command")
include("query")
