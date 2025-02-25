package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "ArrowLeft",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.685f, 7.332f)
                curveTo(8.075f, 6.941f, 8.075f, 6.308f, 7.685f, 5.918f)
                curveTo(7.294f, 5.527f, 6.661f, 5.527f, 6.271f, 5.918f)
                lineTo(1.605f, 10.583f)
                curveTo(0.824f, 11.364f, 0.824f, 12.631f, 1.605f, 13.412f)
                lineTo(6.273f, 18.08f)
                curveTo(6.664f, 18.471f, 7.297f, 18.471f, 7.688f, 18.08f)
                curveTo(8.078f, 17.69f, 8.078f, 17.056f, 7.688f, 16.666f)
                lineTo(4.022f, 13f)
                lineTo(22f, 13f)
                curveTo(22.552f, 13f, 23f, 12.552f, 23f, 12f)
                curveTo(23f, 11.448f, 22.552f, 11f, 22f, 11f)
                lineTo(4.017f, 11f)
                lineTo(7.685f, 7.332f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null
