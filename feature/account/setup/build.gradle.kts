plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
}

android {
    namespace = "app.k9mail.feature.account.setup"
    resourcePrefix = "account_setup_"
}

dependencies {
    implementation(projects.core.ui.compose.designsystem)
}
