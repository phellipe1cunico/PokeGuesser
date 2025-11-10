//
// ARQUIVO: build.gradle.kts (RAIZ DO PROJETO)
//
plugins {
    // Define os plugins que o app VAI USAR
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.android.application") version "8.4.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false

    // ESTA LINHA ESTAVA FALTANDO (eu mandei remover antes, o que foi um erro meu)
    id("org.jetbrains.kotlin.plugin.compose") version "1.9.23" apply false
}