package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SchoolFlag: ImageVector
    get() {
        if (_SchoolFlag != null) {
            return _SchoolFlag!!
        }
        _SchoolFlag = ImageVector.Builder(
            name = "SchoolFlag",
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
                moveTo(6f, 15.5f)
                horizontalLineTo(7f)
                moveTo(6f, 18.5f)
                horizontalLineTo(7f)
                moveTo(17f, 18.5f)
                horizontalLineTo(18f)
                moveTo(17f, 15.5f)
                horizontalLineTo(18f)
                moveTo(10f, 22f)
                verticalLineTo(18f)
                curveTo(10f, 16.896f, 10.895f, 16f, 12f, 16f)
                curveTo(13.105f, 16f, 14f, 16.896f, 14f, 18f)
                verticalLineTo(22f)
                moveTo(12f, 5f)
                horizontalLineTo(16.84f)
                curveTo(16.896f, 5f, 16.924f, 5f, 16.945f, 4.989f)
                curveTo(16.964f, 4.98f, 16.979f, 4.964f, 16.989f, 4.945f)
                curveTo(17f, 4.924f, 17f, 4.896f, 17f, 4.84f)
                verticalLineTo(2.16f)
                curveTo(17f, 2.104f, 17f, 2.076f, 16.989f, 2.055f)
                curveTo(16.979f, 2.036f, 16.964f, 2.02f, 16.945f, 2.011f)
                curveTo(16.924f, 2f, 16.896f, 2f, 16.84f, 2f)
                horizontalLineTo(12.16f)
                curveTo(12.104f, 2f, 12.076f, 2f, 12.055f, 2.011f)
                curveTo(12.036f, 2.02f, 12.021f, 2.036f, 12.011f, 2.055f)
                curveTo(12f, 2.076f, 12f, 2.104f, 12f, 2.16f)
                verticalLineTo(5f)
                close()
                moveTo(12f, 5f)
                verticalLineTo(7.691f)
                moveTo(12.03f, 12.25f)
                horizontalLineTo(12.038f)
                moveTo(12f, 7.691f)
                curveTo(12.195f, 7.691f, 12.389f, 7.719f, 12.578f, 7.776f)
                curveTo(13.006f, 7.905f, 13.384f, 8.246f, 14.141f, 8.927f)
                lineTo(17f, 11.5f)
                lineTo(18.576f, 11.894f)
                curveTo(19.443f, 12.111f, 19.876f, 12.219f, 20.199f, 12.461f)
                curveTo(20.483f, 12.674f, 20.706f, 12.959f, 20.844f, 13.287f)
                curveTo(21f, 13.659f, 21f, 14.105f, 21f, 14.999f)
                verticalLineTo(18.8f)
                curveTo(21f, 19.92f, 21f, 20.48f, 20.782f, 20.908f)
                curveTo(20.59f, 21.285f, 20.284f, 21.59f, 19.908f, 21.782f)
                curveTo(19.48f, 22f, 18.92f, 22f, 17.8f, 22f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 22f, 4.52f, 22f, 4.092f, 21.782f)
                curveTo(3.716f, 21.59f, 3.41f, 21.285f, 3.218f, 20.908f)
                curveTo(3f, 20.48f, 3f, 19.92f, 3f, 18.8f)
                verticalLineTo(14.999f)
                curveTo(3f, 14.105f, 3f, 13.659f, 3.156f, 13.287f)
                curveTo(3.294f, 12.959f, 3.517f, 12.674f, 3.801f, 12.461f)
                curveTo(4.124f, 12.219f, 4.557f, 12.111f, 5.424f, 11.894f)
                lineTo(7f, 11.5f)
                lineTo(9.859f, 8.927f)
                curveTo(10.616f, 8.246f, 10.994f, 7.905f, 11.422f, 7.776f)
                curveTo(11.611f, 7.719f, 11.805f, 7.691f, 12f, 7.691f)
                close()
                moveTo(12.03f, 13f)
                curveTo(11.616f, 13f, 11.28f, 12.664f, 11.28f, 12.25f)
                curveTo(11.28f, 11.836f, 11.616f, 11.5f, 12.03f, 11.5f)
                curveTo(12.444f, 11.5f, 12.78f, 11.836f, 12.78f, 12.25f)
                curveTo(12.78f, 12.664f, 12.444f, 13f, 12.03f, 13f)
                close()
            }
        }.build()

        return _SchoolFlag!!
    }

@Suppress("ObjectPropertyName")
private var _SchoolFlag: ImageVector? = null
