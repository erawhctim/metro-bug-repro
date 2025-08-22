

- `AppGraph.Factory` accepts an `ApplicationModule` instance
- `ApplicationModule` is a Dagger module that includes `AppInfoModule` in its annotation.
- `ExtensionGraph` extends `AppGraph`

`ExtensionScreen` creates an `ExtensionGraph` instance using the `AppGraph.Factory`, but can't seem to access the `AppInfo` provider fn. from `AppInfoModule`.