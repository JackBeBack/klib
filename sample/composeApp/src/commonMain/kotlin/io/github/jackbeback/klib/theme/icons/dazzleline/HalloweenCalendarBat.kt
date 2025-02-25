package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenCalendarBat: ImageVector
    get() {
        if (_HalloweenCalendarBat != null) {
            return _HalloweenCalendarBat!!
        }
        _HalloweenCalendarBat = ImageVector.Builder(
            name = "HalloweenCalendarBat",
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
                moveTo(7f, 5f)
                verticalLineTo(3f)
                moveTo(17f, 5f)
                verticalLineTo(3f)
                moveTo(10.799f, 11.286f)
                curveTo(9.473f, 11.286f, 8.397f, 10.262f, 8.397f, 9f)
                curveTo(6.596f, 10.143f, 6f, 12.715f, 6f, 14.485f)
                curveTo(6.193f, 14.448f, 6.392f, 14.429f, 6.596f, 14.429f)
                curveTo(7.621f, 14.429f, 8.527f, 14.918f, 9.069f, 15.665f)
                curveTo(9.378f, 15.428f, 9.771f, 15.286f, 10.199f, 15.286f)
                curveTo(11.193f, 15.286f, 12f, 16.053f, 12f, 17f)
                curveTo(12f, 16.053f, 12.807f, 15.286f, 13.801f, 15.286f)
                curveTo(14.229f, 15.286f, 14.622f, 15.428f, 14.931f, 15.665f)
                curveTo(15.473f, 14.918f, 16.379f, 14.429f, 17.404f, 14.429f)
                curveTo(17.608f, 14.429f, 17.808f, 14.448f, 18f, 14.485f)
                curveTo(18f, 12.715f, 17.404f, 10.143f, 15.603f, 9f)
                curveTo(15.603f, 10.263f, 14.528f, 11.286f, 13.201f, 11.286f)
                verticalLineTo(9f)
                lineTo(12.601f, 10.143f)
                horizontalLineTo(11.399f)
                lineTo(10.799f, 9f)
                verticalLineTo(11.286f)
                close()
                moveTo(6.2f, 21f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 21f, 19.48f, 21f, 19.908f, 20.782f)
                curveTo(20.284f, 20.59f, 20.59f, 20.284f, 20.782f, 19.908f)
                curveTo(21f, 19.48f, 21f, 18.92f, 21f, 17.8f)
                verticalLineTo(8.2f)
                curveTo(21f, 7.08f, 21f, 6.52f, 20.782f, 6.092f)
                curveTo(20.59f, 5.716f, 20.284f, 5.41f, 19.908f, 5.218f)
                curveTo(19.48f, 5f, 18.92f, 5f, 17.8f, 5f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 5f, 4.52f, 5f, 4.092f, 5.218f)
                curveTo(3.716f, 5.41f, 3.41f, 5.716f, 3.218f, 6.092f)
                curveTo(3f, 6.52f, 3f, 7.08f, 3f, 8.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                close()
            }
        }.build()

        return _HalloweenCalendarBat!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenCalendarBat: ImageVector? = null
