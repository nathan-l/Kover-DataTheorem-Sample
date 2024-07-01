package kotlinx.kover.test.android

import android.os.Bundle
import android.app.Activity
import com.datatheorem.mobileprotect.MobileProtect

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileProtect.init(this.application, R.xml.mobileprotect)
    }

}
