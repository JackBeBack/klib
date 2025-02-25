package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Code",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14.962f, 5.275f)
                curveTo(15.113f, 4.744f, 14.806f, 4.19f, 14.275f, 4.038f)
                curveTo(13.744f, 3.887f, 13.19f, 4.194f, 13.038f, 4.725f)
                lineTo(9.038f, 18.725f)
                curveTo(8.887f, 19.256f, 9.194f, 19.81f, 9.725f, 19.962f)
                curveTo(10.256f, 20.113f, 10.81f, 19.806f, 10.962f, 19.275f)
                lineTo(14.962f, 5.275f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.799f, 7.399f)
                curveTo(6.131f, 7.84f, 6.043f, 8.467f, 5.601f, 8.799f)
                lineTo(2.409f, 11.201f)
                curveTo(1.877f, 11.601f, 1.877f, 12.399f, 2.409f, 12.799f)
                lineTo(5.601f, 15.201f)
                curveTo(6.043f, 15.533f, 6.131f, 16.16f, 5.799f, 16.601f)
                curveTo(5.467f, 17.043f, 4.84f, 17.131f, 4.399f, 16.799f)
                lineTo(1.207f, 14.397f)
                curveTo(-0.389f, 13.197f, -0.389f, 10.803f, 1.207f, 9.603f)
                lineTo(4.399f, 7.201f)
                curveTo(4.84f, 6.869f, 5.467f, 6.957f, 5.799f, 7.399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.201f, 16.601f)
                curveTo(17.869f, 16.16f, 17.958f, 15.533f, 18.399f, 15.201f)
                lineTo(21.591f, 12.799f)
                curveTo(22.123f, 12.399f, 22.123f, 11.601f, 21.591f, 11.201f)
                lineTo(18.399f, 8.799f)
                curveTo(17.958f, 8.467f, 17.869f, 7.84f, 18.201f, 7.399f)
                curveTo(18.533f, 6.957f, 19.16f, 6.869f, 19.601f, 7.201f)
                lineTo(22.794f, 9.603f)
                curveTo(24.389f, 10.803f, 24.389f, 13.197f, 22.794f, 14.397f)
                lineTo(19.601f, 16.799f)
                curveTo(19.16f, 17.131f, 18.533f, 17.043f, 18.201f, 16.601f)
                close()
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null
