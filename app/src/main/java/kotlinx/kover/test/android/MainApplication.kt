package kotlinx.kover.test.android

import android.app.Application
import com.datatheorem.mobileprotect.MobileProtect

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MobileProtect.init(this, R.xml.mobileprotect)
    }
}