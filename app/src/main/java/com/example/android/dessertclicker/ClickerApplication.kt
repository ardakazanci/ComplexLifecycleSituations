package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

class ClickerApplication : Application() {
    // Application tüm uygulama contex'ini bilir.
    // Timber ' ı tüm uygulama kısımlarında kullanacağımız için burada başlattık.
    // Varsayılan Application sınıfı yerine bu sınıfımızı kullanabilmek için AndroidManifest.xml dosyasında
    // belirtmemiz gerekir.
    // bu işlemleri Application sınıfında yapmama sebebim, güvenilirlik.
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}