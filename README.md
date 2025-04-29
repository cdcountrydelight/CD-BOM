# 📦 CD BOM

The **CD BOM** (Bill of Materials) provides a centralized way to manage versions for a set of internally developed CD libraries. By using the BOM in your project, you can ensure compatibility and simplify dependency management across all supported libraries.

![Platform](https://img.shields.io/badge/Platform-Android-green.svg)
![Language](https://img.shields.io/badge/Language-Kotlin-orange.svg)
[![](https://jitpack.io/v/cdcountrydelight/CD-BOM.svg)](https://jitpack.io/#cdcountrydelight/CD-BOM)
---

## 🚀 Why Use the CD BOM?

- ✅ Simplified dependency declarations
- ✅ Centralized version control
- ✅ Ensures compatibility between all CD libraries
- ✅ Cleaner `build.gradle` files

---

## 📥 How to Use

1. Add it in your `settings.gradle` file at the end of repositories:

    ```gradle
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            maven(url = "https://jitpack.io")
        }
    }
    ```

2. Add the BOM to your dependencies block:

```kotlin
dependencies {
    implementation(platform("com.github.cdcountrydelight:CD-BOM:<version>"))
    // Now add individual libraries without specifying versions
    implementation("com.github.cdcountrydelight:CD-Function-Helper")
    implementation("com.github.cdcountrydelight:CD-Logger")
    implementation("com.github.cdcountrydelight:CDNamingConventions")
    implementation("com.github.cdcountrydelight:CDPreferencesHelper")
    implementation("com.github.cdcountrydelight:commonutils")
}

```
> ℹ️ Replace `<version>` with the latest release of the BOM.

## 📦 Included Libraries

| Library                      | Artifact ID               | Version   |
|-----------------------------|---------------------------|-----------|
| CD Function Helper          | `CD-Function-Helper`      | `1.0.0`   |
| CD Logger                   | `CD-Logger`               | `1.0.16`  |
| CD Naming Conventions       | `CDNamingConventions`     | `1.1.2`   |
| CD Preference Helper        | `CDPreferencesHelper`     | `1.0.6`   |
| Common Utils *(Deprecated)* | `commonutils`             | `1.0.0`   |