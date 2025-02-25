package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) {
            return _CloudMoon!!
        }
        _CloudMoon = ImageVector.Builder(
            name = "CloudMoon",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15.502f)
                curveTo(18.651f, 14.522f, 17f, 12.204f, 17f, 9.5f)
                curveTo(17f, 6.798f, 18.653f, 4.481f, 21f, 3.5f)
                curveTo(20.23f, 3.179f, 19.386f, 3f, 18.5f, 3f)
                curveTo(15.798f, 3f, 13.481f, 4.649f, 12.5f, 6.996f)
                moveTo(6.9f, 21f)
                curveTo(4.746f, 21f, 3f, 19.289f, 3f, 17.178f)
                curveTo(3f, 15.429f, 4.3f, 13.813f, 6.25f, 13.5f)
                curveTo(6.862f, 12.062f, 8.309f, 11f, 9.998f, 11f)
                curveTo(12.161f, 11f, 13.929f, 12.659f, 14.05f, 14.75f)
                curveTo(15.198f, 15.246f, 16f, 16.465f, 16f, 17.784f)
                curveTo(16f, 19.56f, 14.545f, 21f, 12.75f, 21f)
                lineTo(6.9f, 21f)
                close()
            }
        }.build()

        return _CloudMoon!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoon: ImageVector? = null
