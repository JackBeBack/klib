package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudShowers: ImageVector
    get() {
        if (_CloudShowers != null) {
            return _CloudShowers!!
        }
        _CloudShowers = ImageVector.Builder(
            name = "CloudShowers",
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
                moveTo(19.328f, 16f)
                curveTo(20.348f, 15.175f, 21f, 13.912f, 21f, 12.497f)
                curveTo(21f, 10.65f, 19.889f, 8.945f, 18.3f, 8.25f)
                curveTo(18.132f, 5.323f, 15.684f, 3f, 12.689f, 3f)
                curveTo(10.351f, 3f, 8.347f, 4.486f, 7.5f, 6.5f)
                curveTo(4.8f, 6.938f, 3f, 9.2f, 3f, 11.649f)
                curveTo(3f, 13.161f, 3.633f, 14.527f, 4.651f, 15.5f)
                moveTo(8f, 18f)
                verticalLineTo(20f)
                moveTo(8f, 12f)
                verticalLineTo(14f)
                moveTo(12f, 19f)
                verticalLineTo(21f)
                moveTo(16f, 18f)
                verticalLineTo(20f)
                moveTo(16f, 12f)
                verticalLineTo(14f)
                moveTo(12f, 13f)
                verticalLineTo(15f)
            }
        }.build()

        return _CloudShowers!!
    }

@Suppress("ObjectPropertyName")
private var _CloudShowers: ImageVector? = null
