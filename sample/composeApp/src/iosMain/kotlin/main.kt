import androidx.compose.ui.window.ComposeUIViewController
import io.github.jackbeback.klib.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
