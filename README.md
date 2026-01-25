## 🚀 Run Commands (Gradle Tasks)

- `.\gradlew runClient` — Launches the standard **Client** (includes client-side and common code).
- `.\gradlew runServer` — Launches the dedicated **Server** (includes server-side and common code).
- `.\gradlew runTest` — Launches the **Client** but also loads server-side code (used for full integration testing).

## ⚠️ WARNING

Make sure to run:

```bash
.\gradlew clean
```

whenever you switch between

```bash
.\gradlew runClient
.\gradlew build
```

and vice versa.

In the current version, there are observed issues with `mods.toml` in the built file.